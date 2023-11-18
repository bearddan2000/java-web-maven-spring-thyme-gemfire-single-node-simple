package example;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@SpringBootApplication
@ClientCacheApplication(name = "AccessingDataGemFireApplication")
@EnableEntityDefinedRegions(
  basePackageClasses = example.model.Dog.class,
  clientRegionShortcut = ClientRegionShortcut.LOCAL
)
@EnableGemfireRepositories
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
