#### 关于docker启动server and client
其实docker相当于一个系统，肯定不能再用localhost这样的本地域名来查找server地址。因为docker之间相当于两个系统之间的通信，所以在查找地址的时候，应该是让docker能互相communication。这时候有两种办法，一种是通过`run --link docker-name`，一种是通过`--network self-create-network`让两个docker在同一个network里。这里client用来查询eureka server的地址其实是docker-name，让docker之间互相通信。  
docker run --name=docker-cloud-server -p 8861:8861 -t  
docker run --link docker-cloud-server -p 8862:8862 -t
#### about docker
1. As an alternative you can use the --rm flag with the docker run command. This will delete the container immediately after it is stopped.