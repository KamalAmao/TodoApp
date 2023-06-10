package com.kamal.classes.ui;

public class Customer {

    private String fullname;
    private String email;
    private Double initBal;

    public Customer(String fullname, String email, Double initBal) {
        this.fullname = fullname;
        this.email = email;
        this.initBal = initBal;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public Double getInitBal() {
        return initBal;
    }
}
