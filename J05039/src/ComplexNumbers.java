public class ComplexNumbers {
    private int real;
    private int img;

    public ComplexNumbers(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    public ComplexNumbers add(ComplexNumbers c) {
        int r = this.real + c.real;
        int im = this.img + c.img;
        ComplexNumbers res = new ComplexNumbers(r, im);
        return res;
    }

    public ComplexNumbers multi(ComplexNumbers c) {
        int r = this.real * c.getReal() - this.img * c.img;
        int im = this.real * c.img + this.img * c.real;
        ComplexNumbers res = new ComplexNumbers(r, im);
        return res;
    }

    public String toString() {
        if (img <= 0)
            return real + " - " + img * -1 + "i";
        return real + " + " + img + "i";

    }
}
