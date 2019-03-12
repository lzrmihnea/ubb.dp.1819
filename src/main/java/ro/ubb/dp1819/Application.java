package ro.ubb.dp1819;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.ubb.dp1819.mircea.madalina.AppMain;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		AppMain.appMain();
	}

}
