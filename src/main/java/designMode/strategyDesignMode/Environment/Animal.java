package designMode.strategyDesignMode.Environment;

import designMode.strategyDesignMode.strategy.Behavier;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/28 16:59
 * @Version 1.0
 */
public class Animal {

    private Behavier behavier;


    public  Animal(){

    }

    public Animal(Behavier behavier){
        this.behavier=behavier;
    }


    public void move(){
         behavier.move();
    }

}
