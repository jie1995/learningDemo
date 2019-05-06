package RabbitMQ.HelloWorldMode;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/6 14:43
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReciver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
}
