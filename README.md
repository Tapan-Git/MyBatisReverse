# MyBatis逆向工程

本项目为个人学习笔记，分享至此，以免忘记，也提供给有需要的人，新手初学，大佬勿喷。

<br>
这里我使用的是IDEA + Maven来创建 MyBatis 逆向工程的项目，当然，你也可以使用其他开发工具，甚至不适用Maven，这个看你个人而定。

如果你不使用Maven来进行管理项目的话，那么你需要去官网下载最新的MyBatis逆向工程的依赖，目前最新版本是1.3.7，以及其他各种依赖Jar包，比如数据库的，MyBatis的，Logo4j的...

1. MyBatis逆向工程下载地址（[下载地址](https://github.com/mybatis/generator/releases "MyBatis逆向工程下载地址")）
2. MyBatis逆向工程官方文档（[官方文档](http://www.mybatis.org/generator/ "MyBatis逆向工程官方文档")）
3. MyBatis逆向工程问题解答（[传送门](http://www.baidu.com "MyBatis逆向工程万能解决")）

## 第一步，使用Idea创建Maven项目

1. 打开Idea,新建项目：+ Create New Project
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184033294.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)
2. 左侧选择Maven，直接Next
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184106155.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)
3. 输入项目的GroupId以及ArtifactId,然后Next
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184113915.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)
4. 这里我是没管它，直接Finish了
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184120876.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)
5. 这样，一个IDEA的Maven项目就创建完成了，大致的项目结构如下图所示，如果是第一次创建Maven项目，还请耐心等待一下，系统需要下载相应的Jar包。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184131900.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)
<br>
<hr>

## 第二步，配置pon.xml
在pom.xml中添加如下依赖：
<p>

 1. mybatis-generator-maven-plugin插件
 2. mybatis
 3. log4j
 4. mybatis-generator
 5. mysql<br></p>

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.tool</groupId>
    <artifactId>MyBatisReverse</artifactId>
    <version>1.0-SNAPSHOT</version>

    <build>
        <plugins>
            <!-- mybatis-generator自动生成代码插件 -->
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.6</version>
            </plugin>
        </plugins>
    </build>
    <dependencies>
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.2.3</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>6.0.6</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.6</version>
        </dependency>
    </dependencies>

</project>
```

<hr>

## 第三步，创建generationConfig.xml文件并配置内容

```
<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<!-- Generator 配置文件 -->
<!-- Tapan  2019年5月7日 16:18:08 -->
<generatorConfiguration>
    <context id="mybatisGenerator" targetRuntime="MyBatis3">
        <commentGenerator>
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="true" />
        </commentGenerator>
        <!--数据库连接的信息：驱动类、连接地址、用户名、密码 -->
        <jdbcConnection driverClass="com.mysql.cj.jdbc.Driver"
                        connectionURL="jdbc:mysql://localhost:3306/数据库名称?
                                serverTimezone=CTT&amp;useUnicode=true&amp;characterEncoding=utf-8&amp;allowMultiQueries=true" userId="root"
                        password="密码">
        </jdbcConnection>

        <!-- 默认false，把JDBC DECIMAL 和 NUMERIC 类型解析为 Integer，为 true时把JDBC DECIMAL 和
            NUMERIC 类型解析为java.math.BigDecimal -->
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false" />
        </javaTypeResolver>

        <!-- targetProject:生成实体类的位置 -->
        <javaModelGenerator targetPackage="pojo"
                            targetProject=".\src">
            <!-- enableSubPackages:是否让schema作为包的后缀 -->
            <property name="enableSubPackages" value="false" />
            <!-- 从数据库返回的值被清理前后的空格 -->
            <property name="trimStrings" value="true" />
        </javaModelGenerator>
        <!-- targetProject:mapper映射文件生成的位置 -->
        <sqlMapGenerator targetPackage="mapper"
                         targetProject=".\src">
            <!-- enableSubPackages:是否让schema作为包的后缀 -->
            <property name="enableSubPackages" value="false" />
        </sqlMapGenerator>
        <!-- targetPackage：mapper接口生成的位置 -->
        <javaClientGenerator type="XMLMAPPER"
                             targetPackage="mapper"
                             targetProject=".\src">
            <!-- enableSubPackages:是否让schema作为包的后缀 -->
            <property name="enableSubPackages" value="false" />
        </javaClientGenerator>
        <!-- 指定数据库表 -->
        <!-- 如果要生成所有表，将tableName的属性修改为“%”即可 -->
        <table tableName="表名或%"></table>
        <!--<table tableName="orders"></table>
        <table tableName="orderdetail"></table>
        <table tableName="user"></table>-->

        <!-- 有些表的字段需要指定java类型
         <table schema="" tableName="">
            <columnOverride column="" javaType="" />
        </table> -->
    </context>
</generatorConfiguration>
```

 
 <hr>
 
## 第四步，创建Java类Generator，由官方提供

```
package test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis官方提供的逆向工程Java类
 * @author Tapan
 * 2019年5月7日 16:15:47
 */
public class Generator {
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        /**指向逆向工程的配置文件*/
        File configFile = new File("src/main/resources/generationConfig.xml");
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration config = parser.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }
    public static void main(String[] args) throws Exception {
        try {
            Generator generatorSqlmap = new Generator();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```

<hr>
自此，MyBatis逆向工程项目就创建完成了，现在的项目结构如图所示：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184441227.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)

<br>
接着，你只要运行Java类Generator中的Main方法，即可得到由MyBatis为你生成的实体类以及接口，Mapper文件等！运行完之后是不是发现多了两个很可爱的文件夹？哈哈，很神奇呢！

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190507184634729.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTEyNzkwMDI=,size_16,color_FFFFFF,t_70)

<br><hr>
