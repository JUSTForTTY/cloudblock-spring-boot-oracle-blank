package com.company.project.configurer;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.github.pagehelper.PageHelper;
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

import tk.mybatis.spring.annotation.MapperScan;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

import static com.company.project.core.constant.ProjectConstant.*;

/**
 * Mybatis & Mapper & PageHelper 配置
 */
@Configuration
//扫描Mapper  basePackages要精确到source1目录便于进行不同数据源的区分
@MapperScan(basePackages = "com.company.project.outer.dao", sqlSessionTemplateRef = "sqlSessionTemplateTwo")
public class MybatisOtherConfigurer {

@Bean(name = "dataSourceTwo")
@ConfigurationProperties(prefix = "spring.datasource.source2")
public DataSource DataSourceOne(){
    DruidDataSource dataSource = new DruidDataSource();
    return dataSource;

}

@Bean
public ServletRegistrationBean druidStatViewServlet() {
    ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    registrationBean.addInitParameter("allow", "http://www.sisoccp.cn"); // IP白名单 (没有配置或者为空，则允许所有访问)
    registrationBean.addInitParameter("deny", ""); // IP黑名单 (存在共同时，deny优先于allow)
    registrationBean.addInitParameter("loginUsername", "tty");
    registrationBean.addInitParameter("loginPassword", "18020285665");
    registrationBean.addInitParameter("resetEnable", "false");
    return registrationBean;
}

@Bean
public FilterRegistrationBean druidWebStatViewFilter() {
    FilterRegistrationBean registrationBean = new FilterRegistrationBean(new WebStatFilter());
    registrationBean.addInitParameter("urlPatterns", "/*");
    registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
    return registrationBean;
}


@Bean(name = "sqlSessionFactoryTwo")
public SqlSessionFactory sqlSessionFactoryTwo(@Qualifier("dataSourceTwo") DataSource dataSource)throws Exception{
	  SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
    factory.setDataSource(dataSource);
    factory.setTypeAliasesPackage(USER_MODEL_PACKAGE);
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
    factory.setMapperLocations(resolver.getResources("classpath:mapperouter/*.xml"));
    
    return factory.getObject();
}

@Bean(name = "dataSourceTransactionManagerTwo")
public DataSourceTransactionManager dataSourceTransactionManagerTwo(@Qualifier("dataSourceTwo") DataSource dataSource){
    return new DataSourceTransactionManager(dataSource);
}

@Bean(name = "sqlSessionTemplateTwo")
public SqlSessionTemplate sqlSessionTemplateTwo(@Qualifier("sqlSessionFactoryTwo") SqlSessionFactory sqlSessionFactory)throws Exception{
    return new SqlSessionTemplate(sqlSessionFactory);
}
}




