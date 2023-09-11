package org.example;
import java.sql.SQLOutput;
import static java.lang.Math.*;
import java.io.*;
import java.util.*;

import java.time.format.DateTimeFormatter;

public class Lab1 {
    public double x;
    public double y;
    public double z;
    public Lab1(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double calculateA() {
        double a;
        return a=(2*Math.cos(x-Math.PI/6))/(Math.pow(Math.sin(y),2));
    }

    public double calculateB() {
        double b;
        return b=1+((Math.pow(x,2))/3+Math.pow(z,2)/5);
    }

    public void printVariable(double a,double b){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("Результат a = "+a);
        System.out.println("Результат b = "+b+"\n");
    }

    public void printData(){
        Date d = new Date();
        System.out.printf("Дата = %1$te-%1$tm-%1$ty\n", d);
    }

    public void motodScann(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть першу змінну = ");
        double xScan = scanner.nextDouble();
        System.out.println("Введіть другу змінну = ");
        double yScan = scanner.nextDouble();
        System.out.println("Введіть третя змінну = ");
        double zScan = scanner.nextDouble();

        double a=(2*Math.cos(xScan-Math.PI/6))/(Math.pow(Math.sin(yScan),2));
        double b=1+((Math.pow(xScan,2))/3+Math.pow(zScan,2)/5);

        System.out.println("Результат a = "+a);
        System.out.println("Результат b = "+b+"\n");

    }

    public static void main(String[] args) {

        Lab1 cal = new Lab1(1.426, -1.220, 3.5);

        System.out.println("####################################\n"+"\t\t\t\t№1\n"+"####################################\n");
        System.out.println(cal.calculateA());
        System.out.println(cal.calculateB()+"\n");

        System.out.println("####################################\n"+"\t\t\t\t№2\n"+"####################################\n");
        cal.printVariable(cal.calculateA(),cal.calculateB());

        System.out.println("####################################\n"+"\t\t\t\t№3\n"+"####################################\n");
        cal.printData();

        System.out.println("####################################\n"+"\t\t\t\t№4\n"+"####################################\n");
        cal.motodScann();
    }

}