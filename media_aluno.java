public Aluno (String nome, int i)
    {
        this.nome = nome;
        this.notas = new double[i];
    }
    
    public void set_nota(int i, double nota){
        notas[i] = nota;
    }
    
    public void exibir_notas() {
        System.out.println("Notas de " + nome + " : ");
        
        for (int i = 0; i < this.notas.length; i++){
            System.out.println("\n Notas : " + notas[i]);
        }
    }
    
    public void media() {
        System.out.println("Média do " + nome);
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++){
            soma += this.notas[i];
            
        }
        System.out.println("média do aluno " + soma / this.notas.length);
    }
    
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    int quant = teclado.nextInt();
	    
	    Aluno a_1 = new Aluno("Cadu", quant);
	    
	    
	    for (int i = 0; i < quant; i++){
	        
	        System.out.println("digite a nota: ");
	        double nota = teclado.nextDouble();
	        a_1.set_nota(i, nota);
	        
	        
	    }
	    
	    a_1.exibir_notas();
	    a_1.media();
	    
		
	}
}
