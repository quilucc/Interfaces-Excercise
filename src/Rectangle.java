public class Rectangle implements Sortable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void print() {
        System.out.println("Rectangle [Width: " + width + ", Height: " + height + ", Area: " + getArea() + "]");
    }

    // Implement getSortableValue
    @Override
    public double getSortableValue() {
        return getArea();
    }
}
