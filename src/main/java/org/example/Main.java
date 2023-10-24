package org.example;

import java.util.Scanner;

import static org.example.Info.*;
public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Salom Auto_marketga xush kelibsiz Registratsaydan o'ting");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Telefon raqam uchun 1 bosing");
            System.out.println("Google akaunt uchun 2 bosing");
            int Kirish = scanner.nextInt();
            if (Kirish == 1) {
                System.out.println("Telefon raqam kiritng");
                String Phone_number = scanner.next();
                if(Phone_number.startsWith("+998") && Phone_number.length() == 13){
                    System.out.println("Great");
                }else{
                    System.out.println("Error");
                    continue;
                }
            } else if (Kirish == 2) {
                System.out.println("Google akaunt kiritng");
                String Google_ak = scanner.next();
                char g = Google_ak.charAt(0);
                if(g == '@' && Google_ak.length() > 8){
                    System.out.println("Great");
                    System.out.println("Ismingizni kiriting");
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
        System.out.println("""
                1.Mashina olish
                2.Mashina sotish
                3.Exit
                """);
    }

    static void SportCar (){
        boolean exit = true;
        while (exit){
            System.out.println(SPORT_CAR);
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
