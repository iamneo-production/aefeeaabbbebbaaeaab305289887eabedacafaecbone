package com.examly.springapp.models;
@Entity
public class Bill {
    @Id
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
