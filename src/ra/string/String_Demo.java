package ra.string;

public class String_Demo {
    public static void main(String[] args) {
        //Cách 1: Khởi tạo chuỗi bằng Literal
        String ra = "Rikkei Academy";//Thường xuyên được sử dụng
        //Cách 2: khởi tạo chuỗi bằng constructor của lớp String
        String hocvien = new String("Học viện Rikkei");
        //String -->immutable --> không thể thay đổi giá trị chuỗi
//        ra = "Học viện Rikkei Academy";
        String str2 = "Rikkei Academy";
        //String.length(): Độ dài chuỗi , số ký tự của chuỗi
        System.out.println("Độ dài chuỗi ra là: " + ra.length());
        //String.charAt(index): lấy ký tự có chỉ số index trong chuỗi
        System.out.println("Ký tự có chỉ số 2 trong ra là: " + ra.charAt(2));
        //str1.concat(str2): nối 2 chuỗi str1 và str2
        String str3 = "Học viện";
        String str4 = " Rikkei Academy";
        System.out.println(str3.concat(str4));
        //String.toUpperCase(): Viết hoa chuỗi
        //String.toLowerCase(): Viết thường chuỗi
        String str5 = "RiKKeI aCadeMy";
        System.out.println("Viết hoa chuỗi: "+str5.toUpperCase());
        System.out.println("Viết thường chuỗi: "+str5.toLowerCase());
        //String.trim(): Cắt khoảng trắng 2 đầu
        String str6 = "    Rikkei Academy      ";
        System.out.println("Cắt khoảng trắng 2 đầu: "+str6.trim());
        //str1.equals(str2): So sánh 2 chuỗi bằng nhau có phân biệt hoa thường, đúng --> true, sai --> false
        String str7 = "ABcD";
        String str8 = "ABCD";
        System.out.println("So sánh 2 chuỗi bằng nhau: "+str7.equals(str8));
        //str1.equalsIgnoreCase(str2): So sánh 2 chuỗi bằng nhau không phân biệt hoa thường
        System.out.println("So sánh 2 chuỗi bằng nhau không phân biệt hoa thường: "+str7.equalsIgnoreCase(str8));
        //str1.compareTo(str2): return giá trị lệch của ký tự trong chuỗi
        System.out.println("So sánh 2 chuỗi: "+str8.compareTo(str7));
        //str1.compareToIgnoreCase(str2): So sánh không phân biệt hoa thường
        System.out.println("So sánh 2 chuỗi ko phân biệt hoa thường: "+str7.compareToIgnoreCase(str8));
        //str1.startWith(str2): Kiểm tra chuỗi str1 có phải bắt đầu là chuỗi str2 hay không
        String str9 = "Rikkei Academy";
        String str10 = "Rikkei";
        String str11 = "Academy";
        System.out.println("Kiểm tra chuỗi bắt đầu: "+str9.startsWith(str10));
        //str1.endWith(str2): Kiểm tra chuỗi str1 có phải kết thúc là chuỗi str2 hay không
        System.out.println("Kiếm tra chuỗi kết thúc: "+str9.endsWith(str11));
        //str1.contains(str2): Trả về true nếu str2 có trong chuỗi str1
        System.out.println("Kiểm tra chứa chuỗi: "+str9.contains("Kei"));


    }
}
