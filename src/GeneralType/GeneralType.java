package GeneralType;

/**
 * Created by Sven Wong on 2018/2/1.
 */
public class GeneralType <Type>{
    Type object;
    public GeneralType(Type object){
        this.object = object;
    }
    public Type getObject(){
        return object;
    }

    public static void main(String[] args){
        GeneralType<Integer> i = new GeneralType<Integer>(2);
        GeneralType<Double> d = new GeneralType<Double>(0.33);
        System.out.println("i.object="+(Integer)i.getObject());

    }
}


