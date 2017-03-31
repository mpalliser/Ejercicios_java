package figuras;

import java.util.ArrayList;

public class Drawables {
	
	public static void dibujarDrawables(ArrayList<Drawable> figuras){
		
		for (Drawable elemento : figuras){
			elemento.draw();
		}
	}
	public static void aplicarTema(ArrayList<Drawable> figuras){

		for (Drawable elemento : figuras){
			try{elemento.applyTheme();
			}
		
			catch(UnsupportedOperationException exception){
				FiguraGeometrica figura = (FiguraGeometrica) elemento;
				System.out.println("Aplicar tema no funciona en " + figura.getNombre());
			}	
		}

	}
}