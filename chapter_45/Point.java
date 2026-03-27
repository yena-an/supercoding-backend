package ClassAndObject.chapter_45;

public class Point<T extends Number, V extends Number> {
    private T x; // x 좌표
    private V y; // y 좌표

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance(){
//        // (X**2 + Y**2) ^ 1/2
//        if (!(this.x instanceof Number)){
//            return null;
//        }
//        if (!(this.y instanceof Number)){
//            return null;
//        } -> extends Number 하면 필요 없어짐

        Double num1 =  this.x.doubleValue();
        Double num2 =  this.y.doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }
}
