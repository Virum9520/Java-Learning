abstract class Pen{
    abstract void write();
    abstract void refill();
}
abstract class Phone{
    Phone(){
        System.out.println("Constructor of phone");
    }
    abstract void ring();
    abstract void disconnect();
}
class FountainPen extends Pen{

    @Override
    void write(){
        System.out.println("Writing");
    }

    @Override
    void refill() {
        System.out.println("Refilling");
    }

    void changeNib(){
        System.out.println("Changing Nib");
    }
}
class Smartphone extends Phone{

    @Override
    void ring() {
        System.out.println("Ringing");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting");
    }
    Smartphone(){
        System.out.println("Constructor of Smartphone");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

interface TVremote{
    void on();
    void off();
}
interface smartTVremote extends TVremote{
    void mic_on();
}

class smartTV implements smartTVremote{

    @Override
    public void on() {
        System.out.println("On");
    }

    @Override
    public void off() {
        System.out.println("Off");
    }

    @Override
    public void mic_on() {
        System.out.println("Mic On");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //1,2
        FountainPen p1 = new FountainPen();
        p1.refill();

        //3
        Human h1 = new Human();
        h1.eat();

        //4
        Phone p = new Smartphone();
        p.disconnect();
        p.ring();

        //5
        Monkey m1 = new Human();
        System.out.println(m1.getClass());
    }
}
