package designMode.singletonDesignMode;

/**
 * @Author: 微笑天使
 * @Date: 2019/4/28 17:08
 * @Version 1.0
 */
public class Singleton {
    private static final Singleton SINGLETON = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (SINGLETON == null) {
            return new Singleton();
        } else {
            return SINGLETON;
        }
    }
}
