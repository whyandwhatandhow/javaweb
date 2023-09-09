# javaweb-And-Spring
java
2023/4/29
Junit单元测试
1.黑盒测试：不知道代码的测试
2.白盒测试：知道运行原理的测试
步骤
1，添加测试类 xxxTest
包名：xxx.xxx.xx.test
2，定义测试方法：可以独立运行
testAdd（）返回值void  空参
3，给方法加上@Test  ,会直接执行
4,导入Junit依赖
用Junit一般看红色还是绿色，红色失败，绿色是通过
Assert方法，断言，防止加号写出减号，根本上就不对
@Before
@After

反射：框架设计灵魂
概念：将各个类的组成部分封装为其他对象
获取Class对象的方式：
1.Class.forName("全类名")，将字节码加入内存，返回class对象
2.类名.class: 通过类名的属性class获取
3.对象getClass():getClass()方法在Object类中定义着。
同一个字节码文件在一次程序运行过程中只会被加载一次
Class 对象功能：（ReflectDemo2）
获取功能：
1.获取成员变量
2.获取构造方法
3.获取成员方法
4.获取类名
反射案例！（写一个小“框架”，创建任意类对象，并执行方法）
步骤：
1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
2.在程序中加载读取配置文件
3.使用反射技术加载类配置文件进内存
4.创建对象
5.执行方法


2023/4/30
注解：
概念：给计算机看的，不是给程序员看的，那是注释
就是@Override这种

2023/5/7
上次看到jdk里面自带的注解，母亲啊来试试怎么自己定义注解
格式：
元注解
public @interface
注解的本质：就是默认继承一个接口
public interface MyAnno extends java.lang.annocation.Annocation{}
属性：
接口中定义的成员方法（不允许void）
定义了注解后要给每个属性赋值

定义枚举类型

常见的注解赋值：
@MyAnno(show = "张三",display = 20,per = PersonMan.P1,anno2 = @MyAnno2)



2023/5/11
元注解:用于描述注解的注解
@Target:描述注解能够作用的位置（类/方法）
@Retention:描述注解被保留的阶段（源码，class，运行阶段）
@Documented:描述注解是否被抽取到api文档中
@Inheriter:描述注解是否被子类继承


注解的作用{自定义的值有什么用}
以之前加载配置文件为例子，可以用注解替代加载类这一部分的



2023/5/13
写一个注解的简单框架，测试计算器类





2023/5/14
开始javaweb的正式学习
数据库+html+Web核心
1.数据库（DB）MySQL服务器
my.ini配置文件：可以对数据库一些常用配置进行设置，如：engineer、port、character等，因此这个文件也是非常重要的，当然也可以全部使用默认配置的形式。
DCL(授权)
DDL（数据定义）create，alter，drop------CRUD
DML（数据操作）insert这些
DQL(数据查询)select
DCL(数据控制)GRANT，REVOKE

原有的数据库
information_schema（视图）
mysql（表）
performance_schema（性能）

设置外键的时候设置级联，就可以同时改两个表的id ON UPDATE CASCADE；



2023/5/16
网络编程：
常见的网络程序都可以用java.net 包下实现。
常见的软件架构：CS: client server 客户端服务器（要下载客户端的）
BS: brower server

BS: 游戏的话，画面太烂(开发起来简单，而且用户使用简单)
CS: 安装包中用到的都是图片音乐等等。
网络编程三要素：IP（设备的唯一地址） 端口号（应用程序的唯一标识） 协议（数据的传输规则 UDP TCP http）
IP: IPV4/IPV6
IPV4 不够用，是32位
IPV4分类：公网（万维网），局域网（私有地址192.168.0.0-192.168.255.255）
特殊ip：127.0.0.1是localhost是本机ip，不经过外网

InetAddress类
表示ip的对象
端口号：
0~65535
0~1023用于知名网络服务和应用
我们自己要用的话就用1024以上的

协议：
UDP协议：用户数据报协议
面对无连接通信协议（不管对方是否存在都发送），数据快，64k，数据不安全，已丢失。
TCP协议（反过来的）面向连接

