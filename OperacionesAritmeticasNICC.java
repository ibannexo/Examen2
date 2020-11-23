import java.util.Scanner; 
 
public class OperacionesAritmeticasNICC{
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    int primerValor;
    int segundoValor; 
    int operacion;
    double resultado;

    System.out.println("Para SUMAR presione (1)  ");
    System.out.println("Para RESTA presione (2)  ");
    System.out.println("Para MULTIPLICAR presione (3)  ");
    System.out.println("Para DIVIDIR presione (4)  ");
    System.out.println("");
    System.out.println("¿Qué opcion va a elegir?: ");
    
    operacion = entrada.nextInt();
    System.out.print("Ingrese el primer valor: ");
    primerValor = entrada.nextInt();  

    System.out.print("Ingrese el segundo valor: ");
    segundoValor = entrada.nextInt();  

    if (operacion==1){
        resultado = primerValor + segundoValor;
        System.out.println("El resultado de la suma es: "+resultado);

    }else if  (operacion==2){
        resultado = primerValor - segundoValor;
        System.out.println("El resultado de la resta es: "+resultado);

    }else if  (operacion==3){
        resultado = primerValor * segundoValor;
        System.out.println("El resultado de la multiplicacion es: "+resultado);

    }else if  (operacion==4){
        resultado = primerValor / segundoValor;
        System.out.println("El resultado de la division es: "+resultado);
    }else  {
        System.out.println("ERROR la opcion ingresada es invalido");
    }
}
}
