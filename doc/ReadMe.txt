1,在windows下面链接github
	创建一个工程。然后把里面的配置拷贝出来。
	使用git客户端下载。到这个工程目录。需要在
	General -> Network Connections -> SHH2
	然后点击 Key Management -> Generate DSA Key -> Save Private Key
	链接的使用要使用github的用户名密码，并保存.

2,使用maven

jetty:run -Dmaven.test.skip=true 

3,debug调试

MAVEN_OPTS  
-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4000,server=y,suspend=n