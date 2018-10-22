package com.io.fast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.io.fast.common.utils.EHCacheUtils;
import com.io.fast.modules.menu.domain.MenuDomain;
import com.io.fast.modules.menu.service.MenuService;
import com.io.fast.modules.user.domain.UserDomain;
import com.io.fast.modules.user.service.UserService;
import net.sf.ehcache.CacheManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.spel.ast.Operator;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FastApplicationTests {

    @Resource
    private MenuService menuService;

    @Resource
    private UserService userService;


    @Test
    public void contextLoads() {

//        EntityWrapper<MenuDomain> ew = new EntityWrapper<>();
//        ew.where("level = 1");
//        UserDomain user = userService.getUserByLoginName("test");
//        System.out.println(user.getNickName());
//        System.out.println(JSON.toJSON(menuService.selectList(ew)));

//        JSONObject u = new JSONObject();
//        u.put("a", "1");
//        EHCacheUtils.setCache(cacheManager, "u", u);
//
//        Operator searchOP = (Operator) EHCacheUtils.getCache(cacheManager, "u");
//        System.out.println(searchOP.getObjectClass(JSONObject.class).toString());

    }

}
