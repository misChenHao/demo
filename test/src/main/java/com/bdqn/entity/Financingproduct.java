package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class Financingproduct implements Serializable {
    /**
    * 
    */
    private Integer id;

    /**
    * 风险评级
    */
    private Integer risk;

    /**
    * 预期收益
    */
    private String income;

    /**
    * 发售起始日期
    */
    private Date salestarting;

    /**
    * 发售截止日期
    */
    private Date saleend;

    /**
    * 产品到期日
    */
    private Date end;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public Date getSalestarting() {
        return salestarting;
    }

    public void setSalestarting(Date salestarting) {
        this.salestarting = salestarting;
    }

    public Date getSaleend() {
        return saleend;
    }

    public void setSaleend(Date saleend) {
        this.saleend = saleend;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}