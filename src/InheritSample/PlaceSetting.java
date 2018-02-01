package InheritSample;

/**
 * Created by Sven Wong on 2018/2/1.
 */

class Plate{ // 声明盘子
    public Plate(int i){
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate{ // 声明餐盘为盘子的子类
    public DinnerPlate(int i){
        super(i);  // 调用超类的构造方法
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil{ // 声明器具
    Utensil(int i){
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil{ // 声明勺子为器具的子类
    public  Spoon(int i){
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil{ // 声明餐叉为器具的子类
    public Fork(int i){
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil{ // 声明餐刀为器具的子类
    public Knife(int i){
        super(i);
        System.out.println("Knife constructor");
    }
}

class Custom{ // 声明做某事的习惯
    public Custom(int i){
        System.out.println("Custom constructor");
    }
}

public class PlaceSetting extends Custom{ // 餐桌的布置
    // 各个部件类的组合形式（有一个）
    // 要区分组合和继承两种类重用形式，继承是一种隶属关系（是一个）
    Spoon sp;
    Fork frk;
    Knife kn;
    DinnerPlate pl;

    public PlaceSetting(int i){
        super(i+1);
        sp = new Spoon(i+2);
        frk = new Fork(i+3);
        kn = new Knife(i+4);
        pl = new DinnerPlate(i+5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args){
        PlaceSetting x = new PlaceSetting(9);
    }
}
