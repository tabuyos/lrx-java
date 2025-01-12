package com.sveta.mybatis.customize;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.github.yulichang.base.MPJBaseMapper;
import com.github.yulichang.base.MPJBaseService;
import com.github.yulichang.base.MPJBaseServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {

    public static void main(String[] args) {
        byMyBatisPlus();
    }

    public static void byMyBatisPlus() {
        AutoGenerator generator = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir") + "/mybatis-customize/src/main/v1");
        gc.setAuthor("Sveta");
        gc.setOpen(false);
        gc.setSwagger2(true);
        gc.setFileOverride(true);

        generator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis_customize?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");

        generator.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.sveta.mybatis.customize");

        generator.setPackageInfo(pc);

        // 自定义配置
        generator.setCfg(injectionConfig());

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        templateConfig.setController("customize/controller.java");
        templateConfig.setXml(null);

        generator.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperMapperClass(MPJBaseMapper.class.getCanonicalName());
        strategy.setSuperServiceClass(MPJBaseService.class.getCanonicalName());
        strategy.setSuperServiceImplClass(MPJBaseServiceImpl.class.getCanonicalName());
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 写于父类中的公共字段
        strategy.setSuperEntityColumns("id");
        strategy.setInclude("user");
        strategy.setControllerMappingHyphenStyle(true);

        generator.setStrategy(strategy);
        generator.setTemplateEngine(new FreemarkerTemplateEngine());
        generator.execute();
    }

    public static InjectionConfig injectionConfig() {
        return new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("user", Map.of("name", "tabuyos"));
                this.setMap(map);
            }

            @Override
            public Map<String, Object> prepareObjectMap(Map<String, Object> objectMap) {
                return super.prepareObjectMap(objectMap);
            }
        };
    }

}