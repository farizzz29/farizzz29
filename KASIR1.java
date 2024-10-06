/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopwhile;
import java.util.Scanner;
/**
 *
 * @author izzaa
 */
public class KASIR1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih=0,jumlah, total, totalfinal=0;
        do{
            System.out.println("\n****Aplikasi kasir****");
            System.out.println("1.tas\n2.sandal\n3.sepatu");
            System.out.println("4.selesai");
            System.out.print("pilih : ");
            pilih=input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("tas[Rp.100.000]");
                    System.out.print("jumlah = ");
                    jumlah=input.nextInt();
                    total=100000*jumlah;
                    System.out.println("total = Rp."+total);
                    totalfinal=totalfinal+total;
                    break;
                case 2:
                    System.out.println("sandal[Rp.50.000]");
                    System.out.print("jumlah = ");
                    jumlah=input.nextInt();
                    total=50000*jumlah;
                    System.out.println("total = Rp."+total);
                     totalfinal=totalfinal+total;
                    break;
                case 3:
                    System.out.println("sepatu[Rp.200.000]");
                    System.out.print("jumlah = ");
                    jumlah=input.nextInt();
                    total=200000*jumlah;
                    System.out.println("total = Rp."+total);
                     totalfinal=totalfinal+total;
                    break;
                case 4:
                    System.out.println("total belanjaan anda = Rp."+totalfinal);
                    System.out.println("TERIMA KASIH TELAH BERBELANJA");
                    break;
            }
        }while(pilih!=4);
        
        
    }
}
