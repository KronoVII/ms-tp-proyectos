package co.edu.uco.ucobet.generales.infrastructure.secondaryadapters.keyVault;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyVaultConfig {

    @Bean
    public SecretClient secretClient() {
        return new SecretClientBuilder()
                .vaultUrl("https://ucobet-basg.vault.azure.net/")
                .credential(new DefaultAzureCredentialBuilder().build())
                .buildClient();
    }
}
