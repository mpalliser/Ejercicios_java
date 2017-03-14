package figuras;

public interface Drawable {
	void draw();

	default void applyTheme(){
		System.out.println("tema aplicado");
	}
}
