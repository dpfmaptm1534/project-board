package com.koreait.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {
    @Bean
    public AuditorAware<String> auditorAware(){
        return () -> Optional.of("관리자");
        // 스프링 시큐리티 라는 라이브러리를 추가한다음 거기에있는 세션값을 여기에 넣어줄거임 지금은 '관리자'로넣는다

    }
}
