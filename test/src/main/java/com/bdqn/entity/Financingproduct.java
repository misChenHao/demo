package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class Financingproduct implements Serializable {
    /**
     *
     */
    private String id;

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
    private String salestarting;

    /**
     * 发售截止日期
     */
    private String saleend;

    /**
     * 产品到期日
     */
    private String end;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getSalestarting() {
        return salestarting;
    }

    public void setSalestarting(String salestarting) {
        this.salestarting = salestarting;
    }

    public String getSaleend() {
        return saleend;
    }

    public void setSaleend(String saleend) {
        this.saleend = saleend;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}