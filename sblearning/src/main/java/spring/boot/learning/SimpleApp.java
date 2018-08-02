package spring.boot.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"spring.boot.learning","root.sam.web"})
public class SimpleApp {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApp.class, args);
	}
}
