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

##3.2 java 注释
