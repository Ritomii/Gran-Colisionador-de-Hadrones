package unlam.corona;

import unlam.circulo.Circulo;

public class Corona {
	private Circulo interior, exterior;
	
	public Corona(){
		this.interior.setRadio(1);
		this.exterior.setRadio(2);
	}

	public Corona(double radioInt, double radioExt){
		this.interior = new Circulo(radioInt);
		this.exterior = new Circulo(radioExt);
	}
	
	public double calcularArea(){
		return this.exterior.calcularArea() - this.interior.calcularArea();
	}
}
