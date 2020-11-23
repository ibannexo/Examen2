package pe.edu.upeu.nicc.examen;

import pe.edu.upeu.nicc.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado teclado = new LeerTeclado();
    public void tablaDeMultiplicar(){
        int total;
        for(int i = 1; i <= 20; i++) {
            System.out.println("Tabla de Multiplicar del "+i+":\n");
            for(int j = 1; j <= 10; j++) {
                total = i * j;
                System.out.println(i + " X " + j + " = " + total);
            }
            System.out.println();
        }
    }
    public int potenciaRecursiva(int base, int exp) {
        int resultado = 0;
        if (exp == 0) {
            resultado = 1;
        }
        else if (exp > 0) {
            resultado = base * (int)Math.pow(base,exp - 1);
        }
        return resultado;
    }
    public void numerosPerfectos() {
        int numero=1;
        int i=1;
        int suma=0;
        String numerosp="";
        while(numero<5){
            i++;
            for(int x=1;x<i;x++){
                if(i%x==0)
                {
                   suma=suma+x;
                }
            }if(suma==i)
            {   numero=numero+1;
                numerosp=numerosp+suma+" ";
                suma=0;
            }
                suma=0; 
        }
        System.out.println("Numeros Perfectos: "+numerosp);
        System.out.println("");
    }
    public void gerenteCostos() {
        double total1 = 0, total2 = 0, total3 = 0, total_final = 0;
        for(int j = 1; j <=3;j++) {
            int cat = teclado.leer(0,"Cuantos modelos de la categoria "+j+" tiene: ");
            if(cat >= 1) {
                int modelo[] = new int[cat], modelo2[] = new int[cat],modelo3[] = new int[cat];
                System.out.println("Categoría "+j);
                for(int i = 0; i<cat;i++) {
                    if(j==1) {
                        modelo[i] = teclado.leer(0,"Ingrese el costo del "+(i+1)+" modelo: ");
                        total1 += modelo[i] * 0.1;
                        System.out.println("El total con el 10%: "+total1);
                    }
                    if(j==2) {
                        modelo2[i] = teclado.leer(0,"Ingrese el costo del "+(i+1)+" modelo: ");                        
                        total2 += modelo2[i] * 0.07;
                        System.out.println("El total con el 7%: "+total2);
                    }
                    if(j==3) {
                        modelo3[i] = teclado.leer(0,"Ingrese el costo del "+(i+1)+" modelo: ");
                        total3 += modelo3[i] * 0.05;
                        System.out.println("El total con el 5%: "+total3);
                    }
                }
            }else{
                System.out.println("Número es Incorrecto");
            }
        } 
        System.out.println("El total de la categoria 1 es: "+total1);
        System.out.println("El total de la categoria 2 es: "+total2);
        System.out.println("El total de la categoria 3 es: "+total3);
        total_final = total1 + total2 + total3;
        System.out.println("El total a pagar es de: "+total_final);
    }
}
