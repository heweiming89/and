package org.together.and.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.together.and.mapper.MenuMapper;
import org.together.and.model.Menu;
import org.together.and.model.MenuExample;
import org.together.and.model.MenuExample.Criteria;
import org.together.and.model.RoleExample;
import org.together.and.service.MenuService;
import org.together.and.web.vo.MenuVo;

@Service("systemMenuService")
public class MenuServiceImpl extends BaseServiceImpl<Menu, MenuExample, MenuMapper> implements MenuService {

	@Override
	public List<MenuVo> findMenuByRole(RoleExample roelCriteria) {
		List<MenuVo> result = new ArrayList<>();

		MenuExample example = new MenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(0).andActivityEqualTo(Boolean.TRUE);
		example.setOrderByClause("sorting");
		List<Menu> list = mapper.selectByExample(example);

		for (Menu menu : list) {

			MenuVo menuVo = new MenuVo();
			BeanUtils.copyProperties(menu, menuVo);
			menuVo.setSubMenuList(subMenu(menu));
			result.add(menuVo);
		}
		return result;
	}

	private List<MenuVo> subMenu(Menu menu) {
		List<MenuVo> subMenuVoList = new ArrayList<>();

		MenuExample subExample = new MenuExample();
		Criteria subCriteria = subExample.createCriteria();
		subCriteria.andParentIdEqualTo(menu.getId()).andActivityEqualTo(Boolean.TRUE);
		subExample.setOrderByClause("sorting");

		List<Menu> subList = mapper.selectByExample(subExample);

		for (Menu subMenu : subList) {
			MenuVo subMenuVo = new MenuVo();
			BeanUtils.copyProperties(subMenu, subMenuVo);
			subMenuVoList.add(subMenuVo);
		}
		return subMenuVoList;
	}

}
