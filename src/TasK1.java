import java.util.Scanner;

public class TasK1 {
    public static void main(String[] args) {
        float userInput = getInputFromUser();
        System.out.println("Вы ввели: " + userInput);
    }
    public static float getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean inputValid = false;

        while (!inputValid) {
            System.out.print("Введите дробное число (типа float): ");

            if (scanner.hasNext()) {
                try {
                    result = Float.parseFloat(scanner.next());
                    inputValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка! Введите корректное дробное число.");
                }
            }
        }

        return result;
    }
}
