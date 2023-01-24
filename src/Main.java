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
            System.out.println("задача 1");
            int sum = 0;
            int i = 1;
            while (sum < 2459000) {
                sum += 15000 + sum * 0.01;
                System.out.println("Месяц " + i + ", сумма накоплений равна - " + sum + "рублей");
                i++;
            }
            System.out.println("за " + (i = i - 1) + " месяцев сумма накоплений составит " + sum + " рублей");


            System.out.println(" ");
        }


        public static void task2() {
            System.out.println("задача 2");
            int i = 1;
            while (i <11) {
                System.out.print(i);
                i ++;
                System.out.print(" ");}
            System.out.println(" ");
            i--;
            for (;i>1;i--)
                System.out.print(i + " ");
            System.out.println(i + " ");
            System.out.println(" ");}

        public static void task3() {
            System.out.println("Задача 3");
            int populationCountryY = 12_000_000;
            for (int i = 1; i < 11; i++) {
                int fertility = (populationCountryY / 1000) * 17;
                int mortality = (populationCountryY / 1000) * 8;
                populationCountryY = populationCountryY + (fertility - mortality);
                System.out.println("Год " + i + " , численность населения составляет " + populationCountryY);}
            System.out.println(" ");
        }

    public static void task4() {
                System.out.println("задача 4");
                double income = 15000;
                int i = 0;
                while (income < 12_000_000){
                    i++;
                    income = income + income  * 0.07;
        System.out.println("месяц " + i + " накопление составит " + income);}
        System.out.println(" ");

            }
    public static void task5() {
        System.out.println("задача 5");
        double income = 15000;
        int i = 0;
        while (income < 12_000_000) {
            i++;
            income = income + income * 0.07;
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " накопление составит " + income);}
        }
        System.out.println(" ");
    }
    /*Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать,
    какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
    Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
    Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.*/
    public static void task6() {
        System.out.println("задача 6");
        double income = 15000;
        int i = 1;
        while (i < 109) {
            i++;
            income = income + income * 0.07;
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " накопление составит " + income);}
        }
        System.out.println(" ");
    }
    public static void task7() {
        System.out.println("задача 7");
    int friday = 3;
    while (friday <= 31){
                System.out.println("Сегодня Пятница " + friday + " число.Необходимо сдать отчет.");
        friday +=7;}
        System.out.println(" ");}

    public static void task8() {
        System.out.println("задача 8");
        int year = 2023;
        int back = year - 200;
        int ahead = year + 100;
        for (int i = back; i < ahead; i++) {
            if (i % 79 == 0) {
                System.out.println(i);}}

    }

}