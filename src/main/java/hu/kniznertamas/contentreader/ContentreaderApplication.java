package hu.kniznertamas.contentreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "hu.kniznertamas" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class ContentreaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentreaderApplication.class, args);
    }
}
