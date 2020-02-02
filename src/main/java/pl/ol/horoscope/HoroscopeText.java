package pl.ol.horoscope;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroscopeText {

    static public void getHoroscopeText(String pageAsText) {

        Pattern pattern = Pattern.compile("Your horoscope.+");
        Matcher matcher = pattern.matcher(pageAsText);
        if (matcher.find()) {
            String result = matcher.group();
        }
        return;
    }
}
