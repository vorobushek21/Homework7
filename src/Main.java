public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int monthCash = 15_000;
        int cash = 0;
        int month = 0;
        while (cash <= 2_459_000) {
            cash = cash + monthCash;
            month++;
        }
        System.out.println("Накопления в "+month+" месяце составляют - "+cash);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for(i=10;i!=0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int deathPerThousand = 8;
        int birthPerThousand = 17;
        int year = 1;
        while (year<=10){
            int yearRatio = population/1000;
            int deathPerYear = deathPerThousand*yearRatio;
            int birthPerYear = birthPerThousand*yearRatio;
            population = (population+birthPerYear)-deathPerYear;
            System.out.println("Год - "+year+", численность населения составляет - "+population);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int percent = 7;
        float money = 15_000f;
        int month = 0;
        while (money<12_000_000){
            float moneyPerMonth = (money/100)*percent;
            money = money+moneyPerMonth;
            month++;
        }
        System.out.println("Месяц - "+month+", накопленная сумма - "+money);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int percent = 7;
        float money = 15_000f;
        int month = 0;
        while (money<12_000_000){
            float moneyPerMonth = (money/100)*percent;
            money = money+moneyPerMonth;
            month++;
            if (month%6 == 0){
                System.out.println("Месяц - "+month+", накопленная сумма - "+money);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int percent = 7;
        float money = 15_000f;
        int month = 0;
        int year = 9;
        int period = year * 12;
        while (month<=period){
            float moneyPerMonth = (money/100)*percent;
            money = money+moneyPerMonth;
            month++;
            if (month%6 == 0){
                System.out.println("Прошло полгода, "+month+" месяцев, накопленная сумма - "+money);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int percent = 7;
        float money = 15_000f;
        int month = 0;
        int year = 9;
        int period = year * 12;
        while (month<=period){
            float moneyPerMonth = (money/100)*percent;
            money = money+moneyPerMonth;
            month++;
            if (month%6 == 0){
                System.out.println("Прошло полгода, "+month+" месяцев, накопленная сумма - "+money);
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 1822;
        for (;year<=2122; year++){
            if (year%79==0){
                System.out.println(year);
            }
        }
    }
}