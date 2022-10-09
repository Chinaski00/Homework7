public class Main {
    public static void main(String[] args) {

        //Задача 1
        int salary = 15000;
        int dollars = 0;
        int mounth = 0;
        while (dollars < 2459000) {
            dollars = dollars + dollars / 100;
            dollars = dollars + salary;
            mounth++;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + dollars + " рублей.");

            //Задача 2
            int numbers = 0;
            while (numbers < 10) {
                numbers++;
                System.out.print(numbers + " ");
            }
            System.out.println("");
            for (int numbers2 = 10; numbers2 > 0; numbers2--) {
                System.out.print(numbers2 + " ");
            }

            //Задача 3
            int allChilldren = 12000000;
            int dead = 8;
            int chelovek = 204000; //человек рождается за год
            for (int year = 2000; year < 2011; year++) {
                chelovek = chelovek + 204000;
                allChilldren = allChilldren + (chelovek - dead);
                System.out.println("Год " + year + ", численность населения составляет " + allChilldren);
            }

            //Задача 4
            int mec = 0;
            double percent = 0.07;
            for (double money = 15000; money < 12_000_000; mec++) {
                money = money * (1 + percent);
                System.out.println("Месяц " + mec + " накоплений " + money);
            }
            //Задача 4
            int mec2 = 0;
            double percent2 = 0.07;
            for (double money2 = 15000; money2 < 12_000_000; ) {
                mec2++;
                money2 = money2 * (1 + percent2);
                if (mec2 % 6 == 0) {
                    System.out.println("Месяц " + mec2 + " накоплений " + money2);
                }
            }

            //Задача 5
            System.out.println(" ");
            System.out.println("Задача 5");
            double percent3 = 0.07;
            double money3 = 15000;
            for (int i = 1; i < 56; i++) {
                money3 = money3 * (1 + percent3);
                if (i % 6 == 0) {
                    System.out.println(money3 + " сумма накоплений за каждые пол года в течении 9ти лет");
                }
            }

            //Задача 6
            System.out.println(" ");
            System.out.println("Задача 6");
            int number = 5;
            for (int mecyac = 1; mecyac < 31; mecyac++) {
                if (mecyac % 7 == 0) {
                    System.out.println("Сегодня пятница, " + (mecyac - 2) + "-е число. Пора готовить отчёт.");
                }
            }

            //Задача 7
            int perviGod = 1822;
            int posledniyGod = 2122;
            for (; perviGod < posledniyGod; perviGod++) {
                if (perviGod % 79 == 0) {
                    System.out.println(perviGod);
                }

                //Задача 8
                int a = 2;
                int plus = 0;
                for (int b = 1; b <= 10; b++) {
                    plus = a * b;
                    System.out.println("2 * " + b + " = " + plus + " ");
                }
            }
        }
    }
}
