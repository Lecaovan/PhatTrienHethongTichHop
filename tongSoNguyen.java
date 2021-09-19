import java.util.Scanner;
public class tongSoNguyen {
    public static void main(String[] args) {
        System.out.print("Nhập số bất kỳ: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++){
            s += i;
        }
        System.out.print("Tổng từ 1 đến " +n + " là: " +s);
    }
}
