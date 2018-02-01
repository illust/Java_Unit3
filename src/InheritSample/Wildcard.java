package InheritSample;

/**
 * Created by Sven Wong on 2018/2/1.
 */
public class Wildcard <Type> {
    Type object;
    public Wildcard(Type object){
        this.object = object;
    }
    public Type getObject(){
        return object;
    }
}
class ShowType{
    public void show(Wildcard<?> o){ //泛型中使用通配符
        System.out.println(o.getObject().getClass().getName());
    }
}
class Test{
    public static void main(String[] args){
        ShowType st = new ShowType();
        Wildcard<Integer> i = new Wildcard<Integer>(2);
        Wildcard<String> s = new Wildcard<String>("hello");
        st.show(i);
        st.show(s);
    }
}
