package JavaAtividades;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double a = 0.00;
		double b = 0.00;
		double c = 0.00;
		final double ValorPi = 3.14159;
		
		double trianguloRetangulo = (a * c) / 2;
		double areaCirculo = ValorPi * (c * c);
		double trapezio = (a + b) * c / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f", areaRetangulo);

		
	

	}

}
