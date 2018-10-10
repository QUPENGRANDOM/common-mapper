package pengq.common.mapper.generator;

import tk.mybatis.mapper.genid.GenId;

import java.util.UUID;

/**
 * FileName:     UUIDGenerator
 *
 * @version V1.0
 * CreateDate:         2018/10/10 17:20
 * @Description: TODO(用一句话描述该文件做什么)
 * All rights Reserved, Designed By nuctech.ltd
 * Copyright:    Copyright(C) 2018-2028
 * Company       同方威视技术股份有限公司
 * @author: pengq
 */

public class UUIDGenerator implements GenId<String> {

    @Override
    public String genId(String s, String s1) {
        return UUID.randomUUID().toString();
    }
}
