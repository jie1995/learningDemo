package Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 微笑天使
 * @Date: 2019/3/4 22:55
 * @Version 1.0
 */
public class ForEach {

    //用lambda遍历并打印数组


    public static void main(String[] args) {

        String[] strings={"1","2","a","c"};
        //数组没有foreach方法
        //strings.
        List<String> stringlist=  Arrays.asList(strings);
        //可以省略这里的lambda参数的类型声明，编译器可以从列表的类属性推测出来。
        stringlist.forEach(s->System.out.println(s));
        //预定义使用了 @Functional 注释的函数式接口，自带一个抽象函数的方法
        stringlist.forEach(System.out::println);
    }




}
