package com.io.fast.common.base;

import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 14:18
 * @Description:
 */

public class BaseDomain<T extends Model> extends Model<T> {

    /**
     * 实体编号（唯一标识）
     */

    protected Long id;


    public BaseDomain() {

    }

    public BaseDomain(Long id) {
        this();
        this.id = id;
    }

    @JsonSerialize(using = ToStringSerializer.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        BaseDomain<?> that = (BaseDomain<?>) obj;
        return null != this.getId() && this.getId().equals(that.getId());
    }
}
