package com.remind.dd;

import com.remind.dd.service.TimeService;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2021/7/22 17:48
 * @Author bengal
 */
public class Main {
    public static void main(String[] args) {
        TimeService.morningTimer();
        TimeService.eatTimer();
        TimeService.homeTimer();
        TimeService.toiletTimer();
        System.out.println("start");
//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime dateTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 22, 20);
//        Duration between = Duration.between(now, dateTime);
//        long min = between.toMinutes();
//        long hour = between.toHours();
//
//        System.out.println();
    }
}
