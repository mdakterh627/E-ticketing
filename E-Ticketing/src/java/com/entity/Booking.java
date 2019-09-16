package com.entity;
// Generated Sep 7, 2019 8:57:10 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Booking generated by hbm2java
 */
public class Booking  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String address;
     private String leavingFrom;
     private String goingTo;
     private Date bookingDate;
     private Date travelDate;
     private String seat;
     private Double price;
     private Double totalPrice;
     private String comment;

    public Booking() {
    }

    public Booking(String name, String address, String leavingFrom, String goingTo, Date bookingDate, Date travelDate, String seat, Double price, Double totalPrice, String comment) {
       this.name = name;
       this.address = address;
       this.leavingFrom = leavingFrom;
       this.goingTo = goingTo;
       this.bookingDate = bookingDate;
       this.travelDate = travelDate;
       this.seat = seat;
       this.price = price;
       this.totalPrice = totalPrice;
       this.comment = comment;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getLeavingFrom() {
        return this.leavingFrom;
    }
    
    public void setLeavingFrom(String leavingFrom) {
        this.leavingFrom = leavingFrom;
    }
    public String getGoingTo() {
        return this.goingTo;
    }
    
    public void setGoingTo(String goingTo) {
        this.goingTo = goingTo;
    }
    public Date getBookingDate() {
        return this.bookingDate;
    }
    
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    public Date getTravelDate() {
        return this.travelDate;
    }
    
    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }
    public String getSeat() {
        return this.seat;
    }
    
    public void setSeat(String seat) {
        this.seat = seat;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}

