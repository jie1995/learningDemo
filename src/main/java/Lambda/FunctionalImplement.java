package Lambda;

import Lambda.po.User;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/10 14:40
 * @Version 1.0
 */
public class FunctionalImplement {

    public static void main(String[] args) {
        //这种写法实际上是函数式接口和lambda（
        //可选类型声明：
        //可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
        //可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
        //可选的返回关键字：
        //）表达式的接口的结合
        new Thread(() ->System.out.println("Lambda Expression!")).start();

        //获取函数式接口对象
        HelloWorld helloWorld=()-> System.out.println("hello,world");
        helloWorld.hello();
    }


}
