import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        try {
            String userInput = getInputFromUser();
            System.out.println("Вы ввели: " + userInput);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: Пустые строки вводить нельзя!");
        }
    }
    public static String getInputFromUser() throws EmptyInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите что-то: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new EmptyInputException();
        }

        return input;
    }
    static class EmptyInputException extends Exception {
        public EmptyInputException() {
            super("Пустые строки вводить нельзя!");
        }
    }
}
