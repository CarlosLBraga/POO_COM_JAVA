import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;




public class Main
{
    
    public static HashMap<String, ArrayList<Integer>> greatnessFilter (ArrayList<Integer> lista, int n){

        if (n > 0){
            HashMap<String, ArrayList<Integer>> filtro = new HashMap<>();
            ArrayList<Integer> maiores = new ArrayList<>();
            ArrayList<Integer> menores = new ArrayList<>();
    
    
            for (Integer i : lista){
                if (i <= n) {
                menores.add(i);
                }
                else{
                    maiores.add(i);
                }
            }
    
            filtro.put("maiores", maiores);
            filtro.put("menores", menores);
        
    
            return filtro;
            }
        else {
            throw new IllegalArgumentException();
        }
}
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner teclado = new Scanner (System.in);
		int n = teclado.nextInt();
		
		
		ArrayList<Integer> lista_numeros = new ArrayList<>();
		lista_numeros.add(1);
		lista_numeros.add(10);
		lista_numeros.add(15);
		lista_numeros.add(6);
		lista_numeros.add(4);
		lista_numeros.add(20);
		
		
		HashMap<String, ArrayList<Integer>> dicionario = new HashMap<>();
		dicionario = greatnessFilter(lista_numeros, n);
		System.out.println(dicionario);
		
		
	}
}
