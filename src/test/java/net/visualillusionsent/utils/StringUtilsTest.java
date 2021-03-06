package net.visualillusionsent.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testPadRight() {
        Assert.assertEquals("Test---", StringUtils.padCharRight("Test", 3, '-'));
    }

    @Test
    public void testPadLeft() {
        Assert.assertEquals("---Test", StringUtils.padCharLeft("Test", 3, '-'));
    }

    @Test
    public void byteArrayToStringArrayTest() {
        Assert.assertArrayEquals(new String[] { "1", "2", "3" }, StringUtils.byteArrayToStringArray(new byte[] { 1, 2, 3 }));
    }

    @Test
    public void testByteArrayToString() {
        Assert.assertEquals("1,2,3", StringUtils.byteArrayToString(new byte[] { 1, 2, 3 }, ","));
    }
}
