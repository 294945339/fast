package com.io.fast;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.io.fast.modules.menu.domain.MenuDomain;
import com.io.fast.modules.menu.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FastApplicationTests {

    @Resource
    private MenuService menuService;

    @Test
    public void contextLoads() {
        EntityWrapper<MenuDomain> ew = new EntityWrapper<>();
        ew.where("level = 1");
        System.out.println(JSON.toJSON(menuService.selectList(ew)));
    }

}