UDP:
DatagramSocket socket = new DatagramSocket();快递公司
InetAddress allByName = InetAddress.getByName("127.0.0.1");发送位置
int port=10086;//接受端
DatagramPacket packet = new DatagramPacket(bytes, bytes.length,allByName,port);打包数据
socket.send(packet);发送


接受
DatagramSocket datagramSocket=new DatagramSocket(10086);
datagramSocket.receive(datagramPacket);接受
解析同样是用byte
//广播只要把host改成255.255.255.255
//MulticastSocket组播对象




2023/5/17
TCP通讯协议，与UDP不同的是必须要确保连接已经建立
是用IO流接受数据的
1.创建Socket对象-----服务器接受ServerSocket对象，并且监听连接
2.获取输出流----------获取输入流
3.释放资源 -----释放资源


2023/5/18
TCP的
三次握手
用于确保连接建立
客户端往服务器发出连接请求，等待服务器确认，
服务器再返回，请求客户端确认，
客户端再向服务器发出确认请求

四次挥手
用于确保连接断开，同时保证数据传输完成
客户端发出取消链接请求
服务器表示确认收到
服务器将最后数据处理完毕，再发出确认取消信息
客户端再次发送确认信息

//写一个结束输出的标记，不然不会继续下面的语句
socket.shutdownOutput();




2023/5/22
UUID类，生成随机字符串，做文件名。
UUID.randomUUID().
String name=UUID.randomUUID().toString().replace("-","");

重要的一天课程！！
文件这种大的用Buffer包装
Client：
读取本地照片
new BufferedInputStream(new FileInputStream("D:\\Java编程\\JunitTest\\clientdir\\证件照.jpg"));
包装要发出去的
new BufferedOutputStream(outputStream);
一个个字节读取出来发出去
//用字节方法写出去
byte[] bytes=new byte[1024];
int len;
while ((len=bufferedInputStream.read(bytes))!=-1){
bufferedOutputStream.write(bytes,0,len);
}


Server:
//读取数据并且保存到本地文件
BufferedInputStream bis=new BufferedInputStream(accept.getInputStream());
BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Java编程\\JunitTest\\serverdir\\"+name+".jpg"));
//写到接收里面
int len;
byte[] bytes=new byte[1024];
while ((len=bis.read(bytes))!=-1){
bos.write(bytes,0,len);
}


2023/5/23
数据库
多表查询就是用笛卡尔积
事务：要么同时成功，要么同时失败
start transaction;
roll back 回滚

事务的四大特征（面试）：原子性，持久性，一致性，隔离性。
查询用户：
Use mysql；
SELECT *FROM USER；



2023/5/27
JDBC:java data base connection
是官方（sun公司）定义的一套操作所有关系型数据库的规则，及接口，各个数据库厂商去实现这套接口，提供数据库驱动jar包，我们可以用之编程

入门：
导入jar包
注册驱动  
//注册驱动
Class.forName("com.mysql.jdbc.Driver");
获取数据库连接对象Connection
定义sql
获取statement对象
处理结果
int i = statement.executeUpdate(sql);
System.out.println(i);
释放资源

DriverManager:驱动管理对象
注册驱动：告诉程序该使用哪个数据库
获取数据库连接

Connection:数据库连接对象
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsgl", "root", "42391523");
可以用于管理事务

Statement:执行sql的对象
int executeUpdate(str) 用于执行DML,DDL（creat,drop..）//几行收到影响
ResultSet executQuery(str)//查询地，返回结果集

ResultSet:处理结果的对象
next()：游标向下一个移动，是一行行地获取，开始是在表头
getxxx（）：代表数据类型，getint(),getString()
参数：Int：代表列编号
String 代表列名称

PreparedStatement:执行sql的对象



2023/5/29
用类来封装数据，来查询（需要对应字段）
List<Emp> list=new ArrayList<Emp>();
emp=new Emp();
emp.setEmp_no(id);
emp.setEmp_name(name);。。。
list.add(emp);

调用： List<Emp> list=new QueryTest02().findAll();
System.out.println(list);





2023/5/30
登录小案例

PreparedStatement 对象
（为了防止sql注入）“密码为恒等式”

预编译sql，参数使用？作为占位符，执行sql给问好赋值
不同在于定义sql时使用？占位，而不是拼接
SetXX（1，2）
1.？的位置编号
2.？的值

