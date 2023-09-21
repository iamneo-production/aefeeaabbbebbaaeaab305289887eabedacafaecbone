package com.examly.springapp.models;
class Customer {
    private int customerId;
    private String customerNmame;
    private int age;
    private long mobile;
    bill Bill;
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerNmame() {
        return customerNmame;
    }
    public void setCustomerNmame(String customerNmame) {
        this.customerNmame = customerNmame;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public bill getBill() {
        return Bill;
    }
    public void setBill(bill bill) {
        Bill = bill;
    }

    
}