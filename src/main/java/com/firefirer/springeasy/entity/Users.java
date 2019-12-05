package com.firefirer.springeasy.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "username")
    private String username;

    @Column(name = "nickname")
    private String naickname;

    @Column(name = "password")
    private String password;

    @Column(name = "authotp")
    private String authotp;

    @Column(name = "status")
    private String status;

    @Column(name = "roles")
    private int roles;

    @Column(name = "binding")
    private Boolean binding;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNaickname() {
        return naickname;
    }

    public void setNaickname(String naickname) {
        this.naickname = naickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthotp() {
        return authotp;
    }

    public void setAuthotp(String authotp) {
        this.authotp = authotp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRoles() {
        return roles;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }

    public Boolean getBinding() {
        return binding;
    }

    public void setBinding(Boolean binding) {
        this.binding = binding;
    }
}

