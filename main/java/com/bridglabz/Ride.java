package com.bridglabz;

public class Ride {
    private double distance;
    private double time;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Ride(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

}
