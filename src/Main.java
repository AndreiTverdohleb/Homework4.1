public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();



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
                System.out.println("Год " + i + " , численность населения составляет " + populationCountryY);
            }
        }

    public static void task4() {
                System.out.println("задача 4");
                double income = 15000;
                int i = 1;
                while (income < 12_000_000){
                    i++;
                    income = income + (income / 100 * 7);
        System.out.println("месяц " + i + " накопления " + income);}

            }
    public static void task5() {
        System.out.println("задача 5");
    }
}