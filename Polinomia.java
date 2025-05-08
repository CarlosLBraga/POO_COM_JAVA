public class Polinomio {
    int grau;
    double [] coeficientes;


    public Polinomio (int grau){         //construtor
        this.grau = grau;
        coeficientes = new double[grau + 1];
    }
    
    public void setcoeficiente (int potencia, double valor){
        coeficientes[potencia] = valor;
    }
    
    public double calcular (double x){
        double resultado = 0;
        for (int i = 0; i <= grau; i++){
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }


	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
	}
}
