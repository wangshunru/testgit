package com.baizhi.poj;

/**
 * Created by wangshunxi on 2019/9/18.
 * e-mail: mcphilex1989@gmail.com
 * phone: 15652608401
 */
public class User {
    private String id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
