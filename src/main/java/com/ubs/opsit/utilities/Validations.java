package com.ubs.opsit.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
    public static boolean isInputDataValid(String inputDate){
        Pattern datePattern= Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        Matcher datePatternMatcher= datePattern.matcher(inputDate);
        return datePatternMatcher.matches();
    }
}
