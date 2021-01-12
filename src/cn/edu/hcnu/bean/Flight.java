package cn.edu.hcnu.bean;

import java.util.Date;

public class Flight {
    private String planeType;  //机型
    private String orginCity; //出发城市
    private String destinationCity;  //到达城市
    private Date startTime;  //出发时间
    private Date endTime;  //到达时间
    private Date flightTime;  //飞行时间
    private float ticketPrice;  //机票价格

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getOrginCity() {
        return orginCity;
    }

    public void setOrginCity(String orginCity) {
        this.orginCity = orginCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Date flightTime) {
        this.flightTime = flightTime;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
