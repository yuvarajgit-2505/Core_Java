package java_basic;
class add{
    public void addition(){
        int one=5;
        int two=2;
        int result=one+two;
        System.out.println(result);
    }
}
class sub{
    public void subtract(){
        int one=5;
        int two=2;
        int result=one-two;
        System.out.println(result);

    }
}
public class inherit {
    public static void main(String[] args) {
        add obj1=new add();
        sub obj2=new sub();
        obj1.addition();
        obj2.subtract();

    }
}
