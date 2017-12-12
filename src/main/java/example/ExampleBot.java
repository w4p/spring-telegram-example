package example;

import com.w4p.telegram.annotation.EnableW4TelegramBot;
import com.w4p.telegram.config.TelegramBotBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableW4TelegramBot
@SpringBootApplication
public class ExampleBot {

    @Bean
    public TelegramBotBuilder telegramBotBuilder() {
        return new TelegramBotBuilder()
                .username("[BOT_USERNAME]")
                .token("[BOT_TOKEN]");
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleBot.class, args);
    }
}
