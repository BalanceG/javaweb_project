package com.oracle.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Usermsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:30
 */
public class Usermsg implements Serializable {
    private static final long serialVersionUID = 497037731628961164L;
    /**
     * 用户id
     */
    private Integer wxid;
    /**
     * 微信名称，长度自然不是固定的，变长字符串varchar
     */
    private String name;
    /**
     * 注册时间，没有使用datatime是因为没找到，timestamp的格式是YYYYMMDD HHMMSS,而且它不可以给长度
     */
    private Date createdate;
    
    private String ucol1;
    
    private String ucol2;
    
    private String ucol3;
    
    private String ucol4;
    
    private String ucol5;


    public Integer getWxid() {
        return wxid;
    }

    public void setWxid(Integer wxid) {
        this.wxid = wxid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUcol1() {
        return ucol1;
    }

    public void setUcol1(String ucol1) {
        this.ucol1 = ucol1;
    }

    public String getUcol2() {
        return ucol2;
    }

    public void setUcol2(String ucol2) {
        this.ucol2 = ucol2;
    }

    public String getUcol3() {
        return ucol3;
    }

    public void setUcol3(String ucol3) {
        this.ucol3 = ucol3;
    }

    public String getUcol4() {
        return ucol4;
    }

    public void setUcol4(String ucol4) {
        this.ucol4 = ucol4;
    }

    public String getUcol5() {
        return ucol5;
    }

    public void setUcol5(String ucol5) {
        this.ucol5 = ucol5;
    }

}

