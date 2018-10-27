package com.io.fast.modules.user.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.io.fast.common.base.DataDomain;
import com.io.fast.modules.menu.domain.MenuDomain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 14:13
 * @Description:
 */

@TableName("sys_user")
public class UserDomain extends DataDomain<UserDomain> {

    /**
     * 登录名
     */
    @TableField("login_name")
    private String loginName;
    /**
     * 昵称
     */
    @TableField(value = "nick_name", strategy = FieldStrategy.IGNORED)
    private String nickName;
    /**
     * 密码
     */
    private String password;
    /**
     * shiro加密盐
     */
    private String salt;
    /**
     * 手机号码
     */
    @TableField(strategy = FieldStrategy.IGNORED)
    private String tel;
    /**
     * 邮箱地址
     */
    @TableField(strategy = FieldStrategy.IGNORED)
    private String email;

    /**
     * 账户是否锁定
     */
    private Boolean locked;

    @TableField(strategy = FieldStrategy.IGNORED)
    private String icon;

    @TableField(exist=false)
    private Set<RoleDomain> roleLists = new HashSet<>();

    @TableField(exist = false)
    private Set<MenuDomain> menus = new HashSet<>();

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JSONField(serialize = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JSONField(serialize = false)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Set<RoleDomain> getRoleLists() {
        return roleLists;
    }

    public void setRoleLists(Set<RoleDomain> roleLists) {
        this.roleLists = roleLists;
    }

    public Set<MenuDomain> getMenus() {
        return menus;
    }

    public void setMenus(Set<MenuDomain> menus) {
        this.menus = menus;
    }

}
