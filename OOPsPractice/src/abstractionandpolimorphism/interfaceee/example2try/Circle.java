package abstractionandpolimorphism.interfaceee.example2try;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    Circle (int radius){
        this.radius = radius;
    }

     public double calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        return Math.PI * Math.pow(radius,2);
    }
}