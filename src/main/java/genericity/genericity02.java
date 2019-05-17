package genericity;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/16 17:40
 * @Version 1.0
 */
public class genericity02<T> {

    private T name;

    public T getName() {
        return name;
    }

    public genericity02(T name) {
        this.name = name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // 泛型不存在多态
        // genericity02<Object> objectgenericity02=new genericity02<String>();
        genericity02<String> stringgenericity02 = new genericity02<String>("hello,world");
        String stringName= stringgenericity02.getName();
        System.out.println(stringName);
    }
}
