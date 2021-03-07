package co.edu.escuelaing.ieti.taskPlanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class TaskPlannerApplication implements WebMvcConfigurer {

	@Value( "${cors.urlsValidos}" )
	String urlsValidos;

	public static void main(String[] args) {
		SpringApplication.run(TaskPlannerApplication.class, args);
	}

	public void addCorsMappings(CorsRegistry registry) {

		String[] origins = urlsValidos.split("#");
		registry.addMapping("/**")
				.allowedOrigins(origins)
				.allowedMethods("POST", "GET");
	}
}
