package com.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean s = new SqlSessionFactoryBean();
        s.setTypeAliasesPackage("com.domain");
        s.setDataSource(dataSource);
        return s;
    }
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
        MapperScannerConfigurer m = new MapperScannerConfigurer();
        m.setBasePackage("com.dao");
        return m;
    }
}
