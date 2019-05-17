package designMode.strategyDesignMode.strategy;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/28 16:54
 * @Version 1.0
 */
public class DogBehavier implements Behavier {
    @Override
    public void move() {
        System.out.println("I belong to the ground");
    }
}
