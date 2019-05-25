package com.company.project.configurer;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.github.pagehelper.PageHelper;
import com.zaxxer.hikari.HikariDataSource;

import tk.mybatis.spring.annotation.MapperScan;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import javax.sql.DataSource;
import java.util.Properties;

import static com.company.project.core.constant.ProjectConstant.*;

/**
 * Mybatis & Mapper & PageHelper  配置
 */
@Configuration
//扫描Mapper  basePackages要精确到source1目录便于进行不同数据源的区分
@MapperScan(basePackages = "com.company.project.dao", sqlSessionTemplateRef = "sqlSessionTemplateOne")
public class MybatisConfigurer {

  @Bean(name = "dataSourceOne")
  @ConfigurationProperties(prefix = "spring.datasource.source")
  public DruidDataSource  DataSourceOne(){

	  DruidDataSource dataSource = new DruidDataSource();
	  
	   return dataSource;

  }


  @Bean(name = "sqlSessionFactoryOne")
  @Primary
  public SqlSessionFactory sqlSessionFactoryOne(@Qualifier("dataSourceOne") DataSource dataSource)throws Exception{
	  SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
      factory.setDataSource(dataSource);
      factory.setTypeAliasesPackage(MODEL_PACKAGE);
      factory.setTypeHandlersPackage("com.company.project.core.utils.MyObjectTypeHandle");
      factory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
      //配置分页插件，详情请查阅官方文档
      PageHelper pageHelper = new PageHelper();
      Properties properties = new Properties();
      properties.setProperty("pageSizeZero", "true");//分页尺寸为0时查询所有纪录不再执行分页
      properties.setProperty("reasonable", "true");//页码<=0 查询第一页，页码>=总页数查询最后一页
      properties.setProperty("supportMethodsArguments", "true");//支持通过 Mapper 接口参数来传递分页参数
      pageHelper.setProperties(properties);
      
      //添加插件
      factory.setPlugins(new Interceptor[]{pageHelper});
      
      //添加XML目录
      ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
      factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
      
      return factory.getObject();
  }

  @Bean(name = "dataSourceTransactionManagerOne")
  @Primary
  public DataSourceTransactionManager dataSourceTransactionManagerOne(@Qualifier("dataSourceOne") DataSource dataSource){
      return new DataSourceTransactionManager(dataSource);
  }

  @Bean(name = "sqlSessionTemplateOne")
  @Primary
  public SqlSessionTemplate sqlSessionTemplateOne(@Qualifier("sqlSessionFactoryOne") SqlSessionFactory sqlSessionFactory)throws Exception{
      return new SqlSessionTemplate(sqlSessionFactory);
  }


}



