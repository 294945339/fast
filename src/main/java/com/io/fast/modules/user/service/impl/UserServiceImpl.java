package com.io.fast.modules.user.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.collect.Maps;
import com.io.fast.common.utils.ToolUtil;
import com.io.fast.modules.menu.domain.MenuDomain;
import com.io.fast.modules.user.dao.UserDao;
import com.io.fast.modules.user.domain.UserDomain;
import com.io.fast.modules.user.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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
        return baseMapper.selectById(id);
    }

    @Override
    public UserDomain getUserByLoginName(String loginName) {
        return baseMapper.selectOne(new UserDomain() {{
            setLoginName(loginName);
        }});
    }
}
