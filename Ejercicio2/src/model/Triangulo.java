packge model;

public class Triangulo {
  private Punto puntoA;
  private Punto puntoB;
  private Punto puntoC;
  private double base;
  
  public double calcPerimeter() {
    int sideAB = puntoA.calcSide(puntoB);
    int sideBC = puntoB.calcSide(puntoC);
    int sideCA = puntoC.calcSide(puntoA);

    double perimetro = sideAB + sideBC + sideCA;
    return perimetro;
  }
  public double calcArea() {
    double area = (puntoA.x * (puntoB.y - puntoC.y) + puntoB.x * (puntoC.y - puntoA.y) + punto.x * (puntoA.y - puntoB.y))/2;
    return area;
  }
  public int calcHeigh() {
    double base = puntoA.calcBase(puntoB,puntoC);
    heigh = (area * 2)/base;
    return area;
  }
  public double setPuntoA(punto){
    puntoA = punto;
  }
  public double setPuntoB(punto){
    puntoB = punto; 
  }
  public double setPuntoC(punto){
    puntoC = punto;
  }

}