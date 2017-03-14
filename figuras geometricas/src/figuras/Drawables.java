package figuras;

import java.util.ArrayList;

public class Drawables {
	
	public static void dibujarDrawables(ArrayList<Drawable> figuras){
		
		for (int i=0; i<figuras.size(); i++){
			figuras.get(i).draw();
		}
	}
	public static void aplicarTema(ArrayList<Drawable> figuras){
		try{
			for (int i=0; i<figuras.size(); i++){
				figuras.get(i).applyTheme();
			}
		}
		catch(ArithmeticException e){
			System.out.println("Aplicar tema no funciona en elipse");
		}

	}
}