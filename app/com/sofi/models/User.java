package com.sofi.models;

//import org.hibernate.annotations.Type;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {

    private static final long serialVersionUID = 455844855;


    @Id
    @Column(name="username")
    private String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public User() {
    }
}
