import java.util.ArrayList;
import java.util.HashSet;
public class Main
{
    
    public static String parity_string (String palavra, int n) throws IllegalArgumentException{
        if (palavra.length() > 0 && n == 0 || n == 1){
            StringBuilder sb = new StringBuilder();
            
            if (n == 0 ){
                
                for (int i = 0; i < palavra.length(); i++){
                    
                    if (i % 2 == 0){
                        sb.append( palavra.charAt(i));
                    }
                    
                }
            } else {
                for (int i = 0; i < palavra.length(); i ++){
                    
                    if (i % 2 != 0){
                        sb.append( palavra.charAt(i));
                    }
                    
                }
            }
            
            return sb.toString();
        }
        
        else {
             throw new IllegalArgumentException();
        }
    }
    
    public static HashSet<Integer> simetria (HashSet<Integer> a, HashSet<Integer> b) throws IllegalArgumentException{
        if(!a.isEmpty() && !b.isEmpty()){
           HashSet<Integer> sime = new HashSet <>();
           for (Integer i : a){
               if (!b.contains(i)){
                   sime.add(i);
               }
           }
           for (Integer i : b){
               if(!a.contains(i)){
                   sime.add(i);
               }
           }
           return sime;
            
        }
        throw new IllegalArgumentException();
    }
    
    public static HashSet<Integer> dif_conjunto (HashSet<Integer> a, HashSet<Integer> b) throws IllegalArgumentException{
        if(!a.isEmpty() && !b.isEmpty()){
           HashSet<Integer> dif_conjunto = new HashSet <>();
           for (Integer i : a){
               if (!b.contains(i)){
                   dif_conjunto.add(i);
               }
           }
           return dif_conjunto;
            
        }
        throw new IllegalArgumentException();
    }
    
    
    
	public static void main(String[] args) {
	    
	    
	    String c = "Carlos";
		System.out.println(c);
		HashSet<Integer> a = new HashSet<Integer> ();
		HashSet<Integer> b = new HashSet<Integer> ();
		a.add(1);
		a.add(2);
		a.add(3);
		
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		System.out.println(a);
		System.out.println(b);
		
		HashSet<Integer> diferenca = new HashSet<Integer>();
		diferenca = simetria(a, b);
		System.out.println(diferenca);
		
		HashSet<Integer> dif = new HashSet<Integer>();
		dif = dif_conjunto(a, b);
		System.out.println(dif);
		//String t = parity_string(c, 3);
		
	}
}
