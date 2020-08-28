public class TestRectangle {
    public static void main(String[] args) {
        Rectangle a =new Rectangle(8,8);
        Rectangle b =new Rectangle(6,11);
        System.out.println(a);
        System.out.println(b);
        System.out.println("เปรียบเทียบความเท่ากันของสีเหลี่ยมทั้งสอง   : "+a.isEquals(b));
        System.out.println("เปรียบเทียบความเท่ากันของขนาดของพื้นที่   : "+Rectangle.isAreaEqual(a,b));
        System.out.println("แสดงค่าความแตกต่างของขนาดพื้นที่ของสี่เหลี่ยมทั้งสอง : "+a.differentArea(b));
        b =Rectangle.transformToSquare(b);
        System.out.println("TransFormToSquare : "+b);
    }
}
