package com.io.fast.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.io.fast.modules.user.domain.UserDomain;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 11:23
 * @Description:
 */
public interface UserService extends IService<UserDomain> {

    /**
     * 根据登录名查询用户
     *
     * @param loginName 登录名
     * @return
     */
    UserDomain getUserByLoginName(String loginName);
}
