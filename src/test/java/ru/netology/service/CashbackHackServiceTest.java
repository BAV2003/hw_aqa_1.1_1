package ru.netology.service;

//import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void amountLess1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void amountMore1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void amount1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}