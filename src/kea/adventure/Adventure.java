package kea.adventure;

import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to this text based Adventure.");
        roomDescription();
        String menuOption = "Z";
        while (!menuOption.equals("X") && !menuOption.equals("EXIT")) {
            System.out.print("What do you want to do? ");
            menuOption = input.nextLine().toUpperCase();
            switch (menuOption) {
                case "GO NORTH", "NORTH", "N" -> goNorth();
                case "GO EAST", "EAST", "E" -> goEast();
                case "GO SOUTH", "SOUTH", "S" -> goSouth();
                case "GO WEST", "WEST", "W" -> goWest();
                case "LOOK", "L" -> roomDescription();
                case "HELP", "H" -> getHelp();
                case "EXIT", "X" -> endMessage();
                default -> unknownCommand(menuOption);
            }
        }
    }

    private static void getHelp() {
        System.out.println("\nYou can use these commands:");
        System.out.println("H - Help (this)");
        System.out.println("L - Look around (room description)");
        System.out.println("X - Exit");
        System.out.println("N - Go North");
        System.out.println("E - Go East");
        System.out.println("S - Go South");
        System.out.println("W - Go West");
    }

    private static void endMessage() {
        System.out.println("Hope to see you again");
    }

    private static void unknownCommand(String menuOption) {
        System.out.println("I do not understand \"" + menuOption + "\"");
    }

    private static void roomDescription() {
        System.out.println("You are in a room");
    }

    private static void goNorth() {
        System.out.println("Going North");
    }

    private static void goEast() {
        System.out.println("Going East");
    }

    private static void goSouth() {
        System.out.println("Going South");
    }

    private static void goWest() {
        System.out.println("Going West");
    }
}
