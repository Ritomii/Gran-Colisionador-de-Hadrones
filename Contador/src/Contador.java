
public class Contador {
	private int cont;
	public long mostrar(){
		return this.cont;
	}
	public void contar(){
		this.cont++;
	}
	
	public void reset(){
		this.cont = 0;
	}
}
