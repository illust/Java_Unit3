package InheritSample;

/**
 * Created by Sven Wong on 2018/1/30.
 */

class A1{
    static int x = 2; // 静态变量不被继承，但是可以被所有本类对象和子类对象访问
    public void setx(int i){ x = i;}
    void printa(){System.out.println(x);}
}

class B1 extends A1{
    int x = 100;
    void printb(){
        super.x = super.x + 10;
        System.out.println("super.x="+super.x+" x= "+x);
    }
}

public class Exam4_2Test {
    public static void main(String args[]){
/*        Employee li = new Employee();
        li.name = "Li Ming";
        li.employeeNumber = 123456;
        System.out.println(li.getName());
        System.out.println(li.getEmployeeNumber());

        Manager he = new Manager();
        he.name = "He Xia";
        he.employeeNumber = 543469;
        he.responsibilities = "Internet project";
        System.out.println(he.getName());
        System.out.println(he.getEmployeeNumber());
        System.out.println(he.getResponsibilities());*/

        A1 a1 = new A1();
        a1.setx(4);
        a1.printa();

        B1 b1 = new B1();
        b1.printb();
        b1.printa();

        b1.setx(6); // 将继承x值设置为6
        b1.printb();
        b1.printa();
        a1.printa();
    }
}


/**方法覆盖的应用场合
 1. 子类中实现与超类相同的功能，但采用不同的算法或公式；
 2. 在名字相同的方法中，要做比超类更多的事情；
 3. 在子类中需要取消从超类继承的方法。

 注意事项：
 1. 必须覆盖的方法：
     [1]派生类必须覆盖基类中的抽象的方法，否则派生类自身也成为抽象类（拥有抽象方法的类称为抽象类，抽象类不能生成实例，只能当超类用。子类如果继承了抽象类，当中存在抽象方法，就必须把这些抽象方法覆盖掉。）
 2. 不能覆盖的方法
     [1]基类中声明为final的终结方法
     [2]基类中声明为static的静态方法
 3. 调用被覆盖的方法
    super.overriddenMethodName();
 */