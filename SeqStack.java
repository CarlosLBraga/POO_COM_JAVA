interface Stack {
	void push(int value);
	int pop ();
	int inspect ();
}


public class SeqStack implements Stack{
    private int[] sequencia;
    private int top;
    private int capacidade;
    
    public SeqStack (int capacidade){
        if (capacidade > 0 ){
            this.capacidade = capacidade;
            this.sequencia = new int [capacidade];
            this.top = -1;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    public SeqStack(){
        this.capacidade = 10;
        this.sequencia = new int[capacidade];
        this.top = -1;
    }
    
    @Override
    public void push (int value){
        if (top < capacidade){
            System.out.println("valor empilhado");
            top ++;
            sequencia[top] = value;
        }
        else{
            System.out.println("pilha cheia");
        }
    }
    
    @Override
    public int inspect (){
        if (top >= 0){
            return sequencia[top];
        }
        else {
            throw new NullPointerException ();
        }
    }
    
    
    @Override
    public int pop() {
        if (top >= 0) {
            int valor = sequencia[top--];
            System.out.println("Desempilhado: " + valor);
            return valor;
        } else {
            System.out.println("Pilha vazia");
            return -1;
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
