import java.util.Scanner;


public class Main
{
    public static final double pi = 3.14;
	public static void main(String[] args) {
		System.out.println(pi);
		System.out.println("informe o tipo de sólido que deseja calcular: ");
		System.out.print("1 - Esfera\n");
		System.out.print("2 - Cubo\n");
		Scanner teclado = new Scanner (System.in);
		int n = teclado.nextInt();
		
		if (n == 1){
		    System.out.println("Você escolher uma Esfera !");
		    System.out.println("Digite o raio da esfera ");
		    float raio = teclado.nextInt();
		    Double volume = 4 * (pi * Math.pow(raio,3)) / 3;
		    System.out.println("o volume da esfera é " + volume + "cm³");
		}
		
		else if (n == 2){
		    System.out.println("Você Escolheu o Cubo !");
		    System.out.println("Digite o comprimento da aresta (em cm) ");
		    int cm = teclado.nextInt();
		    
		    Double volume = Math.pow(cm, 3);
		    System.out.println("o volume do cubo é " + volume + " cm³ ");
		    }
		
		else{
		    System.out.println("Entrada Inválida !!!");
		}
	}
}
