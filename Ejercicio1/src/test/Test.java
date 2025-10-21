package test;
import model.Triangulo;

public class Test {
  public static void main(String[] args) {
    int lado1 = 3;
    int lado2 = 3; 
    int lado3 = 3;
    int perimetro;
    double area;
    
    Triangulo triangulo1; 
    triangulo1 = new Triangulo(lado1, lado2, lado3);

    area = triangulo1.calcularArea();
    System.out.println("area del triangulo: " + area);

    perimetro = triangulo1.calcularPerimetro();
    System.out.println("perimetro del triangulo: " + perimetro);
  }
}