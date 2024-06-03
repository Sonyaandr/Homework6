public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for(int i = 1; i<=10; i = i+1){
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for(int i = 10; i>0; i = i-1){
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for(int i = 0; i<=17; i ++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Задание 4");
        for(int i=10; i>=-10; i--){
            System.out.println(i);
        }
        System.out.println("Задание 5");
        for ( int year = 1904; year<=2096; year = year+4){
           System.out.println(year + " год является високосным");
            }
        System.out.println("Задание 6");
        for (int i=1; i<=14; i++){
            int k=i*7;
            System.out.print(k+" ");
        }
        System.out.println(" ");
        System.out.println("Задание 7");
        for (int i=1; i<=512; i=i*2){
            System.out.print(i+" ");
        }
        System.out.println("Задание 8");
        for(int month=1;month<=12;month++){
            int money=29000*month;
            System.out.println("Месяц "+ month +", сумма накоплений равна " + money +" рублей");
        }
        System.out.println("Задание 9");
        for(int month=1;month<=12;month++){
            double money=29000*month*1.01;
            System.out.println("Месяц "+ month +", сумма накоплений равна " + money +" рублей");
        }
        System.out.println("Задание 10");
        for (int i=1; i<=10; i++){
            int k = i*2;
            System.out.print(k+" ");
        }
    }
}