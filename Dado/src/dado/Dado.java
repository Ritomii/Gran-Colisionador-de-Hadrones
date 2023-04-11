package dado;

public class Dado {
	Object carasobj[];
	private int caras;
	
	public Dado() {
		this.caras = 6;
	}
	
	public Dado(int caras) {
		this.caras = caras;
	}

	public Dado(Object objs[]) {
		this.carasobj = objs;
		this.caras = objs == null? 6 : objs.length;
	}

	public Object lanzarDadoObjetos() {
		return carasobj[(int) Math.floor(Math.random() * this.caras)];
	}

	public int lanzarDado(){
		return (int)(Math.floor(Math.random()*(this.caras)+1));
	}
	
	public Object lanzar(){
		if(carasobj == null)
			return (Integer) (int)(Math.floor(Math.random()*(this.caras)+1));
		else
			return carasobj[(int) Math.floor(Math.random() * this.caras)];
	}

}
