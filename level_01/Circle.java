public class Circle{
double radious;
public Circle(double radious){
this.radious = radious;
}

public static void Area(double radious){
double area = 3.14*radious*radious;
System.out.println("Ther area of the circle is "+ area);
}
public static void circumference(double radious){

double circum = 2*3.14*radious;
System.out.println("The circumference of the circle is "+ circum);

}
public static void main(String[] args){
Circle obj = new Circle(12);
Area(12);
circumference(12);
}

}