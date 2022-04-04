package com.oracle.entity;

import java.io.Serializable;

/**
 * (Bookmsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:28
 */
public class Bookmsg implements Serializable {
    private static final long serialVersionUID = -85126490720067824L;
    /**
     * 图书表id
     */
    private Integer lid;
    /**
     * 图书名称
     */
    private String lname;
    /**
     * 图书图片
     */
    private String lPictre;
    /**
     * 这本书是哪一个类别的，类别表的id
     */
    private Integer btypemsgId;
    
    private String bCol1;
    
    private String bCol2;
    
    private String bCol3;
    
    private String bCol4;
    
    private String bCol5;


    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLPictre() {
        return lPictre;
    }

    public void setLPictre(String lPictre) {
        this.lPictre = lPictre;
    }

    public Integer getBtypemsgId() {
        return btypemsgId;
    }

    public void setBtypemsgId(Integer btypemsgId) {
        this.btypemsgId = btypemsgId;
    }

    public String getBCol1() {
        return bCol1;
    }

    public void setBCol1(String bCol1) {
        this.bCol1 = bCol1;
    }

    public String getBCol2() {
        return bCol2;
    }

    public void setBCol2(String bCol2) {
        this.bCol2 = bCol2;
    }

    public String getBCol3() {
        return bCol3;
    }

    public void setBCol3(String bCol3) {
        this.bCol3 = bCol3;
    }

    public String getBCol4() {
        return bCol4;
    }

    public void setBCol4(String bCol4) {
        this.bCol4 = bCol4;
    }

    public String getBCol5() {
        return bCol5;
    }

    public void setBCol5(String bCol5) {
        this.bCol5 = bCol5;
    }

}

