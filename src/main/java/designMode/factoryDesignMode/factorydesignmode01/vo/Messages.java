package designMode.factoryDesignMode.factorydesignmode01.vo;

/**
 * 这是一个消息描述类，可以往下实现say方法，实现对象和功能解耦
 * @Author: 微笑天使
 * @Date: 2019/5/17 15:20
 * @Version 1.0
 */

public abstract class Messages {
     String name;
     String messages;

    public Messages(String name, String messages) {
        this.name = name;
        this.messages = messages;
    }

    public Messages(){
    }

    public abstract void  say();


}
