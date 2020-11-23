package pe.edu.upeu.nicc;

import pe.edu.upeu.nicc.examen.ResolucionExamen;

import pe.edu.upeu.nicc.utils.LeerTeclado;

/**
 * Autor Nicc
 *
 */
public class App {
    public static void main( String[] args ) {
        LeerTeclado teclado = new LeerTeclado();
        ResolucionExamen obj = new ResolucionExamen();
        String opcion = "SI";
        int numDeAlg;
        String mensajeMenu ="1.- El problema del Gerente\n"+
                            "2.- Tabla de multiplicar\n"+
                            "3.- Los números divisores\n"+
                            "4.- Potencia con recursividad";
        do{
          System.out.println(mensajeMenu);

            numDeAlg = teclado.leer(0, "Ingrese el Algoritmo que desea probar: ");
            
            switch(numDeAlg){
                /**caso 1 */
                case 1:
                obj.gerenteCostos();
                break;
                /**caso 2 */
                case 2: 
                obj.tablaDeMultiplicar();
                break;
                /**caso 3 */
                case 3:
                
                obj.numerosPerfectos();
                break;
                /**caso 4 */
                case 4:
                int base = teclado.leer(0,"Ingrese la base: ");
                int exp = teclado.leer(0,"Ingrese el exponente: ");
                System.out.println("El resultado es: " + obj.potenciaRecursiva(base, exp));
                break;
                
                /**caso default */
                default: System.out.println("Num de Algoritmo no existe!!"); break;
            }        
          /** try catch de String, String */
          opcion = teclado.leer("", "Desea probar mas algoritmos? SI/NO");
        }while(opcion.equals("SI") || opcion.equals("si"));        
    }
}
