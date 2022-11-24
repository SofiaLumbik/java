import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("День рождения: ");
        int day = scanner.nextInt();
        System.out.print("Месяц рождения: ");
        int month = scanner.nextInt();
        System.out.print("Год рождения: ");
        int year = scanner.nextInt();
        if (day < 0 || day > 31 || month < 0 || month > 12 || year < 0 || year > 2022) {
            System.out.println("error");
            return;
        }
        int curDay = 17, curMonth = 11, curYear = 2022;
        int diffYears = curYear - year;
        if (curMonth < month)
            diffYears--;
        int diffMonths = curMonth - month;
        if (diffMonths < 0)
            diffMonths += 12;
        int diffDays = curDay - day;
        if (diffDays < 0)
        {
            diffMonths--;
            if (diffMonths < 0)
            {
                diffYears--;
                diffMonths += 12;
            }
            diffDays += 31;
        }
        System.out.printf("%d лет, %d месяцев и %d дней", diffYears, diffMonths, diffDays);
        scanner.close();
    }
}