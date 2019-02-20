package commonLibs.utils;

import org.apache.commons.lang3.StringUtils;

public class JWTTokenUtil {

    public static boolean checkFormat(String token) {
        int count = StringUtils.countMatches(token, ".");
        return count == 2;
    }
}
