package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 这是一个微服务（第四步）
 */
@SpringBootApplication
//会自动把你的微服务注入进去
@EnableDiscoveryClient
public class UserServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceMain.class, args);
	}
}
