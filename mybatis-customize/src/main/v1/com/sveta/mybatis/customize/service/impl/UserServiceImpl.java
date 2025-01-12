package com.sveta.mybatis.customize.service.impl;

import com.sveta.mybatis.customize.entity.User;
import com.sveta.mybatis.customize.mapper.UserMapper;
import com.sveta.mybatis.customize.service.IUserService;
import com.github.yulichang.base.MPJBaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author Sveta
 * @since 2024-12-25
 */
@Service
public class UserServiceImpl extends MPJBaseServiceImpl<UserMapper, User> implements IUserService {

}
