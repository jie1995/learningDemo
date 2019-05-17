package designMode.factoryDesignMode.factorydesignmode01.vo;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/17 15:46
 * @Version 1.0
 */
public class EmailMessages extends Messages {

    private String name;
    private String messages;


    public EmailMessages(String name, String messages) {
        //注意这里，会调用父类的无参构造方法，如果父类无参构造被擦出了，会报错
        //可以这里显示调用有参构造，或者在父类添加上无参构造；
        super(name, messages);
        this.name = name;
        this.messages = messages;
    }

    @Override
    public void say() {

    }

    public static void main(String[] args) {
        //显然，构造方法不能继承
        // new EmailMessages();
    }
}
