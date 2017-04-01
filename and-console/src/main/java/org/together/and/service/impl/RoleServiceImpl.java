package org.together.and.service.impl;

import org.springframework.stereotype.Service;
import org.together.and.mapper.RoleMapper;
import org.together.and.model.Role;
import org.together.and.model.RoleExample;
import org.together.and.service.RoleService;

@Service("systemRoleService")
public class RoleServiceImpl extends BaseServiceImpl<Role, RoleExample, RoleMapper>
        implements RoleService {

}
