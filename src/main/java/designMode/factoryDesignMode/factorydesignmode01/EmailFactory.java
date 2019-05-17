package designMode.factoryDesignMode.factorydesignmode01;

import designMode.factoryDesignMode.factorydesignmode01.vo.EmailMessages;
import designMode.factoryDesignMode.factorydesignmode01.vo.Messages;
import designMode.factoryDesignMode.factorydesignmode01.vo.WexinMessages;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/17 14:50
 * @Version 1.0
 */
public class EmailFactory extends ImeassageFactory{
    public static final String email = "email";
    public static final String wexin = "wexin";

    @Override
    public Messages createMessage(String name) {
       Messages messages=null;
        // java7后支持string类型，转译成int类型
       switch (name){
           //这里必须要常量修饰
            case email:
               messages=new EmailMessages("email","hello,eamil");
           case wexin:
               messages=new WexinMessages("wexin","hello,wexin");
               default:
                   messages=new EmailMessages("email","hello,eamil");
        }
        return messages;
    }
}
