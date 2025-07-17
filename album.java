abstract class album {
    protected String titulo;
    protected String artista;
    protected String gravadora;
    protected int ano_lancamento;
    
    public album (String titulo, String artista, String gravadora, int ano_lancamento){
        this.titulo = titulo;
        this.artista = artista;
        this.gravadora = gravadora;
        this.ano_lancamento = ano_lancamento;
    }
    
}

abstract class digital extends album {
    private String streaming;
    private double horas;
    
    public digital (String streaming, double horas, String titulo, String artista, String gravadora, int ano_lancamento){
        super(titulo, artista, gravadora, ano_lancamento);
        this.streaming = streaming;
        this.horas = horas;
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
