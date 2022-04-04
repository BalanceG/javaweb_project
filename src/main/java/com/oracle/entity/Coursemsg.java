package com.oracle.entity;

import java.io.Serializable;

/**
 * (Coursemsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:28
 */
public class Coursemsg implements Serializable {
    private static final long serialVersionUID = 682337530655848661L;
    /**
     * 课程id
     */
    private Integer kid;
    /**
     * 课程类型，想用enum,但是没找到，原因不清楚，也许是因为版本低
     */
    private String ktype;
    /**
     * 课程名称
     */
    private String kname;
    /**
     * 哪一本书的课程，图书表的id
     */
    private Integer bookmsgId;
    
    private String cCol1;
    
    private String cCol2;
    
    private String cCol3;
    
    private String cCol4;
    
    private String cCol5;


    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKtype() {
        return ktype;
    }

    public void setKtype(String ktype) {
        this.ktype = ktype;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public Integer getBookmsgId() {
        return bookmsgId;
    }

    public void setBookmsgId(Integer bookmsgId) {
        this.bookmsgId = bookmsgId;
    }

    public String getCCol1() {
        return cCol1;
    }

    public void setCCol1(String cCol1) {
        this.cCol1 = cCol1;
    }

    public String getCCol2() {
        return cCol2;
    }

    public void setCCol2(String cCol2) {
        this.cCol2 = cCol2;
    }

    public String getCCol3() {
        return cCol3;
    }

    public void setCCol3(String cCol3) {
        this.cCol3 = cCol3;
    }

    public String getCCol4() {
        return cCol4;
    }

    public void setCCol4(String cCol4) {
        this.cCol4 = cCol4;
    }

    public String getCCol5() {
        return cCol5;
    }

    public void setCCol5(String cCol5) {
        this.cCol5 = cCol5;
    }

}

