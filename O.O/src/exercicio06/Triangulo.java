package exercicio06;

public class Triangulo {
    public float lado;
    public float altura;

    public float area;

    public void calcArea(float lado, float altura) {
        this.area += lado * altura / 2;
    }
}
