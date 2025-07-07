public class pari_string
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


	public static HashSet<Integer> diferenca_conjunto (HashSet<Integer> a, HashSet<Integer> b) throws IllegalArgumentException{
        if(!a.isEmpty() && !b.isEmpty()){
           HashSet<Integer> dif_conjunto = new HashSet <>();
           for (Integer i : a){
               if (!b.contains(i)){
                   dif_conjunto.add(i);
               }
           }
           for (Integer i : b){
               if(!a.contains(i)){
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
		String t = parity_string(c, 3);
		System.out.println(t);
	}
}
