package J04002;

class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectange(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.setColor(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return (width + height) * 2;
    }
}