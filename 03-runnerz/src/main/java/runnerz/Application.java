package runnerz;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD

import runnerz.run.Location;
import runnerz.run.Run;
=======
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import runnerz.run.Location;
import runnerz.run.Run;
import runnerz.run.RunRepository;
import runnerz.user.User;
import runnerz.user.UserHttpClient;
import runnerz.user.UserRestClient;

import java.util.List;
>>>>>>> 628b3ad (commit)

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
<<<<<<< HEAD
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(
					1, 
					"First Run", 
					LocalDateTime.now(),
					LocalDateTime.now().plus(1,ChronoUnit.HOURS),
					5,
					Location.OUTDOOR);
			log.info("Run: " + run);
=======
<<<<<<< HEAD

=======
>>>>>>> 6149e55 (commit)
//	@Bean
//	CommandLineRunner runner(RunRepository runRepository) {
//		return args -> {
//			Run run = new Run(
//					1, 
//					"First Run", 
//					LocalDateTime.now(),
//					LocalDateTime.now().plus(1,ChronoUnit.HOURS),
//					5,
//					Location.OUTDOOR);
//			
//			runRepository.create(run);
//			
////			log.info("Run: " + run);
//			
//		};
//		
//	}
	
//==============================================================================
	
//	@Bean
//	CommandLineRunner runner(UserRestClient client) {
//		return args -> {
//			
//			List<User> users = client.findAll();
//			System.out.println("===== USERS =====");
//			System.out.println(users);
//			
//			User user = client.findById(1);
//			System.out.println("===== USER =====");
//			System.out.println(user);
//		};
//		
//	}
	
//==============================================================================

<<<<<<< HEAD

=======
>>>>>>> 6149e55 (commit)
	@Bean
	UserHttpClient userHttpClient() {
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com/");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
		
	}
	
	
	@Bean
	CommandLineRunner runner(UserHttpClient client) {
		return args -> {
			
			List<User> users = client.findAll();
			System.out.println("===== USERS =====");
			System.out.println(users);
			
			User user = client.findById(1);
			System.out.println("===== USER =====");
			System.out.println(user);
>>>>>>> 628b3ad (commit)
		};
		
	}

}
