

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
    private static void task1() {
    for(int i =1 ; i<=10;i++)
        {System.out.println("Итерация! "+i);}
    }
    private static void task2() {
        int start = 10;
        while (start > 0) {
            System.out.println (start--);}

        }
        private static void task3() {
        for(int i =0 ; i<=10;i+=2)
        {System.out.println("Итерация! "+i);}}


        private static void task4() {
            for(int i =-10 ; i<=10;i++)
            {System.out.println("Итерация "+i);}
}
        private static void task5() {
            for(int i =1904 ; i<=2096;i=i+4)
            {System.out.println("Cледующий високосный год это "+i);}

    }
      private static void task6() {
    for(int i =0 ; i<=98;i=i+7)
    {System.out.println("Cледущее число это "+i);}}

    private static void task7() {
        for(int i =1 ; i<=256;i=i*2)
        {System.out.println("Cледущее число это "+i);}}
    private static void task8() {
       int salary=29000;
       int total=0;
        for(int i=1; i<=12; i++){
            total=total+salary;
            total=total+total/100;
                    System.out.println("Итого за год "+ total);}




    }



    }