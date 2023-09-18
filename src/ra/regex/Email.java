package ra.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        //B1: Viết chuỗi Regex sử dụng lớp Pattern
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$");
        //B2: So khớp với chuỗi email
        String email = "quangnd2@rikkeisoft.com";
        Matcher matcher = pattern.matcher(email);
        //B3. Tiến hành so khớp
        boolean result = matcher.matches();

        //Cách 3:
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";

        boolean result2 = Pattern.matches(regex,email);
    }
}
