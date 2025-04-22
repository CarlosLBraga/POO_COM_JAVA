import java.util.Scanner;

public class par_ou_impar {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um numero");
    int n = teclado.nextInt();

    if (n % 2 == 0){
      System.out.println("O numero é par");
    }
    else{
      System.out.println("O numero é impar");
    }
  
  }
