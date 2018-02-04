package com.circle.common;

/**
 * @Author:keweiyang
 * @Date:Created in 上午11:08 2018/2/4
 * @Description:
 */
public enum UserType {
    USER(1, "普通用户"),
    ADMIN(2,"管理员");

    private int id;
    private String desc;

    UserType(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

}
