package com.examly.springapp.models;
public class Bill {
    private int billId;
    private int total;
    public Bill(int billId, int total) {
        this.billId = billId;
        this.total = total;
    }
    public Bill() {
        super();
    }
    public int getBillId() {
        return billId;
    }
    public void setBillId(int billId) {
        this.billId = billId;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Bill [billId=" + billId + ", total=" + total + "]";
    }


    
}
