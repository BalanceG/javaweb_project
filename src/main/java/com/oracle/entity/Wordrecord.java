package com.oracle.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Wordrecord)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:30
 */
public class Wordrecord implements Serializable {
    private static final long serialVersionUID = -32927515169151258L;
    /**
     * 主键
     */
    private Integer txid;
    /**
     * 字id
     */
    private Integer wordmsgId;
    /**
     * 用户id
     */
    private Integer usermsgId;
    /**
     * 听写时间
     */
    private Date createdate;
    
    private String tcol1;
    
    private String tcol2;
    
    private String tcol3;
    
    private String tcol4;
    
    private String tcol5;


    public Integer getTxid() {
        return txid;
    }

    public void setTxid(Integer txid) {
        this.txid = txid;
    }

    public Integer getWordmsgId() {
        return wordmsgId;
    }

    public void setWordmsgId(Integer wordmsgId) {
        this.wordmsgId = wordmsgId;
    }

    public Integer getUsermsgId() {
        return usermsgId;
    }

    public void setUsermsgId(Integer usermsgId) {
        this.usermsgId = usermsgId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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

