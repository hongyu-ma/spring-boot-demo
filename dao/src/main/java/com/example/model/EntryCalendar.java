package com.example.model;

import java.util.Date;

public class EntryCalendar {
    private Long id;

    private String tenantCode;

    private String entrySiteCode;

    private Date date;

    private Integer totalNumber;

    private Integer currentNumber;

    private String status;

    private String createOprid;

    private Date createDttm;

    private String lastUpdOprid;

    private Date lastUpdDttm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode == null ? null : tenantCode.trim();
    }

    public String getEntrySiteCode() {
        return entrySiteCode;
    }

    public void setEntrySiteCode(String entrySiteCode) {
        this.entrySiteCode = entrySiteCode == null ? null : entrySiteCode.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateOprid() {
        return createOprid;
    }

    public void setCreateOprid(String createOprid) {
        this.createOprid = createOprid == null ? null : createOprid.trim();
    }

    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    public String getLastUpdOprid() {
        return lastUpdOprid;
    }

    public void setLastUpdOprid(String lastUpdOprid) {
        this.lastUpdOprid = lastUpdOprid == null ? null : lastUpdOprid.trim();
    }

    public Date getLastUpdDttm() {
        return lastUpdDttm;
    }

    public void setLastUpdDttm(Date lastUpdDttm) {
        this.lastUpdDttm = lastUpdDttm;
    }
}