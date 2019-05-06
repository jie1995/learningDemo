package Scheduled;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/30 15:28
 * @Version 1.0
 */
@Component
@EnableScheduling
public class ScheduledClass {

    /**
     * 随着服务启动启动
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void ScheduledTask(){
        System.out.println("定时任务:"+System.currentTimeMillis());
    }
}
