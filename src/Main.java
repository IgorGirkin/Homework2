public class Main {
    public static void main(String[] args) {
        System.out.println("Задание6"); //
    var bokser1 = 78.2;
    var bokser2 = 82.7;
    var totalWeightBoxer= bokser1+bokser2;
    System.out.println("Общий вес боксеров "+totalWeightBoxer +" кг.");
    var weightDifference = bokser2-bokser1;
    System.out.println("Разница в весе " + weightDifference + " кг.");

    System.out.println("Задание7"); //
        var weightDifference1 = bokser2-bokser1;
    System.out.println("Разница в весе " + weightDifference1 + " кг.");
        var weightDifference2 = bokser2%bokser1; //функция остаток от деления
        System.out.println("Разница в весе "+ weightDifference2 +" кг.");

     System.out.println("Задание8-1");
     var totalWorkingTime = 640;
     var workingTime = 8;
     var totalEmployees = totalWorkingTime/workingTime;
     System.out.println("Всего работников в компании – " + totalEmployees + " человек.");

     System.out.println("Задание8-2");
     totalEmployees+=94;
     workingTime = workingTime*totalEmployees;
     System.out.println("Если в компании работает " + totalEmployees +
             " человек, то всего "+ workingTime + " часов работы может " +
             "быть поделено между сотрудниками.");

    }
}