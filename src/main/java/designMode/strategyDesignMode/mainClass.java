package designMode.strategyDesignMode;

import designMode.strategyDesignMode.Environment.Animal;
import designMode.strategyDesignMode.strategy.DogBehavier;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/28 17:02
 * @Version 1.0
 */
public class mainClass {

    public static void main(String[] args) {
        Animal animal=new Animal(new DogBehavier());
        animal.move();
    }
}
