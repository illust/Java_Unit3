package InheritSample;

/**
 * Created by Sven Wong on 2018/1/30.
 */
class C{
    final public int method(){
        System.out.println("a");
        return 0;
    }
}

public class A extends C{
    final public int method(int x){
        System.out.println(x);
        return 0;
    }

    public static void main(String args[]){
        A a = new A();
        C c = new C();
        a.method(2);
        c.method();
    }
}
