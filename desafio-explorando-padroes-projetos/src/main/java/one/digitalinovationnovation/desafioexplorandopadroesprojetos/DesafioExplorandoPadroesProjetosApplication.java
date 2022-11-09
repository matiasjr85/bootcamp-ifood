package one.digitalinovationnovation.desafioexplorandopadroesprojetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioExplorandoPadroesProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioExplorandoPadroesProjetosApplication.class, args);
	}

}
