package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Actuator", "Shnyr", "actuator3000@yandex.ru","+7911","$5010",12);
        employees[1] = new Employee("Terminator", "Shnyr", "actuator3020@yandex.ru","+7912","$6000",21);
        employees[2] = new Employee("Arnold", "Shnyr", "actuator3040@yandex.ru","+7913","$5001",46);
        employees[3] = new Employee("Mario", "Shnyr", "actuator3001@yandex.ru","+7914","$5006",122);
        employees[4] = new Employee("Luigi", "Shnyr", "actuator3500@yandex.ru","+7915","$5900",156);

        Park park = new Park();
        System.out.println(park.attractions);
    }
}
