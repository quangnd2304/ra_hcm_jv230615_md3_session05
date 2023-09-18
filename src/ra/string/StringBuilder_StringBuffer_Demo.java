package ra.string;

public class StringBuilder_StringBuffer_Demo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi StringBuilder có giá trị là Rikkei Academy
        StringBuilder ra = new StringBuilder("Rikkei Academy");
        //2. Khởi tạo chuỗi StringBuffer có giá trị là Học viện Rikkei
        StringBuffer hocVienRa = new StringBuffer("Học viện Rikkei");
        //strBuilder.append("String"): Nối chuỗi
        System.out.println("Nối chuỗi: "+ra.append("-Hồ Chí Minh"));
        //strBuilder.insert(index,"String"): Chèn chuỗi String vào vị trí index
        System.out.println(ra.insert(0,"Học viện "));
        //strBuilder.deleteCharAt(index): xóa ký tự ở chỉ số index
        System.out.println("Xóa ký tự chỉ số 0: "+ra.deleteCharAt(0));
        //strBuilder.delete(start,end): xóa các ký tự từ start đến trước end
        System.out.println("Xoá các ký tự từ chỉ số 0 đến trước 8: "+ra.delete(0,8));
        //strBuilder.reverse(): Đảo ngược chuỗi
        StringBuilder strBuilder = new StringBuilder("ABCD");
        System.out.println("Đảo ngược chuỗi: "+strBuilder.reverse());

    }
}
