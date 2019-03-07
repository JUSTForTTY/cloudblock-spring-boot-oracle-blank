//package com.company.project.configurer;
//
//import static com.company.project.core.constant.ProjectConstant.USER_MAPPER_INTERFACE_REFERENCE;
//import static com.company.project.core.constant.ProjectConstant.USER_MAPPER_PACKAGE;
//
//import java.util.Properties;
//
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//
//import tk.mybatis.spring.mapper.MapperScannerConfigurer;
//
///**
// * MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer <br/>
// * 如果你不使用通用Mapper，可以改为org.xxx...
// *
// */
//@Configuration
////TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
//@AutoConfigureAfter(MybatisOtherConfigurer.class)
//public class MyBatisOtherMapperScannerConfig {
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//    	 MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//         mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryTwo");
//         mapperScannerConfigurer.setBasePackage(USER_MAPPER_PACKAGE);
//
//         //配置通用Mapper，详情请查阅官方文档
//         Properties properties = new Properties();
//         properties.setProperty("mappers", USER_MAPPER_INTERFACE_REFERENCE);
//         properties.setProperty("notEmpty", "false");//insert、update是否判断字符串类型!='' 即 test="str != null"表达式内是否追加 and str != ''
//         properties.setProperty("IDENTITY", "MYSQL");
//         mapperScannerConfigurer.setProperties(properties);
//        return mapperScannerConfigurer;
//    }
//
//}