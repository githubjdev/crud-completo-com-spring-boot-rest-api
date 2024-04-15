package br.com.springboot.curso_jdev_treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * Spring Boot application starter class
 */
@EntityScan(basePackages = "br.com.springboot.curso_jdev_treinamento.model")
@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);/*É a linha principal que roda o projeto Java Spring Boot*/
        
    }
    
}
