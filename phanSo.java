
import java.util.Scanner;

public class phanSo {
   
    private int TuSo;
    private int MauSo;
   
    public void setTuSo(int tu){
        this.TuSo = tu;
    }
    public int getTuSo(){
        return this.TuSo;
    }


    public void setMauSo(int mau){
        this.MauSo = mau;
    }
    public int getMauSo(){
        return this.MauSo;
    }
    public phanSo(){}
    public phanSo(int a, int b){
        this.setTuSo(a);
        this.setMauSo(b);
    }
    // nhap phan so
    public void nhapPhanSo(){
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap Tu So = ");
            this.setTuSo(input.nextInt());
            System.out.print("Nhap Mau So = ");
            this.setMauSo(input.nextInt());
    }
   
    public void xuatPhanSo(){
       
        if (this.getMauSo() == 1) {
            System.out.print(this.getTuSo());
           
        }else{
            System.out.print(this.getTuSo() +" / " +this.getMauSo());
        }
    }
   
    
    
    public void congHaiPhanSo(phanSo ps){
        phanSo tong = new phanSo();
        if (this.getMauSo() == ps.getMauSo()) {
            tong.setTuSo(this.getTuSo()+ps.getTuSo());
            tong.setMauSo(this.getMauSo());
        }else{
            tong.setTuSo(this.getTuSo()*ps.getMauSo() + ps.getTuSo()*this.getMauSo());
            tong.setMauSo(this.getMauSo() * ps.getMauSo());
        }
        
    }
    public void hieuHaiPhanSo(phanSo ps){
        phanSo hieu = new phanSo();
        if (this.getMauSo() == ps.getMauSo()) {
            hieu.setTuSo(this.getTuSo() - ps.getMauSo());
            hieu.setMauSo(this.getMauSo());
        }else{
            hieu.setTuSo(this.getTuSo()*ps.getMauSo() - ps.getTuSo()*this.getMauSo());
            hieu.setMauSo(this.getMauSo()*ps.getMauSo());
        }
      
        System.out.print("Hieu 2 Phan So = ");
        hieu.xuatPhanSo();
        System.out.println();
    }
    public void tichHaiPhanSo(phanSo ps){
        phanSo tich = new phanSo();
        tich.setTuSo(this.getTuSo()*ps.getTuSo());
        tich.setMauSo(this.getMauSo()*ps.getMauSo());
     
        System.out.print("Tich 2 Phan So = ");
        tich.xuatPhanSo();
        System.out.println();
    }
    public void thuongHaiPhanSo(phanSo ps){
        phanSo thuong = new phanSo();
        thuong.setTuSo(this.getTuSo()*ps.getMauSo());
        thuong.setMauSo(this.getMauSo()*ps.getTuSo());
  
        System.out.print("Thuong 2 Phan So = ");
        thuong.xuatPhanSo();
        System.out.println();
    }
}

