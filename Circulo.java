package figuras;

public class Circulo {
	protected double centroX;
	protected double centroY;
	protected double tamRaio;
	public Circulo(double cx, double cy, double r) {
		this.centroX = cx;
		this.centroY = cy;
		this.tamRaio = r;
	}
	public double perimetroCirculo() {
		
		return  2 *(Math.PI * this.tamRaio);
	}
	public double areaCirculo() {
		
		return  Math.PI * (Math.pow(this.tamRaio, 2));
	}
	public String toString() {
		return "Circulo: " + "\n-Perimetro=" + this.perimetroCirculo() + 
				"\n-Area=" + this.areaCirculo();
	}
}
