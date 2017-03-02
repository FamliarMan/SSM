package com.jianglei.entity;

import org.springframework.stereotype.Repository;

/**
 * Created by jianglei on 17-2-25.
 */
@Repository
public class User {
    private String iduser;
    private String name;
    private String age;

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
