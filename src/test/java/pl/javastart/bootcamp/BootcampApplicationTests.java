package pl.javastart.bootcamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import pl.javastart.bootcamp.utils.YouTubeLinkConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class BootcampApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void youtubeLinkShouldBeConverted() {
        // given
        String link1 = "https://www.youtube.com/watch?v=wyrGeEIMrcc";
        String link2 = "https://youtu.be/wyrGeEIMrcc";

        // when
        String result = "wyrGeEIMrcc";

        //then
        assertEquals(YouTubeLinkConverter.convertLinksToOneFormat(link1), result);
        assertEquals(YouTubeLinkConverter.convertLinksToOneFormat(link2), result);
    }
}
