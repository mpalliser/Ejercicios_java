package figuras;

public interface Drawable {
	void draw();

	default void applyTheme(){
		throw new UnsupportedOperationException("Operacion applyTheme sin implementar");
	}
}
