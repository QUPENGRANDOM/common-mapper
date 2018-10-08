package pengq.common.mapper.service;

import pengq.common.mapper.common.BaseService;
import pengq.common.mapper.entity.User;

import java.util.List;

/**
 * FileName:     UserService
 *
 * @version V1.0
 * CreateDate:         2018/10/8 10:32
 * @Description: TODO(用一句话描述该文件做什么)
 * All rights Reserved, Designed By nuctech.ltd
 * Copyright:    Copyright(C) 2018-2028
 * Company       同方威视技术股份有限公司
 * @author: pengq
 */

public interface UserService extends BaseService<User,Integer>{
    List<User> listUserPaging();
}
