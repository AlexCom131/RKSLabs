package org.example;
import java.util.*;

public class Lab1 {
    private double x;
    private double y;
    private double z;

    public Lab1() {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double calculateA(double x, double y) {
        return (2*Math.cos(x-Math.PI/6))/(Math.pow(Math.sin(y),2));
    }

    public double calculateB(double x, double z) {
        return 1+((Math.pow(x,2))/3+Math.pow(z,2)/5);
    }

    public void printVariable(double x, double y, double z){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("Результат a = "+calculateA(x,y));
        System.out.println("Результат b = "+calculateB(x,z)+"\n");
    }


    public void scannVariable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть першу змінну = ");
        double xScan = scanner.nextDouble();
        System.out.println("Введіть другу змінну = ");
        double yScan = scanner.nextDouble();
        System.out.println("Введіть третю змінну = ");
        double zScan = scanner.nextDouble();

        printVariable(xScan,yScan,zScan);
    }

    public void printDate(){
        Date d = new Date();
        System.out.printf("Дата = %1$te-%1$tm-%1$ty\n", d);
    }

    public static void main(String[] args) {
        Lab1 cal = new Lab1();
        cal.printVariable(1.426,-1.220,3.5);
        cal.scannVariable();
        cal.printDate();
    }
}