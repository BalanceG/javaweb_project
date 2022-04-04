package com.oracle.entity;

import java.io.Serializable;

/**
 * (Adminmsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:24
 */
public class Adminmsg implements Serializable {
    private static final long serialVersionUID = -49077079824312023L;
    
    private Integer aid;
    
    private String aname;
    /**
     * 密码就定长吧，长度给个10
     */
    private String apass;
    
    private String acol1;
    
    private String acol2;
    
    private String acol3;
    
    private String acol4;
    
    private String acol5;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }

    public String getAcol1() {
        return acol1;
    }

    public void setAcol1(String acol1) {
        this.acol1 = acol1;
    }

    public String getAcol2() {
        return acol2;
    }

    public void setAcol2(String acol2) {
        this.acol2 = acol2;
    }

    public String getAcol3() {
        return acol3;
    }

    public void setAcol3(String acol3) {
        this.acol3 = acol3;
    }

    public String getAcol4() {
        return acol4;
    }

    public void setAcol4(String acol4) {
        this.acol4 = acol4;
    }

    public String getAcol5() {
        return acol5;
    }

    public void setAcol5(String acol5) {
        this.acol5 = acol5;
    }

}

