public class Inheritance {

    public static class Circle{
        public int radius;
        public Circle(int radius){
             this.radius= radius;
        }
        public Circle(){
            this.radius= 5;
        }
        public void find_area(){
            System.out.println(radius*radius*Math.PI);
        }
    }

    static class Cylinder extends Circle{
        int height, volume;

        public Cylinder(int radius, int height){
            super(radius);
            this.height = height;
        }
        public Cylinder(int height){
            super();
            this.height = height;
        }
        public void get_vol(){
            this.volume= (int) (radius*radius*Math.PI*height);
            System.out.println(volume);
        }
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(5,10);
        Circle circle1 = new Circle(15);

        System.out.println(cylinder1.radius);
        cylinder1.get_vol();
        circle1.find_area();

    }
}
