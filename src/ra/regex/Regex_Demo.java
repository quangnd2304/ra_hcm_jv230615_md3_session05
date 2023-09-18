package ra.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Demo {
    public static void main(String[] args) {
        //Cách 1:
        //Pattern: tạo ra mẫu để so khớp
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{2,5}");
        //Matcher: So khớp chuỗi với mẫu được tạo
        Matcher matcher = pattern.matcher("ABcD1a");
        //Kết quả so khớp
        boolean result = matcher.matches();
        System.out.println("Kết quả so khớp: "+result);
        //Cách 2: Gộp lại
        boolean result2 = Pattern.compile("[A-Za-z0-9]{2,5}").matcher("ABcD1a").matches();
        //Cách 3: Thường dùng Pattern.matches("regex","inputString")
        boolean result3 = Pattern.matches("[A-Za-z0-9]{2,5}","ABcD1a");
        System.out.println("So khớp chuỗi Java: "+Pattern.matches("Java","Jav"));
        //Tạo mẫu quy định là RA_HCM......15
        System.out.println("So khớp: "+Pattern.matches("RA_HCM......15","RA_HCMJV230615"));
        //Tạo mẫu quy định là ten hoặc tim
        System.out.println("So khớp hoặc: "+Pattern.matches("t(en|im|in)","tin"));
        //Tạo mẫu []
        System.out.println("So khớp giá trị: "+Pattern.matches("Ja[^abc]{1,3}a","Jacaa"));
        //[abc]: ký tự là a hoặc b hoặc c
        //[^abc]: ký tự không phải là a và b và c
        //{1,3}: chuỗi có từ 1 đến 3 ký tự
        //[^abc]{1,3}: Quy định chuỗi phải có từ 1 đến 3 ký tự, các ký tự không phải là a,b,c
        //{1}
        //Trong khoảng
        System.out.println("So khớp trong khoảng: "+Pattern.matches("Ja[a-d[m-z]]a","Jfva"));
        //\d: digit - số: tương tự viết [0-9]
        //\D: non-digit - Không phải số
        //\w: character: [A-Za-Z0-9]
        //\W: non-character
        //\s: space
        //\S: non-space
        System.out.println("So khớp: "+Pattern.matches("JV[\\D]{1,3}","JV230"));

        //\a*: có 0...N ký tự a
        //\a+: có 1...N ký tự a
        //\a?: có 0...1 ký tự a
        //\a{3}: có 3 ký tự a
        //\a{3,}: có tối thiểu 3 ký tự a
        //\a{3,5}: Có tối thiểu 3 ký tự a và tối đa 5 ký tự aa
        //Viết mẫu cho số điện thoại di động ở Việt Nam
        //- Bắt đầu là 0
        //- 2 ký tự của nhà mạng: 90,91,98
        // - 7 ký tự số
        //-> phone: "0(90|91|98)[\\d]{7}"

    }
}