String sql="select * from user where username = ? and password =? ";
statement=con.getConnection().prepareStatement(sql);-------这里传入sql
statement.setString(1,username);
statement.setString(2,password);



2023/5/31
JDBC管理事务
三个操作
：开启事务setAutoCommit()
在执行sql前开启事务
：提交事务commit()
在结束执行后提交，如果有自动提交就不用
：回滚事务rollback()
在catch中回滚


数据库连接池：用于简化申请连接（服务员要一直使用，不能用一个开除一个）
当系统初始化好了以后，容器被创建，容器中会申请一些连接对象，当用户访问数据库时
从容器中获取连接对象，访问完后，归还到容器里面。（节约资源，访问高效）

实现
1：标准接口：DataSourse  在javax.sql中 getConnection()
由数据库厂商实现
1.C3P0: 数据库连接池技术
2.Druid：新技术 阿里巴巴的
核心对象：ComboPooledDataSourse
getconnection()



2023/6/4
druid连接池工具类
静态代码块，初始化

static {
try {
Properties pro=new Properties();
pro.load(druid.class.getClassLoader().getResourceAsStream("druid.properties"));
ds= DruidDataSourceFactory.createDataSource(pro);
} catch (IOException e) {
e.printStackTrace();
} catch (Exception e) {
e.printStackTrace();
}
}

获取连接方法
public static Connection getConnection() throws SQLException {
return ds.getConnection();
}

释放资源
获取连接池方法


*Spring 框架对jdbc的封装，Template对象(用于写sql更简单)
a.导入jar包
b.创建JDBCTemplate对象，但是要依赖于数据源
c.调用他的方法完成CRUD
JdbcTemplate jdbcTemplate=new JdbcTemplate(druid.getDataSource());
//调用方法
String sql="update user set password = 'chpig' where id =? ";
jdbcTemplate.update(sql,1);



全部查询  自动封装
public static void main(String[] args) {
JdbcTemplate jdbcTemplate=new JdbcTemplate(druid.getDataSource());
String sql="select * from employee";
List<Emp> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class));
for(Emp emp:list){
System.out.println(emp);
}
}



软件架构：
1.C/S Client/Server
2.B/S Brower/server
静态资源：图片，文本，音频，html，css，javascrip   浏览器内置引擎解析
动态资源：例如：“欢迎回来xxx” jsp serblet php asp  先变成静态资源再发给浏览器





2023/7/8
JavaScript=(BOM+DOM)两个公司不同的东西，是两个对象


1.内部Script
在内部放script标签
<script>alert("18禁")</script>

2.外部的Script
写一个js文件，在里面直接写代码
<script src="js/a.js"></script>

数据类型：
(原始数据类型)
number
string
boolean
null
undefined:未定义的变量，没有初始化的变量


变量：弱变量 var 变量名=初始化；
输出：document.write(num);




2023/7/9
运算符与Java规则基本相同
NaN：数字类型，如果abc+1就是nan
用了 var则是局部变量，没用就是全局变量
各种循环规则一样的

js的基本对象
Array
Function
Date
Math

方法的使用
function fun(a,b){
document.writeln("this is a function");
document.write(a+b);
}

join 连接数组，默认是“，”
push（）加元素





2023/7/10
Global对象:编码解码
DOM:控制html文档内容
获取页面的标签Element
var light=document.getElementById("id值");
可以设置属性值，可以通过改src来实现图片的变换
可以修改标签内容，innerHTML()=xxx
var light=document.getElementById("1");
alert(light);
var title=document.getElementById("digege");
alert("change");
title.innerHTML="wudi";

图片绑定事件onclick
点击图片来回切换


BOM:浏览器对象模型
Window对象：不需要创建，可以直接使用window.fun()
有var flag=confirm("确定要退出嘛");//两个按钮，这种方法。
alert(flag);
对话框
prompt("请输入xxx");

*打开关闭

openBtn.onclick=function(){
newWindow= open("tf.icu");
}
var closeBttn=document.getElementById("closeBtn");
closeBttn.onclick=function(){
// close();关闭当前

	//谁调用就关闭谁
	newWindow.close();
}


