package com.io.fast.modules.user.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.io.fast.modules.user.domain.RoleDomain;
import com.io.fast.modules.user.domain.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Set;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 14:12
 * @Description:
 */

public interface UserDao  extends BaseMapper<UserDomain> {

    UserDomain selectUserByMap(Map<String, Object> map);

    void saveUserRoles(@Param("userId")Long id, @Param("roleIds") Set<RoleDomain> roles);

    void dropUserRolesByUserId(@Param("userId")Long userId);

    Map selectUserMenuCount();

}
