public class SalarioAnualNICC{
 public static void main(String args[]){

		double  salario = 1400;
		double  salarioAnual1;
		double  salarioAnual2;
		double  salarioAnual3;
		double  salarioAnual4;
		double  salarioAnual5;
		double  salarioAnual6;
		double  salarioTotal;

		salarioAnual1 = (salario*12)*1.10;
		salarioAnual2 = ((salario*12)*1.20);
		salarioAnual3 = ((salario*12)*1.30);
		salarioAnual4 = ((salario*12)*1.40);
		salarioAnual5 = ((salario*12)*1.50);
		salarioAnual6 = ((salario*12)*1.60);
		salarioTotal = salarioAnual1+salarioAnual2+salarioAnual3+salarioAnual4+salarioAnual5;
		System.out.println("*****************************************************************");
		System.out.println("********************SALARIO DE UN PROFESOR***********************");
		System.out.println("*********************Salario 1.400 soles*************************");
		System.out.println("*****************************************************************");
        System.out.println("Salario Total del primer año es de: "+salarioAnual1+" Ricos Soles");
        System.out.println("Salario Total del segundo año es de: "+salarioAnual2+" Ricos Soles");
        System.out.println("Salario Total del tercer año es de: "+salarioAnual3+" Ricos Soles");
        System.out.println("Salario Total del cuarto año es de: "+salarioAnual4+" Ricos Soles");
        System.out.println("Salario Total del quinto año es de: "+salarioAnual5+" Ricos Soles");
        System.out.println("Salario Total del sexto año es de: "+salarioAnual6+" Ricos Soles");
        System.out.println("");
        System.out.println("Salario Total al cabo de 6 años: "+salarioTotal+" Ricos Soles");
}
}
