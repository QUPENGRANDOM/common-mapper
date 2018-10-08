package pengq.common.mapper.common.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pengq.common.mapper.common.BaseRepository;
import pengq.common.mapper.common.BaseService;

import javax.annotation.Resource;
import java.util.List;

/**
 * FileName:     BaseServiceImpl
 *
 * @version V1.0
 * CreateDate:         2018/10/8 10:22
 * @Description: TODO(用一句话描述该文件做什么)
 * All rights Reserved, Designed By nuctech.ltd
 * Copyright:    Copyright(C) 2018-2028
 * Company       同方威视技术股份有限公司
 * @author: pengq
 */
@Service
public class BaseServiceImpl<T,ID> implements BaseService<T,ID> {
    @Autowired
    BaseRepository<T,ID> repository;

    @Override
    public int insert(T entity) {
        return repository.insertSelective(entity);
    }

    @Override
    public int save(T entity) {
        T t = repository.selectByPrimaryKey(entity);
        if (t == null){
            return repository.insertSelective(entity);
        }
        return repository.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(T entity) {
        return repository.delete(entity);
    }

    @Override
    public int deleteOneById(ID id) {
        return repository.deleteByPrimaryKey(id);
    }

    @Override
    public int set(T entity) {
        return repository.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> findAll() {
        return repository.selectAll();
    }

    @Override
    public T findOneById(ID id) {
        return repository.selectByPrimaryKey(id);
    }
}
