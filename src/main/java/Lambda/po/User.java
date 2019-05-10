package Lambda.po;

/**
 * @Author: 微笑天使
 * @Date: 2019/3/17 21:45
 * @Version 1.0
 */
public class User {

    private int age;
    private String name;
    private String sex;


    public User(){}
    public User(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
