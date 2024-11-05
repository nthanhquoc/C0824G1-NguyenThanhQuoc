package bai_tap.string_regex.bt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public PhoneValidator() {
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(String phone) {
        matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
