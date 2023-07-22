public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        byte clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        short year = 2000;
        if((year % 4 ==0 && year % 100 != 0) || year % 400 ==0){
            System.out.println(year+" год является високосным");
        } else{
            System.out.println(year+" год не является високосным");
        }
    }

    public static void task4() {
        short deliveryDistance = 95;
        int day=1;
        if(deliveryDistance <= 20){
            System.out.println("Доставка занимает "+day+" день");
        } else if (deliveryDistance <= 60){
            day=day+1;
            System.out.println("Доставка занимает "+day+" дня");
        } else if (deliveryDistance <= 100){
            day=day+2;
            System.out.println("Доставка занимает "+day+" дня");
        }else {
            System.out.println("нет доставки");
        }
    }

    public static void task5() {
        byte monthNumber  = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
