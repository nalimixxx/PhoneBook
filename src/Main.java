package src;

import java.io.IOException;
import java.util.*;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> phoneNumber = new HashMap<Integer, String>();
        Scanner input = new Scanner(in);
        String userInput = "";
        String[] userIn;
        do {
            System.out.print("Введите номер телефона и фамилию через пробел или end для выхода: ");
            userInput = input.nextLine();
            if (!Objects.equals(userInput, "end")) {
                userIn = userInput.split(" ");
                phoneNumber.put(Integer.parseInt(userIn[0]), userIn[1]);
            }
        }
        while (!Objects.equals(userInput, "end"));

        System.out.println(phoneNumber);

        in.close();
    }
}

