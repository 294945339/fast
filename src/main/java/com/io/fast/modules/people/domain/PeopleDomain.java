package com.io.fast.modules.people.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import com.io.fast.common.base.DataDomain;

/**
 * @author: dj
 * @Date: 2018\11\14 0014 09:22
 * @Description:
 */
@TableName("g_people")
public class PeopleDomain extends DataDomain<PeopleDomain> {

    private String name;

    private Integer hp;

    private Integer defense;

}
