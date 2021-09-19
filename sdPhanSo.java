


import java.util.Scanner;
public class sdPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap Tu So = ");
        
        System.out.print("Nhap Mau So = ");
       
        // Khai bao doi tuong
        phanSo tong = new phanSo();
        phanSo hieu = new phanSo();
        phanSo tich = new phanSo();
        phanSo thuong = new phanSo();
        tong.xuatPhanSo();
        hieu.xuatPhanSo();
        tich.xuatPhanSo();
        thuong.xuatPhanSo();
        
    }
}

