package in.amberdeokate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmberdeokateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmberdeokateApplication.class, args);
	}

	@GetMapping("/getName")
	public String getName(@RequestParam String name) {
		return "Your name is " + name;
	}

}
