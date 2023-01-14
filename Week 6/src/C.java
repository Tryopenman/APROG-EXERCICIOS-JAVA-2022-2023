import java.util.Scanner;
import java.lang.Math;
public class C {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        a=input.nextDouble();
        b=input.nextDouble();
        c= input.nextDouble();
        if (verificadorTriangulos(a,b,c)){
            System.out.printf("a=" + "%.2f%n",a);
            System.out.printf("b=" + "%.2f%n",b);
            System.out.printf("c=" + "%.2f%n",c);
            System.out.printf("ang(a,b)=" + "%.2f%n", anguloab(a,b,c));
            System.out.printf("ang(a,c)=" + "%.2f%n", anguloac(a,b,c));
            System.out.printf("ang(b,c)=" + "%.2f%n",angulobc(a,b,c));
        }else {
            System.out.println("impossible");
        }
    }
    public static boolean verificadorTriangulos(double a1,double b1, double c1){
        boolean verificador = false;
        if (a1+b1>c1 && a1+c1>b1 && b1+c1>a1){
            verificador= true;
        }
        return (verificador);
    }
    public static double anguloab(double a2, double b2, double c2){
        double ang1;
        ang1= (Math.pow(a2,2)+Math.pow(b2,2)-Math.pow(c2,2))/(2*a2*b2);
        ang1=Math.acos(ang1);
        ang1=Math.toDegrees(ang1);
        return (ang1);
    }
    public static double anguloac(double a3, double b3, double c3){
        double ang2;
        ang2= (Math.pow(a3,2)+Math.pow(c3,2)-Math.pow(b3,2))/(2*a3*c3);
        ang2=Math.acos(ang2);
        ang2=Math.toDegrees(ang2);
        return (ang2);

    }
    public static double angulobc(double a4, double b4, double c4){
        double ang3;
        ang3=(Math.pow(b4,2)+Math.pow(c4,2)-Math.pow(a4,2))/(2*b4*c4);
        ang3=Math.acos(ang3);
        ang3=Math.toDegrees(ang3);
        return (ang3);
    }
}
