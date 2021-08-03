package com.remind.dd.service;

import com.remind.dd.util.RebootUtil;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @Classname TimeService
 * @Description TODO
 * @Date 2021/7/22 17:38
 * @Author bengal
 */
public class TimeService {
    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static long day = 24 * 60 * 60 * 1000;

    public static void morningTimer() {
        //设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);//每天
        //定制每天的11:30:00执行，
        calendar.set(year, month, day1, 9, 20, 0);
        Date date = calendar.getTime();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                String markDown = RebootUtil.setMarkDown(false, "早上好", "## 早上好\n" +
                        "> ![screenshot](http://p1.pstatp.com/large/113e90008d5587e796a14\n" +
                        ")", Arrays.asList(""));
                //钉钉机器人推送
                try {
                    RebootUtil.sendReboot(markDown);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("时间=" + df.format(new Date()) + " 提醒了早上好");
            }
        };

        Timer timer = new Timer();
        //int period = 2 * 1000;
        //每天的date时刻执行task，每隔2秒重复执行
        // timer.schedule(task, date, period);
        //每天的date时刻执行task, 仅执行一次
        timer.schedule(task, date, day);
    }

    public static void eatTimer() {
        //设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);//每天
        //定制每天的11:30:00执行，
        calendar.set(year, month, day1, 11, 30, 0);
        Date date = calendar.getTime();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime dateTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 12, 30);

                Duration between = Duration.between(now, dateTime);
                long min = between.toMinutes();
                String markDown = RebootUtil.setMarkDown(false, "吃饭提醒", "#### 吃饭提醒  \n" +
                        " > 距离开饭还差 " + min + "分种 \n" +
                        "\n" +
                        " > ![screenshot](http://wx2.sinaimg.cn/large/006APoFYly1glol2ddd8fj306o06oq37.jpg)\n" +
                        "  > ###### 今天吃啥@18328685866", Arrays.asList("18328685866"));
                //钉钉机器人推送
                try {
                    RebootUtil.sendReboot(markDown);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("时间=" + df.format(new Date()) + " 提醒了开饭");
            }
        };

        Timer timer = new Timer();
        //int period = 2 * 1000;
        //每天的date时刻执行task，每隔2秒重复执行
        // timer.schedule(task, date, period);
        //每天的date时刻执行task, 仅执行一次
        timer.schedule(task, date, day);
    }

    public static void toiletTimer() {
        //设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);//每天
        //定制每天的11:30:00执行，
        calendar.set(year, month, day1, 12, 20, 0);
        Date date = calendar.getTime();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                String markDown = RebootUtil.setMarkDown(false, "上厕所提醒", "#### 上厕所提醒  \n" +
                        "\n" +
                        " > ![screenshot](http://inews.gtimg.com/newsapp_match/0/10252744684/0)\n" +
                        " > @18328685866", Arrays.asList("18328685866"));
                //钉钉机器人推送
                try {
                    RebootUtil.sendReboot(markDown);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("时间=" + df.format(new Date()) + " 提醒了上厕所");
            }
        };

        Timer timer = new Timer();
        //int period = 2 * 1000;
        //每天的date时刻执行task，每隔2秒重复执行
        // timer.schedule(task, date, period);
        //每天的date时刻执行task, 仅执行一次
        timer.schedule(task, date, day);
    }

    public static void homeTimer() {
        //设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);//每天
        //定制每天的11:30:00执行，
        calendar.set(year, month, day1, 18, 20, 00);
        Date date = calendar.getTime();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime dateTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 18, 30);

                Duration between = Duration.between(now, dateTime);
                long min = between.toMinutes();
                String markDown = RebootUtil.setMarkDown(false, "回家提醒", "#### 下班提醒  \n" +
                        " > 距离下班还剩 " + min + "分钟 \n" +
                        "\n" +
                        " > ![screenshot](https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20190928%2F6a0959f757f04971aa5896550f4d2ec5.gif&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1629539587&t=8904d99b33e613998019c309b37629fe)\n" +
                        " > @18328685866 ", Arrays.asList("18328685866"));
                //钉钉机器人推送
                try {
                    RebootUtil.sendReboot(markDown);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("时间=" + df.format(new Date()) + " 提醒了回家");
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, date, day);
    }


}
