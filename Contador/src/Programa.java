
public class Programa {

	public static void main(String[] args) {
		Contador c = new Contador();
		
		System.out.println(c.mostrar());
		
		c.contar();
		c.contar();
		System.out.println(c.mostrar());

		c.reset();
		System.out.println(c.mostrar());
	}

}
