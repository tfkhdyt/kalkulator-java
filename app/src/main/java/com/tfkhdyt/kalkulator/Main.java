package com.tfkhdyt.kalkulator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Kalkulator calc = new Kalkulator();
    Scanner in = new Scanner(System.in);

    try{
      System.out.println("=============== Kalkulator ===============\n");
      System.out.print("        Masukkan angka 1  = ");
      calc.angka1 = in.nextInt();
      System.out.print("        Masukkan operator = ");
      calc.operator = in.next().charAt(0);
      System.out.print("        Masukkan angka 2  = ");
      calc.angka2 = in.nextInt();
      System.out.println("\n==========================================\n");
      int hasil = 0;
      float hasilF = 0;
      switch(calc.operator){
        case '+': hasil = calc.tambah(); break;
        case '-': hasil = calc.kurang(); break;
        case '*': hasil = calc.kali(); break;
        case '/':
          hasilF = calc.bagi();
          break;
        case '%': hasil = calc.mod(); break;
      }
      
      if(calc.operator == '/'){
        System.out.printf("        " + calc.angka1 + " " + calc.operator + " "+ calc.angka2 + " = %.2f",hasilF);
      }else{
        System.out.println("        " + calc.angka1 + " " + calc.operator + " "+ calc.angka2 + " = " + hasil);
      }
      
    }catch(Exception ex){
      System.out.println("Input tidak valid!: " + ex);
    } finally {
      in.close();
      System.out.println("\n==========================================");
    }
  }
}
