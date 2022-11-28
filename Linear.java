public class Linear {
    private final double a;
    private final double b;

    public Linear(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Linear(Linear lin) {
        this.a = lin.getA();
        this.b = lin.getB();
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public String toString() {
        if (this.a == 0 && this.b == 0) {
            return "y=0";
        } else if (this.a == 0) {
            return "y= " + this.b;
        } else if (this.b == 0) {
            return "y= " + this.a + "x";
        } else if (this.b < 0) {
            return "y= " + this.a + "x " + this.b;
        } else {
            return "y= " + this.a + "x + " + this.b;
        }
    }

    public double assign(double x) {
        return (this.a) * x + this.b;
    }

    public double solve(double y) {
        if (this.a == 0) return Double.MAX_VALUE;
        return (y - this.b) / this.a;
    }

    public double getIntersection(Linear other) {
        return (other.getB() - this.b) / (this.a - other.getA());
    }

    public boolean isOnLine(double x, double y) {
        return y == (this.a * x + this.b);
    }

    public boolean areParallel(Linear other) {
        return this.a == other.getA();
    }

    public Linear createLinear(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            return new Linear(0, Double.MAX_VALUE);
        }
        double a = (y2 - y1) / (x2 - x1);
        double b = -a * x1 + y1;
        return new Linear(a, b);
    }

}






