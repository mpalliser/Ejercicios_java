package org.foobarspam.Dni;

public class TablaAsignacion {
		
	//---------- PROPIEDADES ----------
	char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 
						'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
	//---------- GETTERS ----------
	public char getLetra(int posicion){
		return this.tabla[posicion];
	}
	public int getModulo(){
		return this.tabla.length;
	}
	
	//---------- METODOS ----------
	public Boolean letraValida(char letra){
		String tablaString = String.valueOf(tabla);
		return tablaString.contains(Character.toString(letra));
	}
	public char calcularLetra(String DNI){
		int dni = Integer.parseInt(DNI);
		int posicion = dni % getModulo();
		return getLetra(posicion);
	}
	public void mostrarTabla(){
		System.out.print(this.tabla);
	}

}
