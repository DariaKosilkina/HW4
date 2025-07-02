public class Main {
    public static void main(String[] args) {
        //task1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
//task2
        int temperature = 0;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
//task3
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
//task4
        int ageAge = 5;
        if (ageAge >= 2 && ageAge <= 6) {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему нужно ходить в детский сад.");
        }
        if (ageAge >= 7 && ageAge <= 17) {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему нужно ходить в школу.");
        }
        if (ageAge >= 18 && ageAge <= 24) {
            System.out.println("Если возраст человека равен " + ageAge + ", то его место в университете");
        }
        if (ageAge > 24) {
            System.out.println("Если возраст человека равен " + ageAge + ", то ему пора ходить на работу.");
        }
//task5
        int age1 = 15;
        if (age1 < 5) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age1 > 5 && age1 < 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age1 > 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
//task6
        int seats = 70;
        if (seats < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (seats >= 60 && seats <= 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне нет мест");
        }
//task7
        int one = 1;
        int two = 8;
        int three = 4;
        if (one > two && one > three) {
            System.out.println("Наибольшее число - " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число - " + two);
        } else {
            System.out.println("Наибольшее число - " + three);
        }
    }
   }
