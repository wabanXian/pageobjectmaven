package xiaowawa.oss.pageobjectmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("controller")

public class PageobjectmavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageobjectmavenApplication.class, args);
	}
}
