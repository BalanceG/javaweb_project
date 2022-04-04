package com.oracle.entity;

import java.io.Serializable;

/**
 * (Bookshelf)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:28
 */
public class Bookshelf implements Serializable {
    private static final long serialVersionUID = 840336437863489236L;
    /**
     * 书架表id
     */
    private Integer bid;
    /**
     * 书架的书是哪一本书，图书表id
     */
    private Integer bookmsgId;
    /**
     * 谁的书架，用户表的id
     */
    private Integer usermsgId;
    
    private String bCol1;
    
    private String bCol2;
    
    private String bCol3;
    
    private String bCol4;
    
    private String bCol5;


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getBookmsgId() {
        return bookmsgId;
    }

    public void setBookmsgId(Integer bookmsgId) {
        this.bookmsgId = bookmsgId;
    }

    public Integer getUsermsgId() {
        return usermsgId;
    }

    public void setUsermsgId(Integer usermsgId) {
        this.usermsgId = usermsgId;
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

