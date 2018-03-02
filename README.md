# javaBaseCode
javaBaseCode learn
# 1. java环境安装
## 1.1 下载
url: http://www.oracle.com/technetwork/java/javase/downloads/index.html
## 1.2 安装
### 1.2.1 windows 
1. 下载对应版本安装.
2. 配置环境变量 示例
-    JAVA_HOME  C:\Program Files\Java\jdk1.8.0_112
-    path 添加  %JAVA_HOME%\BIN;
### 1.2.1 linux 
1. 下载对应版本安装.
2. 配置环境变量 示例
- 编辑系统环境变量 vi /etc/profile
- 加入内容如下：
```
export JAVA_HOME=/usr/local/jdk1.7.0_71
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export PATH=$JAVA_HOME/bin:$PATH
```
#3. java 基本程序设计
##3.1 简单的 java 应用程序
```
public class FirstSample {
       public static void main(String[] args) {
           System.out.println("We will not use \"Hello, World\"");
       }
   }
```
##3.2 java 命名规范
> ** 一级包名不能为 java，可参考 http://idealab.iteye.com/blog/452404

- java规范：英文字母、数字、_、$ 
- alibaba推荐规范：
    - 代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。
    - 类名使用UpperCamelCase风格，但以下情形例外：DO / BO / DTO / VO / AO / 
      PO等
    - 方法名、参数名、成员变量、局部变量都统一使用lowerCamelCase风格，必须遵从
      驼峰形式。
    - 常量命名全部大写，单词间用下划线隔开，力求语义表达完整清楚，不要嫌名字长。
    - 抽象类命名使用Abstract或Base开头；异常类命名使用Exception结尾；测试类
      命名以它要测试的类名开始，以Test结尾。
    - 【强制】类型与中括号紧挨相连来定义
      例：定义整形数组int[] arrayDemo; 
    - POJO类中布尔类型的变量，都不要加is前缀，否则部分框架解析会引起序列化错误。 
    反例：定义为基本数据类型Boolean isDeleted；的属性，它的方法也是isDeleted()，RPC
    框架在反向解析的时候，“误以为”对应的属性名称是deleted，导致属性获取不到，进而抛
    出异常。
    - 包名统一使用小写，点分隔符之间有且仅有一个自然语义的英语单词。包名统一使用
      单数形式，但是类名如果有复数含义，类名可以使用复数形式。 
      正例：应用工具类包名为com.alibaba.ai.util、类名为MessageUtils（此规则参考spring
      的框架结构）
    - 杜绝完全不规范的缩写，避免望文不知义。
     反例：AbstractClass“缩写”命名成AbsClass；condition“缩写”命名成 condi，此类随
     意缩写严重降低了代码的可阅读性。
    - 为了达到代码自解释的目标，任何自定义编程元素在命名时，使用尽量完整的单词
    组合来表达其意
    - 如果模块、接口、类、方法使用了设计模式，在命名时体现出具体模式。 
      说明：将设计模式体现在名字中，有利于阅读者快速理解架构设计理念。 
      >正例：public class OrderFactory; 
      
      >    public class LoginProxy; 
      
      >    public class ResourceObserver;
>    SOA （面向服务的架构） : 面向服务的架构（SOA）是一个组件模型，它将应用程序的不同功能单元（称为服务）通过这些服务之间定义良好的接口和契约联系起来。接口是采用中立的方式进行定义的，它应该独立于实现服务的硬件平台、操作系统和编程语言。这使得构建在各种各样的系统中的服务可以以一种统一和通用的方式进行交互。


##3.2 java 注释
三种注释方法：
1. 单行注释   //注释的内容
2. 多行注释  /*......*/
3. /\*\*......*/，这种方式和第二种方式相似。这种格式是为了便于javadoc程序自动生成文档。
##3.3 java 数据类型
java是强类型语言。有8种基本类型（primitive type），4种整型、2种浮点类型、char、boolean；引用类型：class
##3.4 java 变量
###3.4.1 变量
- java中每一个变量属于一种类型，声明变量时类型位于变量之前。
- Java三大变量分别是类变量（静态变量）、实例变量和局部变量（本地变量）。
> 注意各变量的默认值
###3.4.2 常量
用final关键字修饰，且这个变量只能赋值一次。
* 定义
    * 方法一采用接口(Interface)的中变量默认为static final的特性
    * 方法二采用了Java 5.0中引入的Enum类型。
    * 方法三采用了在普通类中使用static final修饰变量的方法。
    * 方法四类似方法三，但是通过函数来获取常量。

> 首先定义全局变量似乎有违Java的面向对象的封装特性，增加的耦合。所以最佳的方法是避免定义全局变量。如果是参数等，可以写入配置文件。如果实在是必须的，方法二是最为推荐的。方法三是大家都能想到的，非常的直观。方法一和方法三本质上一样。方法四提供了灵活性，具体参考引用。
参考 http://www.ibm.com/developerworks/cn/java/l-java-interface/index.html
##3.5 java 运算符

