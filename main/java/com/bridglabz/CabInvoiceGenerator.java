package com.bridglabz;

public class CabInvoiceGenerator {
    private static final double COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final int MINIMUM_FARE = 5;
    public double CalculateFare(double distance, double time) {
        double calculate_Fare = distance*time*COST_PER_KM*COST_PER_TIME;
        if(calculate_Fare<MINIMUM_FARE){
            return MINIMUM_FARE;
        }
        else
            return calculate_Fare;
    }
}
