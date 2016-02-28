package com.example.ragda.base;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Ragda on 2/15/2016.
 */
public class user extends RealmObject{

    private String username;
    @PrimaryKey
    private String password;
    private String Email;
private String Gender;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
