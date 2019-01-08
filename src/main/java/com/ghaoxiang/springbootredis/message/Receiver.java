/*
* 文件名: com.ghaoxiang.springbootredis.message
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 11:33
* 修改人:
* 修改时间: 2019年01月08日 11:33
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.springbootredis.message;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title Receiver
 * @Description
 * @date 2019年01月08日 11:33
 * @since V1.0
 */
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        LOGGER.info("Received <" + message + ">");
        latch.countDown();
    }
}
