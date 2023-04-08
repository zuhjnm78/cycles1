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
        task9();
        task10();


    }

    public static void task1() {

        // Пишем код для задачи 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i= ++i ){
            System.out.println("Итерация цикла " + i);
        }

    }
    public static void task2() {

        // Пишем код для задачи 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i= i-1 ){
            System.out.println("Итерация цикла " + i);
        }

    }
    public static void task3() {

        // Пишем код для задачи 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i= i+2 ){
            System.out.println("Итерация цикла " + i);
        }

    }
    public static void task4() {

        // Пишем код для задачи 4

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i= i-1 ){
            System.out.println("Итерация цикла " + i);
        }

    }
    public static void task5() {

        // Пишем код для задачи 5

        System.out.println("Задача 5");
        for (int year = 1904; year <=2096;  year= year+4 ){
            System.out.println(year + " год является високосным.");
        }

    }
    public static void task6() {

        // Пишем код для задачи 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i= i+7 ){
            System.out.print(i+ " ");
        }
        System.out.println("\n");

    }
    public static void task7() {

        // Пишем код для задачи 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i= i*2 ){
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }
    public static void task8() {

        // Пишем код для задачи 8
        System.out.println("Задача 8");
        int saving = 29000;
        int total = 0;
        for (int i = 1; i <=12; i= ++i ){
            total= total + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total +" рублей");
        }
    }
    public static void task9() {

        // Пишем код для задачи 9
        System.out.println("Задача 9");

        int savingBank = 29000;
        double total = 0;
        for (int i = 1; i <= 12; i= ++i ){
            total = total + savingBank +(total +savingBank)*0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total +" рублей")  ;
        }

    }
    public static void task10() {

        // Пишем код для задачи 10
        System.out.println("Задача 10");

        int a = 2;

        for (int i = 1; i <= 10; i= ++i){
            int total = a*i;
            System.out.println(a+ " * " + i + " = " + total);
        }
    }

}
