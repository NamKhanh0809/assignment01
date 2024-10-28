/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

/**
 *
 * @author Inspiron
 */
import java.util.Scanner;
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nguyen tran Nam Khanh");
        System.out.println("lop:CMU-CS303 AIIS");
        System.out.println("Msv: 29219064936");
       Scanner ttsv= new Scanner(System.in);
        System.out.println("nhap ten");
 String ten = ttsv.nextLine();
        System.out.println("nhap tuoi");
        int tuoi = ttsv.nextInt();
         ttsv.nextLine();
        System.out.println("nhap ma sinh vien");
        String msv = ttsv.nextLine();
        System.out.println("ten: "+ten);
        System.out.println("tuoi: "+tuoi);
        System.out.println("msv: "+msv);
        
       ttsv.close();
    }
}
