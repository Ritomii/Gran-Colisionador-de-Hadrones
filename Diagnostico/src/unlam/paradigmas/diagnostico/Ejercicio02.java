package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] m) {

		if(m == null || m.length == 0 || m[0].length == 0)
			return true;

		boolean hayCero = false;
	
		for (int i = 0; i < m.length && !hayCero ; i++) {
			for (int j = 0; j < m[i].length && !hayCero; j++) {
				if (m[i][j] == 0)
					hayCero = true;
			}
		}

		return hayCero;
	}

}
