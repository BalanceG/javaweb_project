package com.oracle.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Mistakemsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:30
 */
public class Mistakemsg implements Serializable {
    private static final long serialVersionUID = 144126583717978595L;
    /**
     * 主键
     */
    private Integer sid;
    /**
     * 字id
     */
    private Integer wordmsgId;
    /**
     * 记录时间
     */
    private Date createdate;
    
    private String mcol1;
    
    private String mcol2;
    
    private String mcol3;
    
    private String mcol4;
    
    private String mcol5;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getWordmsgId() {
        return wordmsgId;
    }

    public void setWordmsgId(Integer wordmsgId) {
        this.wordmsgId = wordmsgId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getMcol1() {
        return mcol1;
    }

    public void setMcol1(String mcol1) {
        this.mcol1 = mcol1;
    }

    public String getMcol2() {
        return mcol2;
    }

    public void setMcol2(String mcol2) {
        this.mcol2 = mcol2;
    }

    public String getMcol3() {
        return mcol3;
    }

    public void setMcol3(String mcol3) {
        this.mcol3 = mcol3;
    }

    public String getMcol4() {
        return mcol4;
    }

    public void setMcol4(String mcol4) {
        this.mcol4 = mcol4;
    }

    public String getMcol5() {
        return mcol5;
    }

    public void setMcol5(String mcol5) {
        this.mcol5 = mcol5;
    }

}

