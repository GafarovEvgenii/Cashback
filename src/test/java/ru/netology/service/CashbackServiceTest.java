package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest {
    CashbackService service = new CashbackService();

 @Test
    public void shouldShowBelowBoundary() {
        int purchaseCost = 600;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 400;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldhowHigherBoundary(){
        int purchaseCost = 1300;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 700;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldShowNullBoundary() {
        int purchaseCost = 0;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldShowEqualBoundary() {
        int purchaseCost = 1000;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);
    }

}
