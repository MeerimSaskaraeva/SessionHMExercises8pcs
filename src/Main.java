import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);


        Laptop laptop1=new Laptop("Mac book","smile",1000,"It is computer","Linux");
        Laptop laptop2=new Laptop("Asus","Good",2000,"Computer","Windows");
        Announcement[]laptops={laptop1,laptop2};

        Phone phone1=new Phone("Xiaomi 8","* Xia *",700,"Phone","China",128);
        Phone phone2=new Phone("Iphone","* *** *",1000,"Phone","Apple",64);
        Announcement[]phones={phone1,phone2};

        Home home1=new Home("Family house","no",60000,"Big house","Home",10);
        Home home2=new Home("Guest house","no",80000,"Big house","House",20);
        Announcement[]homes={home1,home2};

        Airplane airplane1=new Airplane("Fly Dubai","no",500000,"Fast","red",LocalDate.of(2022,4,3));
        Airplane airplane2=new Airplane("Fly Dubai","no",500000,"Fast","red",LocalDate.of(2022,4,3));
        Announcement[]airplanes={airplane1,airplane2};

        Car car1=new Car("BMV","no",60000,"Car","black",LocalDate.of(2004,5,6));
        Car car2=new Car("BMV","no",60000,"Car","black",LocalDate.of(2004,5,6));
        Announcement[]cars={car1,car2};

        Helicopter helicopter1=new Helicopter();
        Helicopter helicopter2=new Helicopter();
        Helicopter[]helicopters={helicopter1,helicopter2};

        Announcement[] announcement=new Announcement[]{laptop1,laptop2,phone1,phone2,home1,home2,airplane1,airplane2,car1,car2};


        System.out.println("\u001B[34mPlease choose method findByPrice input-1, findByName input-2, maxPrice-3," +
                " findMaxMinPrice-4, getAllPrice-5, findLongName-6,\ngetTotalSum-7,qtyNomination-8\u001B[0m");
        int number= scanner1.nextInt();

        if (number==1){
            System.out.print("Write price: ");
            int price= scanner.nextInt();
            findByPrice(price,announcement);}
        else if (number==2) {
            System.out.print("Write Name: ");
            String name= scanner.nextLine();
            findByName(name,announcement);}
        else if (number==3) {
            System.out.print("Write price 1: ");
            double price1= scanner.nextDouble();
            findByPrice(price1,announcement);
            System.out.print("Write price 2: ");
            double price2= scanner.nextDouble();
            findByPrice(price2,announcement);
            System.out.println("\u001B[32mMax price: "
                    +Announcement.maxPrice(price1, price2));}
        else if (number==4) {
            Announcement.findMaxMinPrice(announcement);
        }
        else if (number==5) {
            Announcement.getAllPrice(announcement);
        }
        else if (number==6) {
            Announcement.findLongName(announcement);
        }
        else if (number==7) {
            System.out.println("\u001B[32m= "+Announcement.getTotalSum(announcement));
        }
        else if (number==8) {
            Announcement announ=new Announcement();
            announ.qtyNomination(announcement);
        }
    }
    public static void findByPrice(double price, Announcement[]announcements) {
        for (Announcement announcement : announcements) {
            if (announcement.getPrice()==price){
                System.out.println(announcement);
            }
        }
    }
    public static void findByName(String name, Announcement[]announcements) {
        for (Announcement announcement : announcements) {
            if (announcement.getName().equals(name)){
                System.out.println(announcement);
            }
        }
    }
}