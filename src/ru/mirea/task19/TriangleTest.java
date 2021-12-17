package ru.mirea.task19;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle tri;
        try{
            tri = new Triangle(90, 45,45);
        }catch (Exception e){
            System.out.println("Здесь не будет ошибки: " + e.getMessage());
        }
        try{
            tri = new Triangle(80, 55,45);
        }catch (Exception e){
            System.out.println("Пример ошибки 1: " + e.getMessage());
        }
        try{
            tri = new Triangle(90, 90, 90);
        }catch (Exception e){
            System.out.println("Пример ошибки 2: " + e.getMessage());
        }
    }
}

class Triangle{
    double angles[] = new double[3];
    Triangle(double a1, double a2, double a3) throws Exception{
        if (a1+a2+a3!=180) throw new Exception("Сумма углов не равна 180");
        if (!(a1==90 || a2==90 || a3==90)) throw new Exception("Нет прямого угла");
        angles[0]=a1;
        angles[1]=a2;
        angles[2]=a3;
    }


}
