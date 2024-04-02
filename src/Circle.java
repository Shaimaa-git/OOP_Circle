public class Circle {
    private String color;
    private Double radius;

    public Circle(String color, Double radius) {
        this.color = color;
        this.radius = radius;
    }
    public double calculateCircleArea(){
        return Math.PI*radius*radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
