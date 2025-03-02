package Toko;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("CD/DVD");
        String pilihan = in.nextLine();

        System.out.println("Name : ");
        String name = in.nextLine();
        System.out.println("Number : ");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        in.nextLine(); 

        if (pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total song : ");
            int numSong = in.nextInt();
            CD c1 = new CD(number, name, quantity, price, artist, numSong, label);
            c1.print();

        }else if(pilihan.equalsIgnoreCase("DVD")){

            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            System.out.println("Lenght : ");
            int lenght = in.nextInt();
            DVD c2 = new DVD(number, name, quantity, price, rating, lenght, studio);
            c2.print();

        }
        in.close();
    }
    
}
