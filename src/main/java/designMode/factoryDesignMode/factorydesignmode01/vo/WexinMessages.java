package designMode.factoryDesignMode.factorydesignmode01.vo;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/17 15:46
 * @Version 1.0
 */
public class WexinMessages extends Messages{

    private String name;
    private String messages;


    public WexinMessages(String name, String messages) {
        this.name = name;
        this.messages = messages;
    }

    @Override
    public void say() {

    }
}
