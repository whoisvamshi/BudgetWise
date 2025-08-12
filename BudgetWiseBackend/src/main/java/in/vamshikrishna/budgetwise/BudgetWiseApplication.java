package in.vamshikrishna.budgetwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BudgetWiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetWiseApplication.class, args);
	}

}
