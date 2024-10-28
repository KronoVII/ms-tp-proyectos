package co.edu.uco.ucobet.generales.infrastructure.secondaryadapters.data.sql.repository;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private final SecretClient secretClient;

    public DataSourceConfig(SecretClient secretClient) {
        this.secretClient = secretClient;
    }

    @Bean
    public DataSource dataSource() {
        String dataSourceUrl = secretClient.getSecret("dataSourceUrl").getValue();
        return DataSourceBuilder.create()
                .url(dataSourceUrl)
                .build();
    }
}
