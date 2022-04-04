package com.oracle.entity;

import java.io.Serializable;

/**
 * (Ttsvoice)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:30
 */
public class Ttsvoice implements Serializable {
    private static final long serialVersionUID = 587810632670577298L;
    /**
     * 主键
     */
    private Integer ttid;
    /**
     * 词id
     */
    private Integer wordstoneId;
    /**
     * 路径
     */
    private String ttpath;
    
    private String tcol1;
    
    private String tcol2;
    
    private String tcol3;
    
    private String tcol4;
    
    private String tcol5;


    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getWordstoneId() {
        return wordstoneId;
    }

    public void setWordstoneId(Integer wordstoneId) {
        this.wordstoneId = wordstoneId;
    }

    public String getTtpath() {
        return ttpath;
    }

    public void setTtpath(String ttpath) {
        this.ttpath = ttpath;
    }

    public String getTcol1() {
        return tcol1;
    }

    public void setTcol1(String tcol1) {
        this.tcol1 = tcol1;
    }

    public String getTcol2() {
        return tcol2;
    }

    public void setTcol2(String tcol2) {
        this.tcol2 = tcol2;
    }

    public String getTcol3() {
        return tcol3;
    }

    public void setTcol3(String tcol3) {
        this.tcol3 = tcol3;
    }

    public String getTcol4() {
        return tcol4;
    }

    public void setTcol4(String tcol4) {
        this.tcol4 = tcol4;
    }

    public String getTcol5() {
        return tcol5;
    }

    public void setTcol5(String tcol5) {
        this.tcol5 = tcol5;
    }

}

