import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String string = terminal.nextLine();
        if (string == "Да прибудет с тобой сила")
            System.out.println("Одобряю");
        else
            System.out.println("Не одобряю");
        }
    }
