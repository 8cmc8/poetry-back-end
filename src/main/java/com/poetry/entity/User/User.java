package com.poetry.entity.User;

import com.poetry.entity.Base.BaseEntity;

import java.util.Date;

/**
 * ClassName: User <br/>
 * Description: <br/>
 * date: 2019-04-25 21:49<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class User extends BaseEntity {
    private int id;
    private String userName;
    private String password;
    /**
     * 1：男，2：女
     */
    private int gender;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }

}
