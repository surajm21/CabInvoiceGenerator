package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {
    @Test
    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance = 10.0;
        int time = 1;
        double result = invoice.calculateFare(distance, time);
        Assert.assertEquals(100.0, result, 0.0);
    }
    @Test
    public void givenLessDistanceOrTimeShouldReturnMinFare(){
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance=0.1;
        int time =1;
        double result = invoice.calculateFare(distance, time);
        Assert.assertEquals(5, result,0);
    }
    @Test
    public void givenMultipleRidesShouldReturnTotalFare(){
        CabInvoiceGenerator invoice =new CabInvoiceGenerator();
        Ride[] rides = {new Ride(2.0,5), new Ride(0.1,1)};
        double result = invoice.calculateFare(rides);
        Assert.assertEquals(30,result,0);
    }
}


