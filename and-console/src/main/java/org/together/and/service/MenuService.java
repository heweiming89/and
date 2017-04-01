package org.together.and.service;

import java.util.List;

import org.together.and.model.Menu;
import org.together.and.model.MenuExample;
import org.together.and.model.RoleExample;
import org.together.and.service.base.BaseService;
import org.together.and.web.vo.MenuVo;

public interface MenuService extends BaseService<Menu, MenuExample> {

    public List<MenuVo> findMenuByRole(RoleExample roelCriteria);

}