import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkIfMatches("akhila and sowmya"));
        System.out.println(checkIfMatches("akhila and sowmya."));
        System.out.println(checkIfMatches("Akhila and sowmya."));


    }
    public static boolean checkIfMatches(String sentence)
    {
        Pattern pattern= Pattern.compile("^[A-Z].*[.$]");
        Matcher matcher=pattern.matcher(sentence);
        return matcher.matches();
    }
}
