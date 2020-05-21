import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Calculator {
	

	//Metodo suma de la calculadora
	public int suma(int Num1, int Num2) {
		int resultado;
		resultado = Num1+Num2;
		return resultado;	
	}	
	
	//Metodo resta de la calculadora
		public int resta(int Num1, int Num2) {
			int resultado;
			resultado = Num1-Num2;
			return resultado;	
		}	
		
	//Metodo multiplicacion de la calculadora
		public int multiplicacion(int Num1, int Num2) {
			int resultado;
			resultado = Num1*Num2;
			return resultado;	
		}	
	
	//Metodo division de la calculadora
		public int division(int Num1, int Num2) {
			int resultado;
			resultado = Num1/Num2;
			return resultado;	
		}	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		Calculator c = new Calculator();
		BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));
		String operacion;
		
	do {	
		
		System.out.println("Ingrese un numero: ");
		int Num1= Integer.parseInt((Leer.readLine()));
		
		System.out.println("Ingrese un numero: ");
		int Num2= Integer.parseInt((Leer.readLine()));
		
		System.out.println("Operacion a realizar: ");
		operacion= (Leer.readLine());
		
	
	    if(operacion.equals("+")) {
	    	System.out.print(c.suma(Num1,Num2)+"\n");
    }
	    if(operacion.equals("-")) {
	    	System.out.print(c.resta(Num1,Num2)+"\n");
	   }
	    if(operacion.equals("*")) {
	    	System.out.print(c.multiplicacion(Num1,Num2)+"\n");
	    }
	    if(operacion.equals("/")) {
	    	System.out.print(c.division(Num1,Num2)+"\n");
	    }
	
    
	}
	while(true);
}}
