package bai_tap.string_regex.bt1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public ClassNameValidator() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String className) {
        matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
