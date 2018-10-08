package pengq.common.mapper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pengq.common.mapper.common.impl.BaseServiceImpl;
import pengq.common.mapper.dao.UserDao;
import pengq.common.mapper.entity.User;
import pengq.common.mapper.service.UserService;

import java.util.List;

/**
 * FileName:     UserServiceImpl
 *
 * @version V1.0
 * CreateDate:         2018/10/8 10:40
 * @Description: TODO(用一句话描述该文件做什么)
 * All rights Reserved, Designed By nuctech.ltd
 * Copyright:    Copyright(C) 2018-2028
 * Company       同方威视技术股份有限公司
 * @author: pengq
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User,Integer> implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<User> listUserPaging() {
        return userDao.findAllPaging();
    }
}
