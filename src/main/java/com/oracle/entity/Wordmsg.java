package com.oracle.entity;

import java.io.Serializable;

/**
 * (Wordmsg)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:30
 */
public class Wordmsg implements Serializable {
    private static final long serialVersionUID = -63845226050158044L;
    /**
     * 生字表的id
     */
    private Integer zid;
    /**
     * 字
     */
    private String zi;
    /**
     * 生字拼音
     */
    private String zpinying;
    /**
     * 哪一个课程中的生字，课程表的id
     */
    private Integer coursemsgId;
    
    private String wcol2;
    
    private String wcol3;
    
    private String wcol4;
    
    private String wcol5;


    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    public String getZpinying() {
        return zpinying;
    }

    public void setZpinying(String zpinying) {
        this.zpinying = zpinying;
    }

    public Integer getCoursemsgId() {
        return coursemsgId;
    }

    public void setCoursemsgId(Integer coursemsgId) {
        this.coursemsgId = coursemsgId;
    }

    public String getWcol2() {
        return wcol2;
    }

    public void setWcol2(String wcol2) {
        this.wcol2 = wcol2;
    }

    public String getWcol3() {
        return wcol3;
    }

    public void setWcol3(String wcol3) {
        this.wcol3 = wcol3;
    }

    public String getWcol4() {
        return wcol4;
    }

    public void setWcol4(String wcol4) {
        this.wcol4 = wcol4;
    }

    public String getWcol5() {
        return wcol5;
    }

    public void setWcol5(String wcol5) {
        this.wcol5 = wcol5;
    }

}

