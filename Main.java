import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Question1
        //User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();

        //init Cicle object
        Circle circle = new Circle(radius);

        //call getArea function and println
        double area = circle.getArea();
        System.out.println("The area of the circle of radius " + radius + " is " + area+"\n");

        //Question2
        String firstStr, secondStr, thirdStr;
        System.out.print("Enter three numbers: ");

        firstStr = input.next();
        secondStr = input.next();
        thirdStr = input.next();
        //String[] split = numString.split(" ");
       
        float first = Float.parseFloat(firstStr);
        float second = Float.parseFloat(secondStr);
        float third = Float.parseFloat(thirdStr);

        float averageVar = (first+second+third)/3;

        System.out.println("The average of " +first+" "+second+" "+third+" is "+averageVar+"\n");
    
        
        System.out.print("Enter three numbers: ");
        float num = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        Average average = new Average(num, num2, num3);
        float av = average.getAverage();
        System.out.println("The average of " +num+" "+num2+" "+num3+" is "+av+"\n");

        //Question3
        long hours,minutes,seconds;
        
        Time time = new Time();

        seconds = time.getcurrentSeconds();
        minutes = time.getcurrentMinutes();
        hours = time.getCurrentHour();

        System.out.println("Current time is  "+hours+":"+minutes+":"+seconds+" GMT \n");

        //Question4
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        Zodiac zodiac = new Zodiac(year);

        System.out.println(zodiac.getZodiac(year));

        input.close();
    
    }
}
