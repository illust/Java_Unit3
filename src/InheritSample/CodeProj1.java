package InheritSample;

import java.util.Scanner;

/**
 * Created by Sven Wong on 2018/2/1.
 */

public class CodeProj1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = in.nextInt();
        }
        Teacher teacher = new Teacher(arr[0],arr[1],arr[2],arr[3]);
        teacher.show();*/

        int[][] arr = new int[n][];
        for(int i=0;i<n;i++){
            int ch = in.nextInt();
            arr[0][0] = ch;
            for(;ch!='\n';){
                
            }
        }
    }
}

abstract class Person { //

}

class Student extends Person{
    static int x;
    static int y;
    static int z;
    public Student(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void show(){
        System.out.println("Student "+(x+y+z)/3);
    }
}

class Teacher extends Person{
    static int a;
    static int b;
    static int c;
    static int d;
    public Teacher(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void show(){
        System.out.println("Teacher "+(a+b+c+d)/4);
    }
}


