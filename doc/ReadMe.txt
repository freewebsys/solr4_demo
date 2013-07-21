1,在windows下面链接github
	创建一个工程。然后把里面的配置拷贝出来。
	使用git客户端下载。到这个工程目录。需要在
	General -> Network Connections -> SHH2
	然后点击 Key Management -> Generate DSA Key -> Save Private Key
	链接的使用要使用github的用户名密码，并保存.

2,使用maven

jetty:run -Dmaven.test.skip=true 

3,debug调试
使用jetty 6.1.26版本，比较稳定.
MAVEN_OPTS  
-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4000,server=y,suspend=n

4,下载编译，如果遇到maven编译问题。
使用eclipse 4.3 

Alt+F5
更新maven依赖，并勾选，Force Update Of Snapshots/Releases

5,数据抓取使用使用meituan的好123数据抓取地址：

http://www.hao123.com/redian/api.htm
http://www.meituan.com/api/deals/hao123
全部数据比较大，demo只抓取部分数据。
