package com.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vitaliano on 02.12.2016.
 */
public class CalculateTest {
    @Test
    public void add() throws Exception {
        Calculate calculate = new Calculate();
        calculate.add(5, 5);
        assertEquals(10, calculate.getResult());
    }

    @Test
    public void minus() throws Exception {
        Calculate calculate = new Calculate();
        calculate.minus(10, 5);
        assertEquals(5, calculate.getResult());
    }

    @Test
    public void multipliy() throws Exception {
        Calculate calculate = new Calculate();
        calculate.multipliy(5, 5);
        assertEquals(25, calculate.getResult());
    }

    @Test
    public void devide() throws Exception {
        Calculate calculate = new Calculate();
        calculate.devide(50, 5);
        assertEquals(10, calculate.getResult());
    }
}