package quest.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quest.impl.CurseUndeadKing;
import quest.impl.DarkForest;
import quest.interfaces.Quest;
import quest.pojo.Knight;

@Configuration
public class Config {
    @Bean
    public Quest CurseUndeadKingQuest() {
        return new CurseUndeadKing();
    }

    @Bean
    public Quest DarkForestQuest() {
        return new DarkForest("Dark Forest: The knight ventures deep into the dark forest, where dangerous monsters and evil wizards dwell. His task is to find an ancient artifact that can save the kingdom from impending danger.");
    }

    @Bean
    public Knight knight(@Qualifier("CurseUndeadKingQuest") Quest quest) {
        return new Knight(quest);
    }
}
