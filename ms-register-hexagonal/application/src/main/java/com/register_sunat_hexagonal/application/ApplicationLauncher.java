package com.register_sunat_hexagonal.application;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.register-sunat-hexagonal.*")
@EntityScan("com.register-sunat-hexagonal.*")
@EnableFeignClients("com.register-sunat-hexagonal.*")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
@EnableJpaRepositories("com.register-sunat-hexagonal.*")
public class ApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class,args);
    }
}
