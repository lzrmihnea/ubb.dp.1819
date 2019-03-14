package ro.ubb.dp1819;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreter;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreterImpl;
import ro.ubb.dp1819.panaite.dorinel.ex1.FileReadingService;
import ro.ubb.dp1819.panaite.dorinel.ex1.FileReadingServiceImpl;
import ro.ubb.dp1819.panaite.dorinel.ex2.CoffeeFactory;
import ro.ubb.dp1819.panaite.dorinel.ex2.CoffeeFactoryImpl;

@Configuration
public class AppConfig {
    @Bean
    public FileReadingService fileReadingService() {
        return new FileReadingServiceImpl();
    }

    @Bean
    public CoffeeDataInterpreter coffeeDataInterpreter(FileReadingService fileReadingService) {
        return new CoffeeDataInterpreterImpl(fileReadingService);
    }

    @Bean
    public CoffeeFactory coffeeFactory(CoffeeDataInterpreter coffeeDataInterpreter) {
        return new CoffeeFactoryImpl(coffeeDataInterpreter);
    }
}
