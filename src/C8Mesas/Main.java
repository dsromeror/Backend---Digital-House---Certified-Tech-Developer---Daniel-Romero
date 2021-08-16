package C8Mesas;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        System.out.println("El perimetro del circulo es: "+circulo.calcularPerimeto());
        Figura cuadrado = new Cuadrado(5);
        System.out.println("El perimetro del cuadrado es: "+cuadrado.calcularPerimeto());
    }
}
