import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Count c=new Count();
        c.countString();

        //giai phuong trinh bac nhat
        System.out.println("Giai phuong trinh bac nhat ax + b =0");
        double nghiem;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        double a=scanner.nextDouble();

        System.out.println("Nhap vao so b: ");
        double b=scanner.nextDouble();

        if (a==0){
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else
            System.out.println("Phuong trinh co nghiem x = "+(-b/a));
    }
}
