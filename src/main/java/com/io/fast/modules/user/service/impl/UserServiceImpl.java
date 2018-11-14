package com.io.fast.modules.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.io.fast.common.utils.ToolUtil;
import com.io.fast.modules.user.dao.UserDao;
import com.io.fast.modules.user.domain.RoleDomain;
import com.io.fast.modules.user.domain.UserDomain;
import com.io.fast.modules.user.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.ls.LSException;

import java.util.*;


/**
 * @author: dj
 * @Date: 2018\10\15 0015 14:48
 * @Description:
 */
@Service("userService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserDao, UserDomain> implements UserService {

    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public UserDomain saveUser(UserDomain user) {
        ToolUtil.entryptPassword(user);
        user.setLocked(false);
        baseMapper.insert(user);
        //保存用户角色关系
//        this.saveUserRoles(user.getId(),user.getRoleLists());
        return findUserById(user.getId());
    }

    public UserDomain findUserById(Long id) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("id", id);
        return baseMapper.selectUserByMap(map);
    }

    @Override
    @Cacheable(value = "user", key = "'user'.concat(#loginName)")
    public UserDomain getUserByLoginName(String loginName) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("loginName", loginName);
        UserDomain user = baseMapper.selectUserByMap(map);
        return user;
    }
}
