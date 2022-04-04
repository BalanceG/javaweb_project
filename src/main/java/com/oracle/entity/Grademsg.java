package com.oracle.entity;

import java.io.Serializable;

/**
 * (Grademsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:28
 */
public class Grademsg implements Serializable {
    private static final long serialVersionUID = -87355487137920463L;
    /**
     * 年级表id
     */
    private Integer nid;
    /**
     * 年级名称
     */
    private String nname;
    
    private String gcol1;
    
    private String gcol2;
    
    private String gcol3;
    
    private String gcol4;
    /**
     * 年级顺序，想用tinyint,没找到
     */
    private Integer tSx;
    
    private String gcol5;


    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getGcol1() {
        return gcol1;
    }

    public void setGcol1(String gcol1) {
        this.gcol1 = gcol1;
    }

    public String getGcol2() {
        return gcol2;
    }

    public void setGcol2(String gcol2) {
        this.gcol2 = gcol2;
    }

    public String getGcol3() {
        return gcol3;
    }

    public void setGcol3(String gcol3) {
        this.gcol3 = gcol3;
    }

    public String getGcol4() {
        return gcol4;
    }

    public void setGcol4(String gcol4) {
        this.gcol4 = gcol4;
    }

    public Integer getTSx() {
        return tSx;
    }

    public void setTSx(Integer tSx) {
        this.tSx = tSx;
    }

    public String getGcol5() {
        return gcol5;
    }

    public void setGcol5(String gcol5) {
        this.gcol5 = gcol5;
    }

}

