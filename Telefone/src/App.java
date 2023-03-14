import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);
     System.out.println("Digite minutos cosumidos");
     int minutos=sc.nextInt();
     if (minutos<=100){
        System.out.println("Valor a ser pago é : 50 reais");
     }
     else{
        minutos-=100;
        System.out.println("O valor a ser pago é: "+50+(2*minutos));
     }
     sc.close();
    }
}
