package structural.bridge;

public class Main {
    public static void main(String[] args){
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape circle = new Circle(new GreenColor());
        circle.applyColor();

        Shape pentagon = new Pentagon(new BlueColor());
        pentagon.applyColor();
    }
}
