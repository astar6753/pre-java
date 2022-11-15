package mission8_221110.mission2.controller;

import mission8_221110.mission2.view.MainView;

import java.util.Scanner;

public class MenuController {
    private final MainView mainView = MainView.getInstance();

    public void callMainMenu(Scanner sc) {
        mainView.printMainMenu();
        String input = sc.nextLine();
        while (true) {
            if (input.equals("1")) callStudentMenu(sc);
            if (input.equals("2")) callStudentMenu(sc);
            if (input.equals("3")) callStudentMenu(sc);
            if (input.equals("4")) callStudentMenu(sc);
            if(input.equalsIgnoreCase("q")) {
                mainView.printErrorInvalidInput();
                input = sc.nextLine();
            }
        }
    }

    public void callStudentMenu(Scanner sc) {
        mainView.printStudentMenu();
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("q")) callMainMenu(sc);
        mainView.printErrorInvalidInput();
    }
}


