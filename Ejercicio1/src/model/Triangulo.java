package model;

public class  Triangulo {
  private int lado1; 
  private int lado2; 
  private int lado3;

  public Triangulo(int lado1, int lado2, int lado3) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
  }

  public double calcularArea(){
    double s = (lado1 + lado2 + lado3)/2.0;
    double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    return area;
  }
  public int calcularPerimetro(){
    int perimetro = lado1 + lado2 + lado3;
    return perimetro;
  }
  public void setLado1(int lado) {
    lado1 = lado;
  }
  public void setLado2(int lado) {
    lado2 = lado;
  }
  public void setLado3(int lado) {
    lado3 = lado;
  }
}