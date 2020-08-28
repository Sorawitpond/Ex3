public class Rectangle {
    private double width,height;
    public Rectangle(double x , double y){
        this.width = x;
        this.height = y;
    }
    public Rectangle(Rectangle r){
        this.width = r.width;
        this.height = r.height;
    }
    public boolean isEquals(Rectangle r){
        return this.width == this.height && r.width == r.height;
    }
    public double differentArea(Rectangle r){
        return Math.abs(this.width*this.height - r.height*r.width);
    }
    public static boolean isAreaEqual(Rectangle a,Rectangle b){
        return a.height*a.width == b.height*b.width;
    }
    public static Rectangle transformToSquare(Rectangle r) {
        double side = Math.sqrt(r.width * r.height);
        return new Rectangle(side, side);
    }

    public String toString() {

        return this.width + "," + this.height;
    }
}