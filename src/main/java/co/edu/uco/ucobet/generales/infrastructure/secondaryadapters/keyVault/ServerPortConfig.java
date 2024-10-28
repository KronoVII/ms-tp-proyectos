package co.edu.uco.ucobet.generales.infrastructure.secondaryadapters.keyVault;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerPortConfig {

    private final SecretClient secretClient;

    public ServerPortConfig(SecretClient secretClient) {
        this.secretClient = secretClient;
    }

    @Value("${server.port:defaultPort}")
    private String defaultPort;

   @Bean
    public String serverPort() {
        String port = secretClient.getSecret("serverPort").getValue();
        System.out.println(port);
        return (port != null) ? port : defaultPort;
    }
}
