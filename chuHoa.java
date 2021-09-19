import java.util.Scanner;
public class chuHoa {
    public static void main(String[] args) {
        // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào một chuỗi: ");
        message = scanner.nextLine();
        System.out.println("Đổi chuổi nhập thành in hoa: ");
        //sử dụng phương thức toUpperCase() để in hoa các ký tự trong chuỗi
        System.out.println(message.toUpperCase());
        
    }
}