package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.bean.MediaPlayer;
import soundsystem.config.SoundSystemConfig;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportXmlConfigTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;


    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n" +
                        "-Track: Sgt. Pepper's Lonely Hearts Club Band\r\n" +
                        "-Track: With a Little Help from My Friends\r\n" +
                        "-Track: Lucy in the Sky with Diamonds\r\n" +
                        "-Track: Getting Better\r\n" +
                        "-Track: Fixing a Hole\r\n",
                log.getLog());
    }

}
