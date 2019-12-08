package config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class AppConfig {

    @Getter
//    @Value("${source.question_1}")
    private String question1;

    @Getter
//    @Value("${source.question_2}")
    private String question2;

    @Getter
//    @Value("${source.question_3}")
    private String question3;

    @Getter
//    @Value("${source.question_4}")
    private String question4;

    @Getter
//    @Value("${source.question_5}")
    private String question5;
}