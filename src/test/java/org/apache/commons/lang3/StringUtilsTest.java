package org.apache.commons.lang3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
@Test
    public void isAllLowercaseTrue() {
    boolean result =
            StringUtils.isAllLowerCase("fsdjgfkkdjgkd");

    Assertions.assertTrue(result);
}

    @Test
    public void isAllLowercaseFalse() {
        boolean result =
                StringUtils.isAllLowerCase("fsdjgfkHkdjgkd");

        Assertions.assertFalse(result);
    }

//    @Test
//    public void isAllLowercaseFake() {
//        boolean result = true;
//        Assertions.assertFalse(result);
//    }

}
