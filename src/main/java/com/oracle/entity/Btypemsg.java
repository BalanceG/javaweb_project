package com.oracle.entity;

import java.io.Serializable;

/**
 * (Btypemsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:28
 */
public class Btypemsg implements Serializable {
    private static final long serialVersionUID = -23061508298677837L;
    /**
     * 类别表id
     */
    private Integer tid;
    /**
     * 代表一种状态，是否显示【上架下架】,想用enum,但没找到,这里手打，然后0来代表上架，1代表下架
     */
    private String tFlag;
    /**
     * 类别名称
     */
    private String tname;
    /**
     * 这个类别是哪一个年级的，年级表的id
     */
    private Integer grademsgId;
    
    private String bcol1;
    
    private String bcol2;
    
    private String bcol3;
    
    private String bcol4;
    
    private String bcol5;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTFlag() {
        return tFlag;
    }

    public void setTFlag(String tFlag) {
        this.tFlag = tFlag;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getGrademsgId() {
        return grademsgId;
    }

    public void setGrademsgId(Integer grademsgId) {
        this.grademsgId = grademsgId;
    }

    public String getBcol1() {
        return bcol1;
    }

    public void setBcol1(String bcol1) {
        this.bcol1 = bcol1;
    }

    public String getBcol2() {
        return bcol2;
    }

    public void setBcol2(String bcol2) {
        this.bcol2 = bcol2;
    }

    public String getBcol3() {
        return bcol3;
    }

    public void setBcol3(String bcol3) {
        this.bcol3 = bcol3;
    }

    public String getBcol4() {
        return bcol4;
    }

    public void setBcol4(String bcol4) {
        this.bcol4 = bcol4;
    }

    public String getBcol5() {
        return bcol5;
    }

    public void setBcol5(String bcol5) {
        this.bcol5 = bcol5;
    }

}

