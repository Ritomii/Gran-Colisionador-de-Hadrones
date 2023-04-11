
public class Ejercicio3 {
	public static int[][] sumaAdyacentes1(int m[][]){
		if(m == null)
			return m;
		
		int fil = m.length,
				col = m[0].length;
		
		int mnue[][] = new int[fil][col];
		
		if(fil == 1 && col == 1) {
			mnue[0][0] = m[0][0];
			return mnue;
		}
		
		if(fil == 1) {
			mnue[0][0] = m[0][0] + m[0][1];
			mnue[0][col-1] = m[0][col-1] + m[0][col-2];
			for(int i=1;i<col-1;i++) {
				mnue[0][i] = m[0][i-1] + m[0][i] + m[0][i+1];
			}
			return mnue;
		}
		
		if(col == 1) {
			mnue[0][0] = m[0][0] + m[1][0];
			mnue[fil-1][0] = m[fil-1][0] + m[fil-2][0];
			for(int i=1;i<fil-1;i++) {
				mnue[i][0] = m[i-1][0] + m[i][0] + m[i+1][0];
			}
			return mnue;
		}
		
		mnue[0][0] = m[0][0] + m[0][1] + m[1][0];
		mnue[fil-1][0] = m[fil-1][0] + m[fil-1][1] + m[fil-2][0];
		mnue[0][col-1] = m[0][col-1] + m[0][col-2] + m[1][col-1];
		mnue[fil-1][col-1] = m[fil-1][col-1] + m[fil-2][col-1] + m[fil-1][col-2];
		int i;
		for(i=1;i<col-1;i++) {
			mnue[0][i] = m[0][i] + m[0][i-1] + m[0][i+1] + m[1][i];
		}
		for(i=1;i<col-1;i++) {
			mnue[fil-1][i] = m[fil-1][i] + m[fil-1][i-1] + m[fil-1][i+1] + m[fil-2][i];
		}
		for(i=1;i<fil-1;i++) {
			mnue[i][0] = m[i][0] + m[i-1][0] + m[i+1][0] + m[i][1];
		}
		for(i=1;i<fil-1;i++) {
			mnue[i][col-1] = m[i][col-1] + m[i-1][col-1] + m[i+1][col-1] + m[i][col-2];
		}
		for(i=1;i<fil-1;i++) {
			for(int j=1;j<col-1;j++) {
				mnue[i][j] = m[i][j] + m[i][j+1] + m[i][j-1] + 
						m[i+1][j] + m[i-1][j];
			}
		}
		
		return mnue;
	}
	
	public static int[][] sumaAdyacentes2(int m[][]){
		if(m == null)
			return m;
		int mnue[][] = new int[m.length][];
		
		for(int i=0;i<m.length;i++) {
			mnue[i] = new int[m[i].length];
		}
		
		if(m.length == 1 && m[0].length == 1) {
			mnue[0][0] = m[0][0];
			return mnue;
		}
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				mnue[i][j] = m[i][j];
				if(i - 1 >= 0 && m[i-1].length > j)
					mnue[i][j] += m[i-1][j];
				if(j - 1 >= 0)
					mnue[i][j] += m[i][j-1];
				if(i + 1 < m.length && m[i+1].length > j)
					mnue[i][j] += m[i+1][j];
				if(j + 1 < m[i].length)
					mnue[i][j] += m[i][j+1];
			}
		}
		
		return mnue;
	}
}
