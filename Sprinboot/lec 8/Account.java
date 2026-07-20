package com.java;

public class Account {

    private String username;
    private String password;
    private Double balance;
    private String phoneNumber;
    private float age;

    public Account(){

    }

    public Account(String username, String password , String phoneNumber, Float age) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }


    public Account(String username , String password) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }


}
