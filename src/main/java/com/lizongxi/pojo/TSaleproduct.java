package com.lizongxi.pojo;

public class TSaleproduct {
    private Long id;

    private Long tbsId;

    private Long pid;

    private String pname;

    private Long price;

    private Long salecount;

    private Long salingprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTbsId() {
        return tbsId;
    }

    public void setTbsId(Long tbsId) {
        this.tbsId = tbsId;
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

    public Long getSalecount() {
        return salecount;
    }

    public void setSalecount(Long salecount) {
        this.salecount = salecount;
    }

    public Long getSalingprice() {
        return salingprice;
    }

    public void setSalingprice(Long salingprice) {
        this.salingprice = salingprice;
    }
}