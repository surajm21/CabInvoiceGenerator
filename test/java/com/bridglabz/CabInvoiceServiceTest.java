package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {
    @Test
    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance = 10.0;
        int time = 1;
        double result = invoice.CalculateFare(distance, time);
        Assert.assertEquals(100.0, result, 0.0);
    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance=0.1;
        int time =1;
        double result = invoice.CalculateFare(distance, time);
        Assert.assertEquals(5, result,0);
    }
}


