package ClassReflect;


import ClassReflect.model.User;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/24 17:24
 * @Version 1.0
 */
public class ReflectGetClass {

    public static void main(String[] args) {
        // 第一种方法,根据对象获取
        User user=new User();
        Class userClass=user.getClass();
        System.out.println(userClass.getName());

        //第二种方法，根据类名获取
        Class userClass2=User.class;
        System.out.println(userClass==userClass2);

        //第三种方法，根据路径获取
        try {
          Class userClass3=  Class.forName("model.User");
            System.out.println(userClass2==userClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

}
