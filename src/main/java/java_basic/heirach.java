package java_basic;
class animal{

    public void sound(){

    }
}
class dog extends animal{
    @Override
    public void sound() {
        System.out.println("Barks");
    }
}
class cat extends animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
public class heirach {
    public static void main(String[] args) {
        dog obj1=new dog();
        obj1.sound();
        cat obj2=new cat();
        obj2.sound();
    }
}
