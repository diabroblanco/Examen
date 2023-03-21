package examenElectrodomestico;

public class Electrodomestico {
	public String tipoElectrodomestico;
	private String marcaElectrodomestico;
	protected final double potencia;
	protected int horas;
	protected double costehora;
	
	
	public Electrodomestico(String tipoElectrodomestico, String marcaElectrodomestico, double potencia, int horas) {

		this.tipoElectrodomestico = tipoElectrodomestico;
		this.marcaElectrodomestico = marcaElectrodomestico;
		this.potencia = potencia;
		this.horas = horas;

	}
	public String getTipoElectrodomestico() {
		return tipoElectrodomestico;
	}
	public void setTipoElectrodomestico(String tipoElectrodomestico) {
		this.tipoElectrodomestico = tipoElectrodomestico;
	}
	public String getMarcaElectrodomestico() {
		return marcaElectrodomestico;
	}
	public void setMarcaElectrodomestico(String marcaElectrodomestico) {
		this.marcaElectrodomestico = marcaElectrodomestico;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getCostehora() {
		return costehora;
	}
	public void setCostehora(double costehora) {
		this.costehora = costehora;
	}
	public double getPotencia() {
		return potencia;
	}
	@Override
	public String toString() {
		return "Electrodomestico " + tipoElectrodomestico + "\n"
				+ " Marca "
				+ marcaElectrodomestico + 
				""
				+ "\n tiene una potencia de " + potencia +" kw" + ". En= " + horas + " horas " + " y tiene un coste hora de=" + potencia*horas +" euros" 
				;
	}
	
	

		
	

	
	

	
	
}
