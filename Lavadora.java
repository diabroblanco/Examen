package examenElectrodomestico;

public class Lavadora extends Electrodomestico {
int precio;
boolean caliente;
int cambio;



public Lavadora(String tipoElectrodomestico, String marcaElectrodomestico, double potencia, int horas, int precio,
		boolean caliente) {
	super(tipoElectrodomestico, marcaElectrodomestico, potencia, horas);
	this.precio = precio;
	this.caliente=false;
	if(caliente=false) {
		System.out.println("Solo agua fría");
	}else {
		System.out.println("Solo agua fría");
	}
}


public Lavadora(String tipoElectrodomestico, String marcaElectrodomestico, double potencia, int horas, int cambio) {
	super(tipoElectrodomestico, marcaElectrodomestico, potencia, horas);
	// TODO Auto-generated constructor stub
	if(cambio==1) {
		caliente=true;
		System.out.println("Agua caliente");
	}else if(cambio==2){
		caliente=false;
		System.out.println("Agua fría");
	}
}


public int getPrecio() {
	
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


public boolean isCaliente() {
	return caliente;
}



public void setCaliente(boolean caliente) {
	this.caliente = caliente;
}


@Override
public String toString() {
	return "Lavadora "+ getMarcaElectrodomestico()+ " tiene un coste de " + precio + " euros" + "\n"
			+ "consume "+ potencia +" kw " + "\n en "+ 24 + " horas "
					+  " consume " + potencia*horas +" kw ";
}

	
	

}
