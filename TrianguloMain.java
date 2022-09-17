package Triangulos;
import java.util.Scanner;

public class TrianguloMain {
	
public static double trianguloMayorArea(Triangulo triangulos[]) {
	double area;
	area=triangulos[0].obtenerArea();
	
	for(int i=1;i<triangulos.length;i++) {
		if(triangulos[i].obtenerArea()>area){
			area=triangulos[i].obtenerArea();
			
			
		}
	}
	return area;
	
}

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		double base;
		double lado;
		int numeroTriangulos;
		double mayorArea;
		
		System.out.println("Ingrese la cantidad de triangulos:");
		numeroTriangulos=reader.nextInt();
		
		 Triangulo triangulos[]=new Triangulo[numeroTriangulos];
		
		for(int i=0;i<triangulos.length;i++) {
			System.out.println("Ingrese los valores del triangulo numero" + (i+1)+":");
			System.out.println("Ingrese la base:");
			base=reader.nextDouble();
			System.out.println("Ingrese el lado:");
			lado=reader.nextDouble();
			
			triangulos[i]=new Triangulo(base,lado);
			System.out.println("El perimetro del triangulo es:" + triangulos[i].obtenerPerimetro());
			System.out.println("El area del triangulo es:" + triangulos[i].obtenerArea());
			
		}
		


	
	System.out.println("El triangulo de mayor area es:");
	System.out.println(trianguloMayorArea(triangulos));

}
}

