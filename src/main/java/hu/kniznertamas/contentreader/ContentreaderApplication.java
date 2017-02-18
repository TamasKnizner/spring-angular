package hu.kniznertamas.contentreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "hu.kniznertamas" })
public class ContentreaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentreaderApplication.class, args);
    }
}
