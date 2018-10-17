package com.io.fast.modules.menu.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.io.fast.modules.menu.dao.MenuDao;
import com.io.fast.modules.menu.domain.MenuDomain;
import com.io.fast.modules.menu.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 14:48
 * @Description:
 */
@Service("menuService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class MenuServiceImpl extends ServiceImpl<MenuDao, MenuDomain> implements MenuService {

}
