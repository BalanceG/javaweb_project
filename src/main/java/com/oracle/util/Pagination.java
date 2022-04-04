package com.oracle.util;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.servlet.http.HttpServletRequest;

/**
 * 封装程序中所有的分页内容
 * 此分页工具类使用手册。
 * 1、service，方法返回 Pagination ，方法体代码如下
 * Pagination pagination = new Pagination();
 * //设置数据
 * pagination.setDatas(studentInfos);
 * //设置当前页码
 * pagination.setPageIndex(Integer.parseInt(pageIndex));
 * //设置每页大小
 * pagination.setPageSize(Integer.parseInt(pageSize));
 * //设置总条数
 * pagination.setTotleSize(count);
 * 2、servlet
 * //查询全部数据
 * Pagination pagination = service.queryAll2(pageIndex, pageSize);
 * //因为servlet是最清楚它自己的访问路径
 * pagination.setUrl("servlet/show2");
 * //因为pagination需要动态获取到 程序的访问绝对路径
 * //所以在此处进行传递
 * pagination.setRequest(request);
 * //将数据储存在request范围
 * request.setAttribute("pagination", pagination);
 * //请求转发到index.jsp，显示request范围中的数据即可
 * request.getRequestDispatcher("/index2.jsp").forward(request, response);
 * <p>
 * <p>
 * 3、jsp页面【不能是html页面】
 * ${pagination.showPagination}
 */
@Data
public class Pagination {
    //属性
    private Integer pageIndex; //当前第几页
    private Integer pageSize;//每页多少条
    private Integer totlePage; //共x页
    private Integer totleSize; //共x条
    private Object datas; //数据
    //json转换的时候排除这个属性
    @JSONField(serialize = false)
    private String url;//链接到的路径
    @JSONField(serialize = false)
    private HttpServletRequest request;

    //统一计算一共有多少页
    public Integer getTotlePage() {
        int totlePage = totleSize / pageSize;
        if (totleSize % pageSize != 0) {
            totlePage++;
        }
        return totlePage;
    }


    //方法


    /**
     * 显示分页条
     *
     * @return
     */
    public String getShowPagination() {

        this.totlePage = getTotlePage();

        if (url.equals("/")) {
            url = "";
        }


        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";


        //结果
        StringBuilder builder = new StringBuilder();

        //首页 上一页 下一页 尾页 【输入框 按钮】 共x条x页当前第x页
        //        				<a href="/?pageIndex=<%=currentPageInt-1%>">上一页</a>
        if (pageIndex == 1) {
            builder.append("<a >首页</a> ");
            builder.append("<a >上一页</a> ");

        } else {
            builder.append("<a href=\"" + basePath + url + "\">首页</a> ");
            builder.append("<a href=\"" + basePath + url + "?pageIndex=" + (pageIndex - 1) + "\">上一页</a> ");

        }

        if (pageIndex == totlePage) {
            builder.append("<a  >下一页</a> ");
            builder.append("<a  >尾页</a> ");

        } else {
            builder.append("<a href=\"" + basePath + url + "?pageIndex=" + (pageIndex + 1) + "\">下一页</a> ");
            builder.append("<a href=\"" + basePath + url + "?pageIndex=" + (totlePage) + "\">尾页</a> ");

        }

        builder.append("<form onsubmit='return checkFrom()' style=\"display: inline-table;\" action='' method='get'>");
        builder.append("<input id='pageIndex' style='width:50px' name='pageIndex' /> ");
        builder.append("<input type='submit' value='跳转'/> ");
        builder.append("</form>");

        String last = String.format(" 共%s条,共%s页,当前第%s页,每页%s条", totleSize, totlePage, pageIndex, pageSize);
        builder.append(last);

        builder.append("<script>");
        builder.append("    function checkFrom(){");
        builder.append("        let pindex= document.getElementById('pageIndex').value;");
        builder.append("        if(pindex>" + totlePage + " || pindex<1){");
        builder.append("            alert('最多只有" + totlePage + "页,最少从第1页跳转');");
        builder.append("            return false;");
        builder.append("        }");
        builder.append("        return true;");

        builder.append("}");

        builder.append(" </script>");


        return builder.toString();

    }

}
