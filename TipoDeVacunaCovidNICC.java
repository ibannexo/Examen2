import java.util.Scanner;

public class TipoDeVacunaCovidNICC {
		public static void main(String args[]){
		Scanner entrada= new Scanner(System.in);
		String nombre;
        int edad;
        int sexo;
        
	    System.out.println("**************************************************************");
   	    System.out.println("************ Determinar Tipo De Vacuna Covid *****************");
        System.out.println("**************************************************************");

        System.out.print("¿Cuál es el nombre del paciente?: ");
        nombre = entrada.next();
        System.out.print("¿Cuál es la edad del paciente?: ");
        edad = entrada.nextInt();
        System.out.print("Precione 1 si su sexo es Masculino || Precione 2 si su sexo es Femenino: ");
        sexo = entrada.nextInt();
        
        if (edad > 70) {
            System.out.println("El paciente "+ nombre+"Requiere una vacuna de tipo (C)");
        } else if (edad >= 16 && edad <= 69) {
            if (sexo == 1) {
            	System.out.println("El paciente "+ nombre+"Requiere una vacuna de tipo (A)");
                
            } else if (sexo == 2) {
                System.out.println("El paciente "+ nombre+"Requiere una vacuna de tipo (B)");
           
            } else {
                System.out.println("El sexo ingresado es incorrecto");
            }
        } else if (edad < 16) {
            System.out.println("El paciente "+ nombre+"Requiere una vacuna de tipo (A)");
        } else {
            System.out.println("La edad ingresada es incorrecta");
        }
 
    }
}