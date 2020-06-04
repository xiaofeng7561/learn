package com.example.demo;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;

/**
 * @author AFeng
 * @date 2020/6/1 16:22
 */
public class MybatisGenerator {


    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        GlobalConfig globalConfig = new GlobalConfig();
        String projectDir = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectDir+"/src/main/java");
        globalConfig.setAuthor("auto_generate");
        globalConfig.setFileOverride(true);
        globalConfig.setOpen(false);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseColumnList(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setEntityName("%sPo");
        globalConfig.setMapperName("%sDao");
        globalConfig.setXmlName("%sDao");
        globalConfig.setServiceName("I%sService");
        globalConfig.setServiceImplName("%sServiceImpl");
        autoGenerator.setGlobalConfig(globalConfig);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://192.168.1.163:3306/maintain?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("asd1345439");
        autoGenerator.setDataSource(dataSourceConfig);

        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.demo");
        pc.setMapper("dao");
        HashMap<String, String> map = new HashMap<>(1);
        map.put(ConstVal.XML_PATH,projectDir+"/src/main/resources/mapper");
        map.put(ConstVal.ENTITY_PATH,projectDir+"/src/main/java/com/example/demo/entity");
        map.put(ConstVal.MAPPER_PATH,projectDir+"/src/main/java/com/example/demo/dao");
        map.put(ConstVal.SERVICE_PATH,projectDir+"/src/main/java/com/example/demo/service");
        map.put(ConstVal.SERVICE_IMPL_PATH,projectDir+"/src/main/java/com/example/demo/service/impl");
        pc.setPathInfo(map);
        autoGenerator.setPackageInfo(pc);

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setEntityBuilderModel(true);




        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.execute();


    }

}
