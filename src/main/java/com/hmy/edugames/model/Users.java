package com.hmy.edugames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue
    private long userID;
    private String username;
    private String password;

    public Users() {
    }

    public Users(long userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

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
}
