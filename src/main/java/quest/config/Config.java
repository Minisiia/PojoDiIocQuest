package quest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quest.impl.CurseUndeadKing;
import quest.impl.DarkForest;
import quest.interfaces.Quest;
import quest.pojo.Knight;

@Configuration
public class Config {
    @Bean
    public Quest darkForestQuest() {
        return new CurseUndeadKing();
    }

    @Bean
    public Knight knight(Quest quest) {
        return new Knight(quest);
    }
}
