package designMode.factoryDesignMode.factorydesignmode01;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/17 14:45
 * @Version 1.0
 */
public enum MessageType{
    email("email"),
    wexin("wexin"),
    phone("phone")
    ;

    private String typeName;

    MessageType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }}