*定时器
*轮播图  （图片名字的作用）
var number=1;
function changeImgage(){
number++;
if(number>3){
number=1;
}
var img=document.getElementById("3");
img.src="img/i"+number+".jpg";
}

//定时器
var time=setInterval(changeImgage,3000);



Location地址栏对象--URL
location.reload()刷新
location.href="www.sss.com"获取URL


*History对象




2023/7/11
DOM：文档对象模型
W3C(万维网的标准，用来前端后端文档动态交互)
有HTML DOM   XML DOM   核心DOM
Document对象
Element元素对象
Node节点对象

动态表格
appendChild()  removeChild();

Bootstrap 前端框架
DOM事件：如单击，双击，键盘，鼠标移动（事件监听机制）

点击： onclick,ondblclick;
焦点： onblur :失去焦点，onfocus:获得元素焦点
加载事件：onload 页面或图片加载完成----等所以页面加载完成再出发js
鼠标事件：onmousedown按下 onmouseup松开 onmousemove被移动 onmouseover在之上 onmouseout在某元素被移开
键盘事件：onkeydown onkeyup onkeypress按下并松开
选择和改变：onchange区域内容被选中 onselect文本被选择
表单事件：onsubmit确认被点击



2023/7/13
选择框
<form action="#">//提交到的路径
			<input type="text" name="username" id="username">
			<select id="city">
				<option>请选择</option>
				<option>xian</option>
				<option>南昌</option>
			</select>
			<input type="submit" id="submit" name="提交" />
		</form>



XML:自定义标签
配置文件，在网络中传输
xml是存储数据的，html是展示数据的
version:版本号，必须属性
encoding:编码方式
standalone:是否独立

可以结合css

不用转义符
CDATA区: <![CDATA[
if(a>b){
}

            ]]>

约束文档：
框架对程序员的约束  DTD简单的  Schema:复杂的


可以通过DOM树来解析，就是占内存
SAX逐行读取


解析XML
Jsoup:可以解析html，xml基于DOM

//获取Document对象
String path=JsoupDome1.class.getClassLoader().getResource("cn/itcast/XML/jsoup/test.xml").getPath();
System.out.println(path);
//获取dom树
Document parse = Jsoup.parse(new File(path), "utf-8");
//获取元素对象,根据标签名称
Elements names= parse.getElementsByTag("name");
System.out.println(names.size());
Element element = names.get(0);
System.out.println(element);

上面是一级级的查找

直接查找：Elements name = document.select("name");






2023/7/18
web服务器软件：Tomcat，可以部署web项目，让用户通过浏览器访问这些项目
Servlet
静态资源就是js css这种，而动态资源就是先要变成静态，再响应

点击tomcat里面的statup.bat
部署web项目：将静态资源放到webapps里面，http://192.168.1.104:8080/jsStudy/index.html访问

可以打包成war包，直接放到里面慢，war包就会直接存在

可以配置虚拟目录:在Conf/server.xml中
<Context docBase="D:\hello" path="/hehe" />以后就是hehe访问了
也可以在conf/Catalina/localhost里面创建xml文件
<Context docBase="D:\hello" />
虚拟路径就是xml的文件名称----推荐

动态项目和静态项目的目录结构的区别
--项目根目录
WEB-INF  说明是的动态的
web.xml项目配置核心文件
classes 字节码文件
lib放jar包的



2023/7/20
javaee api：https://docs.oracle.com/javaee/7/api/
创建javaWeb
在idea里面创建tomcat，添加工件就是WEBAPP那个文件

Servlet:
动态资源，Java类不需要主方法，由tomcat来执行他，但是这种类要遵守一些规则，就是接口
servlet就是接口
创建javaee项目：
定义一个类，实现servlet接口
实现接口中的类



2023/7/21
创建好类后要在WEB-INF里面配置

<servlet>
        <servlet-name>servletDemo</servlet-name>
        <servlet-class>web.servlet.servletDemo</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>servletDemo</servlet-name>
        <url-pattern>/servletDemo</url-pattern>
    </servlet-mapping>


然后这样访问
http://localhost:8080/HelloJavaweb_war_exploded/Demo

线程问题：因为init执行一次，所以里面定义的值不要再修改


