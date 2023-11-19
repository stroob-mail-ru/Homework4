public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Задача 2");

        int airTemperature = 5;
        System.out.print("На улице " + airTemperature + " градусов. ");
        if (airTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println();
        System.out.println("Задача 3");

        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println();
        System.out.println("Задача 4");

        int personAge = 24;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу");
        } else {
            System.out.println("Некорректно введен возраст");
        }

        System.out.println();
        System.out.println("Задача 5");

        int childAge = 50;
        System.out.print("Если возраст ребенка равен " + childAge + ", ");
        if (childAge < 5) {
            System.out.println("то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge <14) {
            System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("то он может кататься без сопровождения взрослого");
        }

        System.out.println();
        System.out.println("Задача 6");

        int passengers = 60;

        int totalPlaces = 102;
        int seatingPlaces = 60;
        int standingPlaces = totalPlaces - seatingPlaces;
        if (passengers < seatingPlaces) {
            System.out.println("Места есть. Осталось " + (seatingPlaces - passengers) + " сидячих и " + standingPlaces + " стоячих мест");
        } else if (passengers >= seatingPlaces && passengers < totalPlaces) {
            System.out.println("Места есть. Осталось 0 сидячих и " + (totalPlaces - passengers) + " стоячих мест");
        } else {
            System.out.println("Мест нет");
        }

        System.out.println();
        System.out.println("Задача 7");

        int one = 3;
        int two = 7;
        int three = 11;

        boolean twoMoreOne = two > one;
        System.out.print("Самое большое число: ");
        if (twoMoreOne) {
            if (three > two) {
                System.out.println(three);
            } else {
                System.out.println(two);
            }
        } else {
            if (three > one) {
                System.out.println(three);
            } else {
                System.out.println(one);
            }
        }
    }
}