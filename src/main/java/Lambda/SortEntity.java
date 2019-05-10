package Lambda;


import Lambda.po.User;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: 微笑天使
 * @Date: 2019/3/17 21:47
 * @Version 1.0
 */
public class SortEntity {

    public static void main(String[] args) {

        User user1=new User(12,"weili","男");
        User user2=new User(13,"zoukeai","女");
        List<User> userList=new LinkedList<User>(){
            {
                add(user1);
                add(user2);
            }
        };
        // 排序方法1
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
               return o1.getAge()-o2.getAge();
            }
        });

        // lambda排序,对list直接sort即可
        userList.sort((a,b) ->a.getAge()-b.getAge());


        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {

                return o1.getAge()-o2.getAge();
            }
        });
    }
}
