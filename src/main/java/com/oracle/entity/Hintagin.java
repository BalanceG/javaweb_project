package com.oracle.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Hintagin)实体类
 *
 * @author makejava
 * @since 2022-04-01 09:49:29
 */
public class Hintagin implements Serializable {
    private static final long serialVersionUID = -56635374001686585L;
    /**
     * 提示表id
     */
    private Integer pid;
    /**
     * 日期
     */
    private Date pdate;
    /**
     * 信息
     */
    private String pmsg;
    
    private String hcol1;
    
    private String hcol2;
    
    private String hcol3;
    
    private String hcol4;
    
    private String hcol5;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getPmsg() {
        return pmsg;
    }

    public void setPmsg(String pmsg) {
        this.pmsg = pmsg;
    }

    public String getHcol1() {
        return hcol1;
    }

    public void setHcol1(String hcol1) {
        this.hcol1 = hcol1;
    }

    public String getHcol2() {
        return hcol2;
    }

    public void setHcol2(String hcol2) {
        this.hcol2 = hcol2;
    }

    public String getHcol3() {
        return hcol3;
    }

    public void setHcol3(String hcol3) {
        this.hcol3 = hcol3;
    }

    public String getHcol4() {
        return hcol4;
    }

    public void setHcol4(String hcol4) {
        this.hcol4 = hcol4;
    }

    public String getHcol5() {
        return hcol5;
    }

    public void setHcol5(String hcol5) {
        this.hcol5 = hcol5;
    }

}

