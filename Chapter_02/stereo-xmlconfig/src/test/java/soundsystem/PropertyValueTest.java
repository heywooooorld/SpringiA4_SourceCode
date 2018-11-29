package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PropertyValueTest {

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
                        "-Track: Fixing a Hole\r\n" +
                        "-Track: She's Leaving Home\r\n" +
                        "-Track: Being for the Benefit of Mr. Kite!\r\n" +
                        "-Track: Within You Without You\r\n" +
                        "-Track: When I'm Sixty-Four\r\n" +
                        "-Track: Lovely Rita\r\n" +
                        "-Track: Good Morning Good Morning\r\n" +
                        "-Track: Sgt. Pepper's Lonely Hearts Club Band (Reprise)\r\n" +
                        "-Track: A Day in the Life\r\n",
                log.getLog());
    }

}
