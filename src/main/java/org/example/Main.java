package org.example;

import java.util.Scanner;

import static org.example.Info.*;
public class Main {
    static char til = 'u';
    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    Tilni tanlang, Choose language
                    1.English
                    2.Uzbek
                    """);
            int choose_lange = (new Scanner(System.in)).nextInt();
            if(choose_lange == 1){
                til = 'e';
            } else if (choose_lange == 2) {
                til = 'u';
            } else {
                System.out.println("Error");
            }
            System.out.println(til == 'e' ? INFO_ENG : INFO_UZB);
            Scanner scanner = new Scanner(System.in);
            System.out.println(til == 'e' ? ENTER_ENG : ENTER_UZB);
            int Kirish = scanner.nextInt();
            if (Kirish == 1) {
                System.out.println(til == 'e' ? ENTER_PHONONUMBER : ENTER_PHONONUMBER2);
                String Phone_number = scanner.next();
                if(Phone_number.startsWith("+998") && Phone_number.length() == 13){
                    System.out.println(til == 'e' ? YAXshi : YAXshi2);
                }else{
                    System.out.println("Error");
                    continue;
                }
            } else if (Kirish == 2) {
                System.out.println(til == 'e' ? GOOGLE2 : GOOGLE3);
                String Google_ak = scanner.next();
                char g = Google_ak.charAt(0);
                if(g == '@' && Google_ak.length() > 8){
                    System.out.println(til == 'e' ? ZOR1: ZOR2);
                    System.out.println("Enter your name");
                    String user_name = scanner.next();
                    if(user_name.length() > 8){
                        System.out.println("Great next step");
                    }
                }else{
                    System.out.println("Error");
                    continue;
                }
            } else {
                System.out.println("Siz boshqa raqam bostingiz");
            }
            System.out.println("Parol kiriting uzunligi 8 dan kotta bo'sin");
            int User_enter_password = scanner.nextInt();
            if(User_enter_password >= 9999999){
                boolean exit = true;
                while (exit){
                    menu();
                    int User_number = scanner.nextInt();
                    switch (User_number){
                        case 1:
                            MashinaOlish();
                            break;
                        case 2:
                            MashinaSotish();
                            break;
                        case 3:
                            exit = false;
                            System.out.println("Hayir");
                            break;
                        default:
                    }

                }
            }else{
                System.out.println("Siz uzunligi 8 dan kichik bo'gan parol yozdingiz dasturdan chiqip ketingiz");
            }


        }
    }

    static void MashinaSotish() {

    }
    static void MashinaOlish () {
        boolean exit = true;
        while (exit){
            System.out.println(INFORMATION_BUY_CAR);
            int number = (new Scanner(System.in)).nextInt();
            switch (number) {
                case 1:
                    SportCar();
                    break;
                case 2:
                    exit = false;
                    break;
                default:
            }
        }
    }
    static void menu () {
        System.out.println(til == 'e' ? MENU_ENG : MENU_UZB);
    }

    static void SportCar (){
        boolean exit = true;
        while (exit){
            System.out.println(til == 'e' ? SPORT_CAR_EN : SPORT_CAR);
            int number = (new Scanner(System.in)).nextInt();
            switch (number) {
                case 1:
                    System.out.println("$12567");
                    break;
                case 2:
                    exit = false;
                    break;
                default:
            }
        }
    }
}
