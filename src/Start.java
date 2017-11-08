import java.math.BigDecimal;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myLaptopRam = 5;
        int myPcRam = 16 + myLaptopRam;
         myLaptopRam = 8 + myPcRam;

        System.out.println("moja jeszcze na zmiana / oskar");

        System.out.println("adsada");


        System.out.println("oskar");
        System.out.println("Moja zmiana 3");
        System.out.println("cos");

        System.out.println("lukasz");

        System.out.println("1");

        System.out.println(myLaptopRam + myPcRam);
        System.out.println(myPcRam % myLaptopRam);

        myLaptopRam = myLaptopRam + 8;
        System.out.println(myLaptopRam);

        myPcRam = myPcRam - myLaptopRam;

        //Skrócony zapis:

        myPcRam -= myLaptopRam;
        System.out.println(myPcRam);

        //inkrementacja:

        int counter = 0;
        counter = counter + 1;
        counter += 1;
        counter++;

        int someSum = (5 + 5) * 5;
        System.out.println(someSum);

        int mySalary = 2500;
        int dayOfWeek = 5;
        if (mySalary > 2500 && dayOfWeek!=5) {
            System.out.println("X");
        }else if(mySalary > 500 && mySalary < 1000) {

        }else{
            System.out.println("Z");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("Jesteś osobą pełnoletnią.");
            } else {
                System.out.println("Nie jesteś osobą pełnoletnią.");
            }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię");
        String name = scanner.nextLine();
        System.out.println("Wpisz wiek");
        int ageNew = scanner.nextInt();
        System.out.println(name+ageNew);



        }
    }
