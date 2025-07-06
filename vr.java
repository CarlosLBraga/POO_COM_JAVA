public class vr
{
    
    public static String invert_string (String s1, String s2){
        if (!s1.isEmpty() && !s2.isEmpty()){
            StringBuilder s3 = new StringBuilder();
            int i = 0; // crescente
            int j = s2.length() - 1; //decrescente
            while (i < s1.length() && j >= 0){
                s3.append( s1.charAt(i));
                s3.append( s2.charAt(j));
                
                i++;
                j--;
            }
            
            while(i < s1.length()){
                s3.append( s1.charAt(i));
                i++;
            }
            
            while(j>=0){
                s3.append( s2.charAt(j));
                j--;
            }
            return s3.toString();
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    
    
    
	public static void main(String[] args) {
	    
	    String b = "Banana";
	    String c = "pera";
	    
	    String d = invert_string(b, c);
	    System.out.println(d);
		
		
		
}
}
