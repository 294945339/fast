package com.io.fast.modules.user.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.io.fast.common.base.DataDomain;
import com.io.fast.modules.menu.domain.MenuDomain;

import java.util.Objects;
import java.util.Set;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangl
 * @since 2017-10-31
 */
@TableName("sys_role")
public class RoleDomain extends DataDomain<RoleDomain> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
	private String name;

	@TableField(exist = false)
	private Set<MenuDomain> menuSet;

	@TableField(exist = false)
	private Set<UserDomain> userSet;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<MenuDomain> getMenuSet() {
		return menuSet;
	}

	public void setMenuSet(Set<MenuDomain> menuSet) {
		this.menuSet = menuSet;
	}

	public Set<UserDomain> getUserSet() {
		return userSet;
	}

	public void setUserSet(Set<UserDomain> userSet) {
		this.userSet = userSet;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		RoleDomain that = (RoleDomain) o;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
