package com.fangjia.fsh.substitution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 房生活-置换服务-启动入口
 *
 * @author yinjihuan
 * @date 2017/10/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FshSubstitutionServiceApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(FshSubstitutionServiceApplication.class, args);
    }
    
}
