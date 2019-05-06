import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/30 15:34
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"RabbitMQ.HelloWorldMode"})
public class LearningNotesApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningNotesApplication.class,args);
    }
}
