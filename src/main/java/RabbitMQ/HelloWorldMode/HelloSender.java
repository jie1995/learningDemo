package RabbitMQ.HelloWorldMode;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/6 14:42
 * @Version 1.0
 */
@RestController
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("/hello")
    public String send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
        return "消费者和生产者队列模式";
    }
}
