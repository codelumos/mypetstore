# mypetstore

## 项目描述

用Spring Boot重构JPetStore。在原有JPetStore项目的基础上，用Spring Boot重构项目，规范基于MVC架构的开发模式。

## 基础功能

1. 用Spring Boot的@Controller注解编写控制器，简化传统Servlet的编程，统一服务端和客户端的数据传递和页面跳转。

2. 前端视图渲染：用Spring框架中的Thymeleaf模版渲染前端页面，替代传统的JSP页面。

3. ORM框架：使用MyBatis框架完成项目的数据访问模块。

## 扩展功能

1. 添加验证码功能：在用户注册和用户登录模块中添加验证码功能。

2. AJAX功能：在项目的用户注册模块（用户名是否已存在）和购物车模块（购物车结算）两个部分添加AJAX功能，提升用户体验。

3. 国际化功能：使得JPetStore的账户管理模块支持中、英文两种语言，在账户登录、账户注册两个页面的顶部提供超链接或按钮进行语言的切换。

4. 日志功能：数据库中添加日志信息表，给项目添加日志功能，用户登录后记录用户行为，比如浏览了哪些商品、将商品添加进购物车、生成订单等。

## 项目构建

在MySQL中创建jpetstore数据库，然后在库中按顺序执行mypetstore/src/main/resources/database/下的jpetstore-hsqldb-schema.sql和jpetstore-hsqldb-dataload.sql进行建表和插入数据