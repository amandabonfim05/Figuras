package aplicacoes;
import figuras.Circulo;
import figuras.Retangulo;
	public class AplicacoesFiguras {
		public static void main(String[] args) {
			Circulo c = new Circulo(1, 2, 4);
			Retangulo r = new Retangulo(1, 2, 4, 2);
			System.out.println(c.toString());
			System.out.println(r.toString());
		}
	}