//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Task 1");
        for (int firstFriday = 5; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println(" Today is friday " + firstFriday);
        }
        // task 2
        System.out.println("Task 2");
        int distance = 42_195;
        do {
            System.out.println(" Держись, Осталось: " + distance + " метров");
            distance -= 500;
        } while (distance >= 0);

        System.out.println("Task 2 - second decision");
        for (int distance2 = 42_195; distance2 >= 0; distance2 -= 500 ) {
            System.out.println(" Держись, Осталось: " + distance2 + " метров");
        }
        // task 3
        System.out.println("Task 3");

        int day = 0;
        int currentDay = 1;
        int money = 700;
        while (money >= 100) {
            currentDay++;
            day++;
            if (currentDay % 5 == 0) {
                continue;
            }
            money -= 100;
            System.out.println(day);
        }

        // task 3
        System.out.println("Task 3 second decision");

        int currentDay2 = 1;
        int day2 = 0;

        for (int money2 = 700; money2 >= 100;) {
            day2++;
            currentDay2++;
            if (currentDay2 % 5 == 0) {
                continue;
            }
            money2 -= 100;
            System.out.println(day2);
        }

        // task 4
        System.out.println("Task 4");

        int total = 0;
        int month = 0;

        do {
            total += 15000;
            month++;
            if (month % 6 == 0) {
                total *= 1.07;
            }
            System.out.println("Месяц " + month + " накомпленная сумма " + total);
        }
        while (total <= 12_000_000);
        System.out.println("Вы накопили 12_000_000 за " + month + " месяца или " + month/12 + " лет");

        // task 5
        System.out.println("Task 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 &&  overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                continue;
            }
            charge += 2;
            if (overheats == 3) {
                break;
            }
            System.out.println("Время зарядки составило " + minute);
        }
    }
}