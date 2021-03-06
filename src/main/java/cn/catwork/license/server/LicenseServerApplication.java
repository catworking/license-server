package cn.catwork.license.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//@EnableAuthorizationServer
//@EnableResourceServer
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class LicenseServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicenseServerApplication.class, args);
	}
}
