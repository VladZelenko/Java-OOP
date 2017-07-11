public class Main {
    public static void main(String[] args){
        Figure triangle = new Triangle(2,2,24);
        Figure rectangle = new Rectangle(2,2);

        System.out.println("Площадь треугольника: "+triangle.getSquare());
        System.out.println("Площадь прямоугольника: "+rectangle.getSquare());
    }
}
