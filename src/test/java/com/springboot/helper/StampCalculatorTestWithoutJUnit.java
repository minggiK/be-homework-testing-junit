package com.springboot.helper;

import com.springboot.order.entity.Order;
import com.springboot.order.entity.OrderCoffee;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StampCalculatorTestWithoutJUnit {
    public static void main(String[] args) {
        calculateStampCountTest();
        calculateEarnedStampCountTest();
    }

    private static void calculateStampCountTest() {
        // given
        int nowCount = 5;
        int earned = 3;


        // when
        int actual = StampCalculator.calculateStampCount(nowCount, earned);

        int expected = 7;

        // then
        System.out.println(expected == actual);

    }

    private static void calculateEarnedStampCountTest() {
        // given
        Order order = new Order();
        OrderCoffee orderCoffee1 = new OrderCoffee();
        orderCoffee1.setQuantity(3);

        OrderCoffee orderCoffee2 = new OrderCoffee();
        orderCoffee2.setQuantity(5);

        order.setOrderCoffees(List.of(orderCoffee1, orderCoffee2));

        int expected = orderCoffee1.getQuantity() + orderCoffee2.getQuantity();

        // when
        int actual = StampCalculator.calculateEarnedStampCount(order);


        // then
        System.out.println(expected == actual);

    }
}
