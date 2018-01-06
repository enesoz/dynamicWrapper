package dynamic;


import dynamic.configuration.manager.app.ConfigurationReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dynamic")
public class ManagerWrapper implements CommandLineRunner {

    @Autowired
    ConfigurationReader reader;

    public static void main(String[] args) {
        SpringApplication.run(ManagerWrapper.class, args);
    }

    @Override
    public void run(String... strings) {
        try {
            ConfigurationReader manager = reader.build("enes", "", 600);
            System.out.println(reader.getValue("confName") + "-" + manager.getValue("confName").getClass().getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