可以用注解配置
@WebServlet(urlPatterns = "/demo")
@WebServlet("/demo")


之后用HttpServlet继承
doGet() 在请求行url中，网址
doPost(); 在请求体中，专门的参数


HTTP协议
基于TCP/IP的高级协议

请求头：客户端告诉服务器从哪里来的
请求正文：封装POST请求消息的请求参数
referer用于防止盗链，用于广告
判断是不是这个页面


2023/7/22
Request和Response封装了消息，是由tomcat创建的
我们通过request请求消息，通过response设置响应

request:
获取请求行
获取请求头
获取请求体


2023/7/23
请求转发，跳转访问
System.out.println("4被访问了");

RequestDispatcher requestDispatcher = req.getRequestDispatcher("/request_42");
requestDispatcher.forward(req,resp);
只能内部


共享数据
域对象：一个有范围的对象，可以共享数据
request域：代表一次请求的范围，一般可以用于转发多个资源共享数据

get/setAttribute



2023/7/31
登录案例：
username+password
数据库连接池druid
创建类LoginServlet User UserDao(操作数据库中User类) JDBCUtils



2023/8/2
响应请求：
状态码
100：未接受完
200：接收完成
302：重定向
304：叫你不要在下载资源，去自己内存找
400：客户端错误(404)路径没有对应的资源（405表示请求方式和对应的方法doxx少了
500：服务器错误

Response方法
setStautus(int sc)
setHeader(name , value)

重定向：由a告诉浏览器302，和b的地址
//设置状态码302
resp.setStatus(302);
//设置响应头
resp.setHeader("location","/HelloJavaweb_war_exploded/response_2");



//或者
resp.sendRedirect("/HelloJavaweb_war_exploded/response_2");


request转发特点：
地址栏不变    只能访问当前服务器   转发是一次请求
response重定向特点
地址栏变化，要重新定义   可以访问其他站点   重定向是两次请求


2023/8/3
输入输出字符流
resp.setContentType("text/html;charset=utf-8");
//     resp.setCharacterEncoding("GBK");
PrintWriter writer = resp.getWriter();
writer.write("中文乱码");

ServletContext对象
容器


2023/8/4
获取MIME类型：互联网中的一种文件数据类型
域对象：共享数据  设置属性，键值对这种
获取文件真实路径：


文件下载：
超链接的资源能被解析，则在浏览器中解释，否则弹出提示框
任何资源都弹出下载提示框
使用响应头设置资源的打开方式
contend-disposition:attachment;filement=xxx


1.定义servlet获取文件名称
2.字节流输入到文件加内存
3.指定响应头
4.将数据写入response



2023/8/22
会话技术
Cookie  Session
Jsp:动态资源

会话：一次会话中包含多次请求和响应，直到一方断开为止---共享数据
客户端会话技术：cookie
服务器端会话技术：Session


2023/8/23
cookie在浏览器里面，浏览器关闭后就消失啦
持久化：
setMaxAge(int seconds)
正数延长，负数默认，0消除


案例看是否是首次访问

JSP既可以写前端又可以写Java代码
<% 代码 %>
<% !代码 %>定义变量
<% =代码 %>输出到页面上




2023/8/29
MVC:开发模式
M:模型 查询数据业务逻辑,封装对象（JaavBean）
V:View视图  展示数据  (html)
C:控制器  获取客户输入，调用模型(Servlet)


EL表达式：Expression Language
替换jsp的Java代码  ${xxx}
获取值：
${域名.键名}

隐式对象
pageContext.request
获取虚拟目录

<%@   %>导入库

JLTS标签
javaserver pages Tag Library标准标签库
简化和替换Java代码 将list的数据展示到页面
if
<%--    c:if标签--
test必须属性 接收boolen表达式，ture则接收，显示，否则不显示
--%>
<c:if test=""></c:if>


choose
foreach



2023/8/30
三层架构:软件设计架构
界面层web
业务逻辑层service
数据访问层dao

案例：
需求：增删改查
设计：
技术选型：servlet+jsp+mysql+jdbctemplete+Duird+BeanUtils+Tomcat
数据库设计：



2023/8/31

链接数据库总是出错：需要把mysql的jar包放到tomcat的lib目录下

这样遍历



