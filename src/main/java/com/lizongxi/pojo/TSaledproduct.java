package com.lizongxi.pojo;

public class TSaledproduct {
    private Long id;

    private Long pid;

    private String pname;

    private Long price;

    private Long saledcount;

    private Long saleprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSaledcount() {
        return saledcount;
    }

    public void setSaledcount(Long saledcount) {
        this.saledcount = saledcount;
    }

    public Long getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Long saleprice) {
        this.saleprice = saleprice;
    }
}