package sv.test.freund.apporderscontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AppOrdersControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOrdersControlApplication.class, args);
	}

}
