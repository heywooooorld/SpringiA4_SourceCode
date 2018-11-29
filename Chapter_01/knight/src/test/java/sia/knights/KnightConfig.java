package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sia.knights.bean.BraveKnight;
import sia.knights.bean.Knight;
import sia.knights.bean.Quest;
import sia.knights.bean.SlayDragonQuest;

import java.io.PrintStream;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(stream());
    }

    @Bean
    public PrintStream stream() {
        return new FakePrintStream();
    }

}
