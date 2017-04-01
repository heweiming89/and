package org.together.and.service.impl;

import org.springframework.stereotype.Service;
import org.together.and.mapper.LoginLogMapper;
import org.together.and.model.LoginLog;
import org.together.and.model.LoginLogExample;
import org.together.and.service.LoginLogService;

@Service("systemLoginLogService")
public class LoginLogServiceImpl extends BaseServiceImpl<LoginLog, LoginLogExample, LoginLogMapper> implements LoginLogService {


}
