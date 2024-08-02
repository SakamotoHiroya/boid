package util;

public class Vector {

    private float x;
    private float y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public float computeMagnitude(){
        return (float)Math.sqrt(x * x + y * y);
    }

    public void add(Vector v){
        this.x += v.getX();
        this.y += v.getY();
    }

    public void sub(Vector v){
        this.x -= v.getX();
        this.y -= v.getY();
    }

    public void mult(float factor){
        this.x *= factor;
        this.y *= factor;
    }

    public void div(float divider){
        this.x /= divider;
    }

    public void toUnit(){
        float magnitude = computeMagnitude();
        this.x /= magnitude;
        this.y /= magnitude;
    }

    public static Vector add(Vector v1, Vector v2){
        return new Vector(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    public static Vector sub(Vector v1, Vector v2){
        return new Vector(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    public static Vector mult(Vector v, float factor){
        return new Vector(v.getX() * factor, v.getY() * factor);
    }

    public static Vector div(Vector v, float divider){
        return new Vector(v.getX() / divider, v.getY() / divider);
    }

    public static float dot(Vector v1, Vector v2){
        return v1.x * v2.x + v1.y * v2.y;
    }

}
