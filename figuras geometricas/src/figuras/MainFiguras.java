package figuras;

public class MainFiguras {

	public static void main(String[] args) {
		
		Rectangulo firstRectangulo = new Rectangulo("first rectangulo",5,4);
		Cuadrado firstCuadrado = new Cuadrado("first cuadrado",5);
		Circulo firstCirculo = new Circulo("first circulo",5);
		Elipse firstElipse = new Elipse("first elipse",5,10);
		
		if (firstRectangulo.area()==20 && firstCuadrado.area()==25){
			System.out.println("Rectangulo OK, Cuadrado OK");
		}
		if (firstCirculo.area()==78.5 && firstElipse.area()==157){
			System.out.println("Circulo OK, Elipse OK");
		}
	}

}
