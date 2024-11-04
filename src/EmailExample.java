import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample
{
    private static Pattern pattern;
    private Matcher matcher;
    private static final String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    // ^ = start with a string line
    // at least 1 char A-Z, a-z, 0-9
    // *@ = end with @
    // $ = end string to another line
//    private Pattern pattern = Pattern.compile(regex);

    public EmailExample() {
        pattern = Pattern.compile(regex);
    }
//   Matcher matcher = pattern.matcher(regex);

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

