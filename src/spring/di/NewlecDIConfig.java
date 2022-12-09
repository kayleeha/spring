package spring.di;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	
	@Bean
	public Exam exam() { //exam은 명사형임..xml에서의 id라고 생각하면됨. 일반 함수형이 아님
		return new NewlecExam();
	}
}