2023/9/4
Filter:过滤器
判断是否登录，如果没有登录则不可以访问后面的资源
统一编码处理
每个屏蔽字符

拦截资源路径:/index.sjp 之拦截这个
拦截目录： /user/*
拦截后缀名: *.jsp
拦截所有： /*



Git
mkdir xxx新建目录
touch xxx.html新建文件
cd ..退出目录
pwd 当前是在哪里
clear 清屏
ls 列出当前文件有多少文件
mv 移动 mv index.html gitCode
git config -l  本地配置

发送
git add  working drectory->暂存区Index
git commit  ->本地仓库repository
git push    -> remote

接收
git pull
git reset
git checkout


要在git上下载项目就
git clone +url

查看文件状态
git status 查看文件状态

git commit -m  提交暂存区中的内容到本地

*.txt  txt不会上传
!lib.txt 除了lib


将远程的git拷贝到项目中

例如：
git add.
git commit -m "new file hello.java"
git push


分支的作用：master
如果分支没有打扰还好，有交汇就要处理


列出分支：
git branch -r
新建
git branch -b [name]
合并到当前分支
git merge [branch]
删除
git branch -d [name]

2023/9/5
IOC：控制反转，就是不需要自己new对象了，由外部提供，IOC提供，被创建的对象统称Bean
DI:依赖注入，例如自动绑定service 和 dao的依赖关系
<!--    2.配置bean  -->
    <bean id="bookdao" class="spring.dao.impl.BookDaoImpl"/>
    <bean id="bookService" class="spring.service.impl.BookServiceImpl">
<!--        property表示配置属性-->
<!--        name是类中的属性-->
<!--        ref是bean中的属性-->
        <property name="bookDao" ref="bookdao"></property>
    </bean>


主要是不要使用new了service和dao之间也不用new

spring 默认创建是单例
scope="prototype"切换多个

spring是用构造方法造对象

使用工厂造对象
<bean id="bookDaoFactory" class="spring.factory.BookFactory"></bean>
<!--    不需要class了-->
<bean id="bookdao" factory-bean="bookDaoFactory" factory-method="getBookDao"></bean>


<!--    方法四，factoryBean-->
<bean id="bookdao" class="spring.factory.BookDaoFactoryBean"></bean>


setter注入
有基础类型赋值
<bean id="userDao" class="spring.dao.impl.UserDaoImpl">
<property name="count" value="123"/>
<property name="name" value="ymd"/>
</bean>

构造方法注入
<constructor-arg name="bookDao" ref="bookdao"/>

自动装填
<bean id="userService" class="spring.service.impl.UserServiceImpl" autowire="byType"/>

加载配置文件
<bean id="database" class="com.alibaba.druid.pool.DruidDataSource">
<property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
<property name="url" value="jdbc:mysql://localhost:3306/software"/>
<property name="username" value="root"/>
<property name="password" value="42391523"/>
</bean>


开新的命名空间
xmlns:context="http://www.springframework.org/schema/context"
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context.xsd


 <bean id="database" class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="${driverClassName}"/>
        <property name="url" value="${url}"/>
        <property name="username" value="${username}"/>
        <property name="password" value="${password}"/>
    </bean>

    <context:property-placeholder location="druid.properties"/>


纯注解模式
用类配置
@Configuration
public class SpringConfig {
}


ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
PersonDao personDao=(PersonDao) context.getBean("personDao");//这里的personDao是文件中的注解
personDao.print();

Dao层
@Repository("annotation")
public class AnnocationDaoImpl implements AnnocationDao{
@Override
public void sout() {
System.out.println("纯注解开发");
}
}


Service层
@Service
public class AnnocationServiceImpl implements AnnocationService {

    //注解注入对象
    @Autowired
    @Qualifier("annotation")//指定
    private AnnocationDao annocationDao;//和注解名称一样
    @Override
    public void sout() {
        System.out.println("annocation service");
        annocationDao.sout();
    }

}


在配置中定义第三方bean
public class SpringConfig {


@Bean
public DataSource source(){
DruidDataSource ds=new DruidDataSource();
ds.setDriverClassName("root");
//        ds.setUrl();等等管理第三方bean要自己配置
return ds;
}
}


整合mybatis

