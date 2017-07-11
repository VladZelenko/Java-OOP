public class Triangle extends Figure{

    double angleAB;

    Triangle(double sideA, double sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }

    double getSquare() {
        double square = this.sideA * this.sideB * Math.sin(this.angleAB * Math.PI / 180);
        return square;
    }
}
