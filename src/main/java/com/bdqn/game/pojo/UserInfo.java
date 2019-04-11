/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfo
 * Author:   高小兑
 * Date:     2019/4/11 16:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.pojo;

import javax.persistence.*;
import java.util.Objects;

/*存放用户基本信息表*/
@Entity
@Table(name = "USER_INFO", schema = "SCOTT", catalog = "")
public class UserInfo {

    private long id;//用户唯一id
    private String loginName;//登录名
    private String name;//真实姓名
    private String password;//密码
    private Integer userRole;//角色
    private Long gender;//性别
    private String passQuestion;//密码提示问题
    private String passAnswer;//密码提示答案
    private String email;//邮箱
    private Long telNo;//电话
    private String address;//家庭住址
    private Long qq;//qq
    private Long money;//余额
    private Integer userState;//用户状态
    private Integer credit;//积分
    private Integer vipLevel;//会员等级

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOGIN_NAME", nullable = true, length = 40)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "USER_ROLE", nullable = true, precision = 0)
    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, precision = 0)
    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "PASS_QUESTION", nullable = true, length = 100)
    public String getPassQuestion() {
        return passQuestion;
    }

    public void setPassQuestion(String passQuestion) {
        this.passQuestion = passQuestion;
    }

    @Basic
    @Column(name = "PASS_ANSWER", nullable = true, length = 100)
    public String getPassAnswer() {
        return passAnswer;
    }

    public void setPassAnswer(String passAnswer) {
        this.passAnswer = passAnswer;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "TEL_NO", nullable = true, precision = 0)
    public Long getTelNo() {
        return telNo;
    }

    public void setTelNo(Long telNo) {
        this.telNo = telNo;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "QQ", nullable = true, precision = 0)
    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "MONEY", nullable = true, precision = 2)
    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Basic
    @Column(name = "USER_STATE", nullable = true, precision = 0)
    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    @Basic
    @Column(name = "CREDIT", nullable = true, precision = 0)
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "VIP_LEVEL", nullable = true, precision = 0)
    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return id == userInfo.id &&
                Objects.equals(loginName, userInfo.loginName) &&
                Objects.equals(name, userInfo.name) &&
                Objects.equals(password, userInfo.password) &&
                Objects.equals(userRole, userInfo.userRole) &&
                Objects.equals(gender, userInfo.gender) &&
                Objects.equals(passQuestion, userInfo.passQuestion) &&
                Objects.equals(passAnswer, userInfo.passAnswer) &&
                Objects.equals(email, userInfo.email) &&
                Objects.equals(telNo, userInfo.telNo) &&
                Objects.equals(address, userInfo.address) &&
                Objects.equals(qq, userInfo.qq) &&
                Objects.equals(money, userInfo.money) &&
                Objects.equals(userState, userInfo.userState) &&
                Objects.equals(credit, userInfo.credit) &&
                Objects.equals(vipLevel, userInfo.vipLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginName, name, password, userRole, gender, passQuestion, passAnswer, email, telNo, address, qq, money, userState, credit, vipLevel);
    }
}

