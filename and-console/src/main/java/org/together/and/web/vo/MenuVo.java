package org.together.and.web.vo;

import java.util.List;

import org.together.and.model.Menu;

public class MenuVo extends Menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MenuVo> subMenuList;

	public List<MenuVo> getSubMenuList() {
		return subMenuList;
	}

	public void setSubMenuList(List<MenuVo> subMenuList) {
		this.subMenuList = subMenuList;
	}

}
