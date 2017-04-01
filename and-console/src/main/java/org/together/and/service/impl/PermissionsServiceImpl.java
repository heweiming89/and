package org.together.and.service.impl;

import org.springframework.stereotype.Service;
import org.together.and.mapper.PermissionsMapper;
import org.together.and.model.Permissions;
import org.together.and.model.PermissionsExample;
import org.together.and.service.PermissionsService;

@Service("systemPermissionsService")
public class PermissionsServiceImpl extends BaseServiceImpl<Permissions, PermissionsExample, PermissionsMapper>
		implements PermissionsService {

}
