/*
* 文件名: com.ghaoxiang.springbootredis.dao
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 10:56
* 修改人:
* 修改时间: 2019年01月08日 10:56
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.springbootredis.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title RedisDao
 * @Description
 * @date 2019年01月08日 10:56
 * @since V1.0
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    public void setKey(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value, 1, TimeUnit.MINUTES);
    }

    public String getValue(String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }
}
