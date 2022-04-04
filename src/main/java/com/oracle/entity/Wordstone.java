package com.oracle.entity;

import java.io.Serializable;

/**
 * (Wordstone)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:30
 */
public class Wordstone implements Serializable {
    private static final long serialVersionUID = 730082439012310258L;
    /**
     * 组词表id
     */
    private Integer cid;
    /**
     * 哪个生字组成的词，生字表的id
     */
    private Integer wordmsgId;
    /**
     * 词语
     */
    private String cname;
    
    private String wCol1;
    
    private String wCol2;
    
    private String wCol3;
    
    private String wCol4;
    
    private String wCol5;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getWordmsgId() {
        return wordmsgId;
    }

    public void setWordmsgId(Integer wordmsgId) {
        this.wordmsgId = wordmsgId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getWCol1() {
        return wCol1;
    }

    public void setWCol1(String wCol1) {
        this.wCol1 = wCol1;
    }

    public String getWCol2() {
        return wCol2;
    }

    public void setWCol2(String wCol2) {
        this.wCol2 = wCol2;
    }

    public String getWCol3() {
        return wCol3;
    }

    public void setWCol3(String wCol3) {
        this.wCol3 = wCol3;
    }

    public String getWCol4() {
        return wCol4;
    }

    public void setWCol4(String wCol4) {
        this.wCol4 = wCol4;
    }

    public String getWCol5() {
        return wCol5;
    }

    public void setWCol5(String wCol5) {
        this.wCol5 = wCol5;
    }

}

