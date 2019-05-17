package genericity;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/16 17:16
 * @Version 1.0
 */
public class genericity01 {

    public static  <T> T convert(Object object){
        return (T) object;
    }


    public static void main(String[] args) {
        String string=convert("hello,world");
        System.out.println(string);
    }
}
