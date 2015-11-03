package co.rs.optika.util;

public class StringUtil {
    public static String noSpaceLowercase(String value) {
        return value.replaceAll(" ", "").toLowerCase();
    }
}
