package liskovsubstitutionprinciple.bad;

import java.util.Scanner;

public class ClientApp {

    public static void getAreaRectangle(Rectangle rectangle){
        int width=rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expected Area of "+(width*10) + ", But we got "+rectangle.getArea());
        return;
    }


//    public static void getAreaSquare(Rectangle rectangle){
//        int width=rectangle.getWidth();
//        System.out.println("Expected Area of "+(width*10) + ", But we got "+rectangle.getArea());
//        return;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width and height respectively");
        int width=scanner.nextInt();
        int height=scanner.nextInt();
        Rectangle rectangle= new Rectangle(width,height);
        ClientApp.getAreaRectangle(rectangle);

        Rectangle square = new Square();
        square.setWidth(5);
        System.out.println("Expected Area of square is = " +square.getArea());
        ClientApp.getAreaRectangle(square);


    }

}
