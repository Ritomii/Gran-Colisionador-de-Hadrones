package unlam.circulo;

public class Circulo {
	
	private double radio;
	
	
	public Circulo(){
		this.radio = 1;
	}
	
	public Circulo(double radio){
		this.radio = radio;
	}
	
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	public double calcularArea(){
	
		return Math.pow(radio, 2)*Math.PI;
	}

}
