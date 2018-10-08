package pengq.common.mapper.common;

import java.util.List;

/**
 * FileName:     BaseService
 *
 * @version V1.0
 * CreateDate:         2018/10/8 10:14
 * @Description: TODO(用一句话描述该文件做什么)
 * All rights Reserved, Designed By nuctech.ltd
 * Copyright:    Copyright(C) 2018-2028
 * Company       同方威视技术股份有限公司
 * @author: pengq
 */

public interface BaseService<T,ID> {
    int insert(T entity);
    int save(T entity);
    int delete(T entity);
    int deleteOneById(ID id);
    int set(T entity);
    List<T> findAll();
    T findOneById(ID id);
}
