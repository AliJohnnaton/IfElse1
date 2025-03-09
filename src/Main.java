public class Main {
    public static void firstTask() {
        int age = 16;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18)
            System.out.print("он совершеннолетний");
        else
            System.out.print("он не достиг совершеннолетия, нужно немного подождать");
    }

    public static void secondTask() {
        int temp = 5;
        System.out.print("На улице " + temp + " градусов, ");
        if (temp < 5)
            System.out.print("нужно надеть шапку");
        else
            System.out.print("можно идти без шапки");
    }

    public static void thirdTask() {
        int speed = 65;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed < 60)
            System.out.print("можно ездить спокойно");
        else if (speed >= 60 && speed < 80)
            System.out.print("скорость конечно превышена, но штрафа не ожидаеться");
        else
            System.out.print("придётся заплатить штраф");
    }

    public static void fourthTask() {
        int age = 25;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (age >= 2 && age <= 6)
            System.out.print("в детский сад");
        else if (age >= 7 && age <= 17)
            System.out.print("в шкьёлу");
        else if (age >= 18 && age < 24)
            System.out.print("в универ");
        else if (age >= 24)
            System.out.print("на работу");
    }

    public static void fifthTask() {
        int age = 7;
        System.out.print("Если возраст ребёнка равен " + age + ", то ему ");
        if (age < 5)
            System.out.print("нельзя кататься на аттракционе");
        else if (age >= 5 && age < 14)
            System.out.print("можно кататься на аттракционе в сопровождении взрослого");
        else
            System.out.print("можно кататься на аттракционе без сопровождения взрослого");
    }

    public static void sixthTask() {
        int people = 7;
        int fullCapacity = 102;
        int sitCapacity = 60;
        int stayCapacity = fullCapacity - sitCapacity;
        if (people < fullCapacity && people > 0) {
            if (people < sitCapacity)
                System.out.print("В вагоне " + (sitCapacity - people) + " сидячих мест, и " + stayCapacity + " стоячих мест");
            else
                System.out.print("В вагоне " + (fullCapacity - people) + " стоячих мест");
        } else {
            if (people >= fullCapacity)
                System.out.print("В вагоне нет свободных мест");
            else if (people == 0)
                System.out.print("Вагон пуст садись куда хочешь");
            else
                System.out.print("Ошибка");
        }
    }

    public static void seventhTask() {
        int one = 2;
        int two = 3;
        int three = 1;
        System.out.println("Большее среди: " + one + ", " + two + ", " + three);
        if (one >= two && one >= three)
            System.out.println(one);
        else if (two > one && two >= three)
            System.out.println(two);
        else
            System.out.println(three);
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        firstTask();
        System.out.println("\nЗадание 2");
        secondTask();
        System.out.println("\nЗадание 3");
        thirdTask();
        System.out.println("\nЗадание 4");
        fourthTask();
        System.out.println("\nЗадание 5");
        fifthTask();
        System.out.println("\nЗадание 6");
        sixthTask();
        System.out.println("\nЗадание 7");
        seventhTask();

    }
}