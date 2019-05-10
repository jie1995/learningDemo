package Lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: 微笑天使
 * @Date: 2019/3/16 18:06
 * @Version 1.0
 */
public class AnonymousInnerClass {


    public static void main(String[] args) {
        //创建一个集合，并往里面添加元素，匿名内部类写法。实则相当于实现了该类，重写了方法
        List<String> stringList=new LinkedList<String>(){
            //只能是属性，方法，内嵌花括号代码
            @Override
            public boolean add(String s) {
                return super.add(s);
            }
        };

        List<String> list = new ArrayList<String>() {
            //内嵌花括号代码
            {
                add("a");
                add("b");
            }
        };
        System.out.println(list);
    }
}
