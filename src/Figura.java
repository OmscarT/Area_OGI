public class Figura {
	
	private float base;
	private float altura;
	private float radio;

	// Constructor vacío para inicializar con valores por defecto
	public Figura() {
		this.base = 0;
		this.altura = 0;
		this.radio = 0;
	}
	
	// Constructor para inicializar base, altura y radio
	public Figura(float base, float altura, float radio) {
		this.base = base;
		this.altura = altura;
		this.radio = radio;
	}

	// Getters y Setters
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	// Método para calcular el área de un triángulo
	public float calcularAreaTriangulo(float base, float altura) {
		return (base * altura) / 2;
	}

	// Método para calcular el área de un rectángulo
	public float calcularAreaRectangulo(float base, float altura) {
		return base * altura;
	}

	// Método para calcular el área de un círculo
	public float calcularAreaCirculo(float radio) {
		return (float) (Math.PI * Math.pow(radio, 2));
	}
}
