package devfun.bookstore.common.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class AppConfig {
	// 데이터베이스접속, 트랜잭션관리 추가
	// 공통컨피그
	// web.xml에서 설정한 ContextLoaderLisener에 의해 해당클래스 처리
	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder().setName("testdb").setType(EmbeddedDatabaseType.HSQL)
				.addScript("schema.sql").addScript("data.sql").build();
	}
}