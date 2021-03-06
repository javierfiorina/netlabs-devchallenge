package gdc;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class gdcConfiguration {
	@Bean
	@Primary
	@ConfigurationProperties(prefix="datasource.gdc")
	public DataSource primaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
}
