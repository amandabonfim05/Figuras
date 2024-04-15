package figuras;

public class Retangulo {
	protected double cantoSupEsqX;
	protected double cantoSupEsqY;
	protected double largura;
	protected double altura;
	public Retangulo(double csex, double csey, double a, double l) {
		this.cantoSupEsqX = csex;
		this.cantoSupEsqY = csey;
		this.altura = a;
		this.largura = l;
	}
	public double perimetroRetangulo() {
		
		return  (2 * this.altura) + (2 * this.largura);
	}
	public double areaRetangulo() {
		
		return this.altura * this.largura;
	}
	public String toString() {
		return "Retangulo:" + "\n-Perimetro=" + this.perimetroRetangulo() +
				"\n-Area=" + this.areaRetangulo();
	}
}
