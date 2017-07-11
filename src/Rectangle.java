public class Rectangle extends Figure {

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getSquare() {
        double square = this.sideA * this.sideB;
        return square;
    }
}
