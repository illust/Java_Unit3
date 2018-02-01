package InheritSample;

/**
 * Created by Sven Wong on 2018/2/1.
 */
public class GeneralMethod {
    <Type> void printClassName(Type object){
        System.out.println(object.getClass().getName());
    }

    public static void main(String[] args){
        GeneralMethod gm = new GeneralMethod();
        gm.printClassName("Hello");
        gm.printClassName(3);
        gm.printClassName(3.0f);
    }
}
