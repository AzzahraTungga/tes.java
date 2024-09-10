package persewaan;

import java.util.Scanner;

public class Driverc {
    public static void main(String[] args) {
        String choice;
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner s = new Scanner(System.in);
        System.out.print("CD/DVD: ");
        choice = s.nextLine();

        if (choice.equalsIgnoreCase("CD")){
            cd.print();
        }else if (choice.equalsIgnoreCase("DVD")){        
            dvd.DVDprint();
        }
        s.close();
    }
}
