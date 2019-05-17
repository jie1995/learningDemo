package designMode.factoryDesignMode.factorydesignmode01;

import designMode.factoryDesignMode.factorydesignmode01.vo.Messages;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/17 14:49
 * @Version 1.0
 */
public abstract class ImeassageFactory {
    public abstract Messages createMessage(String name);
}
