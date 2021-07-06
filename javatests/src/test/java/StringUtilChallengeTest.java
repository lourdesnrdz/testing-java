import org.junit.Test;
import util.StringUtilChallenge;

import static org.junit.Assert.*;

public class StringUtilChallengeTest {

    @Test
    public void string_not_empty() {
        assertFalse(StringUtilChallenge.isEmpty("hola"));
    }

    @Test
    public void string_is_empty() {
        assertTrue(StringUtilChallenge.isEmpty(""));
    }

    @Test
    public void string_is_null() {
        assertTrue(StringUtilChallenge.isEmpty(null));
    }

    @Test
    public void string_with_spaces() {
        assertTrue(StringUtilChallenge.isEmpty(" "));
    }


}