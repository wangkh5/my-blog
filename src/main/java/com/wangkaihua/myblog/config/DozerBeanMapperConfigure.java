package com.wangkaihua.myblog.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangkaihua
 * @create 2018-11-26 13:23
 **/
@Configuration
public class DozerBeanMapperConfigure {

    @Bean
    public DozerBeanMapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper;
    }
}
