package RabbitMQ.HelloWorldMode;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 声明队列
 * @Author: 微笑天使
 * @Date: 2019/5/6 16:40
 * @Version 1.0
 */
@Configuration
public class RabbitConfig {

    public static final String MIAOSHA_QUEUE = "hello";

    @Bean
    public Queue helloQueue(){
        return new Queue(MIAOSHA_QUEUE,true);
    }

}
