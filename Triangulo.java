package Triangulos;

public class Triangulo {
	private double base;
	private double lado;
	
public Triangulo(double base, double lado) {
	this.base=base;
	this.lado=lado;
}
public double obtenerPerimetro() {
	double perimetro=(lado*2)+base;
	return perimetro;
}
public double obtenerArea() {
	double area= (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
	return area;
	
	
}
public String mostrarDatos() {
	return "La base es:" + base + "El lado es:" + lado + "El perimetro es:" + obtenerPerimetro() + "El area es:" + obtenerArea();
}
}


