public class Main
{
    public static class Album{
        public String titulo;
        public String artista;
        public int anolancamento;
        private int codigo;
        
        
        public Album (String titulo, String artista, int anolancamento){
            this.titulo = titulo;
            this.artista = artista;
            this.anolancamento = anolancamento;
        }
        
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Album cd2 = new Album ("Mayhem", "Lady Gaga", 2025);
		System.out.println(cd2.titulo);
	}
	
	
}
