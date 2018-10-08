package pengq.common.mapper.dao;

import org.springframework.stereotype.Repository;
import pengq.common.mapper.common.BaseRepository;
import pengq.common.mapper.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * FileName:     UserDao
 *
 * @version V1.0
 * CreateDate:         2018/9/29 14:59
 * @Description: TODO(用一句话描述该文件做什么)
 * All rights Reserved, Designed By nuctech.ltd
 * Copyright:    Copyright(C) 2018-2028
 * Company       同方威视技术股份有限公司
 * @author: pengq
 */
@Repository
public interface UserDao extends BaseRepository<User,Integer> {

    List<User> findAllPaging();
}
