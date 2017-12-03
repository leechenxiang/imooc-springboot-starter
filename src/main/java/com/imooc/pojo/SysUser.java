package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Id
    private String id;

    /**
     * 用户名，登录名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
0：女
1：男
2：保密 
     */
    private Integer sex;

    /**
     * 职业类型：
1：Java开发
2：前端开发
3：大数据开发
4：ios开发
5：Android开发
6：Linux系统工程师
7：PHP开发
8：.net开发
9：C/C++
10：学生
11：其它
     */
    private Integer job;

    /**
     * 头像地址
     */
    @Column(name = "face_image")
    private String faceImage;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 用于权限的“盐”
     */
    @Column(name = "auth_salt")
    private String authSalt;

    /**
     * 最后一次登录IP
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 最后一次登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "is_delete")
    private Integer isDelete;

    @Column(name = "regist_time")
    private Date registTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名，登录名
     *
     * @return username - 用户名，登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名，登录名
     *
     * @param username 用户名，登录名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别
0：女
1：男
2：保密 
     *
     * @return sex - 性别
0：女
1：男
2：保密 
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
0：女
1：男
2：保密 
     *
     * @param sex 性别
0：女
1：男
2：保密 
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取职业类型：
1：Java开发
2：前端开发
3：大数据开发
4：ios开发
5：Android开发
6：Linux系统工程师
7：PHP开发
8：.net开发
9：C/C++
10：学生
11：其它
     *
     * @return job - 职业类型：
1：Java开发
2：前端开发
3：大数据开发
4：ios开发
5：Android开发
6：Linux系统工程师
7：PHP开发
8：.net开发
9：C/C++
10：学生
11：其它
     */
    public Integer getJob() {
        return job;
    }

    /**
     * 设置职业类型：
1：Java开发
2：前端开发
3：大数据开发
4：ios开发
5：Android开发
6：Linux系统工程师
7：PHP开发
8：.net开发
9：C/C++
10：学生
11：其它
     *
     * @param job 职业类型：
1：Java开发
2：前端开发
3：大数据开发
4：ios开发
5：Android开发
6：Linux系统工程师
7：PHP开发
8：.net开发
9：C/C++
10：学生
11：其它
     */
    public void setJob(Integer job) {
        this.job = job;
    }

    /**
     * 获取头像地址
     *
     * @return face_image - 头像地址
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * 设置头像地址
     *
     * @param faceImage 头像地址
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return district - 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取用于权限的“盐”
     *
     * @return auth_salt - 用于权限的“盐”
     */
    public String getAuthSalt() {
        return authSalt;
    }

    /**
     * 设置用于权限的“盐”
     *
     * @param authSalt 用于权限的“盐”
     */
    public void setAuthSalt(String authSalt) {
        this.authSalt = authSalt;
    }

    /**
     * 获取最后一次登录IP
     *
     * @return last_login_ip - 最后一次登录IP
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后一次登录IP
     *
     * @param lastLoginIp 最后一次登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取最后一次登录时间
     *
     * @return last_login_time - 最后一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastLoginTime 最后一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return is_delete
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return regist_time
     */
    public Date getRegistTime() {
        return registTime;
    }

    /**
     * @param registTime
     */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }
}