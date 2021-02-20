package com.atguigu.springcloud.entities;

import cn.hutool.core.util.IdUtil;

public class SnowFlake {
    /**
     *
     * hutool工具包的雪花算法生成
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(IdUtil.getSnowflake(1,1).nextId());
    }
}
