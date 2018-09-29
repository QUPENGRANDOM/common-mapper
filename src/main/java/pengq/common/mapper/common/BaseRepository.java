package pengq.common.mapper.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * FileName:     BaseRepository
 *
 * @author : pengq
 * @version V1.0
 * CreateDate:         2018/9/29 14:52
 */
public interface BaseRepository<T> extends Mapper<T>, MySqlMapper<T> {

}
