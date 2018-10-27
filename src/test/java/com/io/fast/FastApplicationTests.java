package com.io.fast;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.io.fast.modules.menu.domain.MenuDomain;
import com.io.fast.modules.menu.service.MenuService;
import com.io.fast.modules.user.domain.UserDomain;
import com.io.fast.modules.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FastApplicationTests {

    @Resource
    private MenuService menuService;

    @Resource
    private UserService userService;

    @Cacheable("user")
    public UserDomain setE(Long id) {
        System.out.println(id);
        return new UserDomain() {{
            setId(id);
        }};
    }

    @Test
    public void contextLoads() {

//        this.findById("1");

//        EntityWrapper<MenuDomain> ew = new EntityWrapper<>();
//        ew.where("level = 1");
        UserDomain user1 = userService.getUserByLoginName("test");
        System.out.println(user1.getNickName());
        UserDomain user2 = userService.getUserByLoginName("test");
        System.out.println(user2.getNickName());

        //        System.out.println(user.getNickName());
//        System.out.println(JSON.toJSON(menuService.selectList(ew)));

//        JSONObject u = new JSONObject();
//        u.put("a", "1");
//        EHCacheUtils.setCache(CacheConfig, "u", u);
//
//        Operator searchOP = (Operator) EHCacheUtils.getCache(CacheConfig, "u");
//        System.out.println(searchOP.getObjectClass(JSONObject.class).toString());

    }

}
