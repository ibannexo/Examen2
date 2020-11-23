import java.util.Scanner;

public class BonoDocenteNICC {
		public static void main(String args[]){
		Scanner entrada= new Scanner(System.in);
		int puntos;
        double salario;
        double bono; 
        double cobrar;

	    System.out.println("**************************************************************");
   	    System.out.println("*****************Bono de desempeño docente********************");
        System.out.println("**************************************************************");

        System.out.print("Cuál es el salario de docente: ");
        salario = entrada.nextInt();
        System.out.print("Cuál es el puntaje del docente: ");
        puntos = entrada.nextInt();

        if (puntos >= 50 && puntos <= 100) {
            bono = salario * 0.10;
            cobrar = salario + bono;
            System.out.println("El bono para el docente es de: " + bono+ " Y el total a cobrar es:  "+cobrar+" ricos soles");
            
        } else if (puntos >= 101 && puntos <= 150) {
            bono = salario * 0.50;
            cobrar = salario + bono;
            System.out.println("El bono para el docente es de: " + bono+ " Y el total a cobrar es:  "+cobrar+" ricos soles");

        } else if (puntos >= 151) {
            bono = salario * 0.80;
            cobrar = salario + bono;
            System.out.println("El bono para el docente es de: " + bono+ " Y el total a cobrar es:  "+cobrar+" ricos soles");

        } else {
            System.out.println("El docente no califíca para ningun bono");
        }
}
}