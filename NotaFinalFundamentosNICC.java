import java.util.Scanner;

public class NotaFinalFundamentosNICC {
		public static void main(String args[]){
		Scanner entrada= new Scanner(System.in);

		int nota1;
		int nota2;
		int nota3;
		int nota4;
        
        double primeraUnidad;
        double segundaUnidad;
        double terceraUnidad;
        double trabajoFinal;
		
		double ponderado;

	    System.out.println("**************************************************************");
   	    System.out.println("*Calculador de Notas del curso de Fundamentos de programación*");
        System.out.println("**************************************************************");

		System.out.print("Ingrse su nota de la primera Unidad: ");
    	nota1 =entrada.nextInt();

    	System.out.print("Ingrse su nota de la segunda Unidad: ");
    	nota2 =entrada.nextInt();

    	System.out.print("Ingrse su nota de la tercera Unidad: ");
    	nota3 =entrada.nextInt();

    	System.out.print("Ingrse su nota del trabajo final: ");
    	nota4 =entrada.nextInt();

		ponderado = (nota1+nota2+nota3+nota4)/4;
		primeraUnidad = (nota1)*0.10;
		segundaUnidad = (nota2)*0.15;
		terceraUnidad = (nota3)*0.25;
		trabajoFinal = (nota4)*0.50;
		
	    System.out.println("*******************************************************");
   	    System.out.println("*Nota final del curso de Fundamentos de programación*");
        System.out.println("*******************************************************");
        System.out.println("");
		System.out.println("Su promedio total es de: "+ponderado);
		System.out.println("");
		System.out.println("Su ponderado de la primera Unidad es de : " +primeraUnidad+"puntos");
		System.out.println("Su ponderado de la segunda Unidad es de : " +segundaUnidad+"puntos");
		System.out.println("Su ponderado de la tercera Unidad es de: " +terceraUnidad+"puntos");
		System.out.println("Su ponderado del trabajo final es de: " +trabajoFinal+"puntos");
		System.out.println("*******");
		
	}	



}

