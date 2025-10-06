package naumen.danilkup23.utils;

import naumen.danilkup23.entities.Employee;

import java.util.List;
import java.util.Random;

public class ListUtil {
    public static int getRandomInteger(int randMin, int randMax) {
        return (new Random()).nextInt(randMax - randMin + 1) + randMin;
    }

    public static double getRandomDouble(double randMin, double randMax) {
        return (new Random()).nextDouble(randMax - randMin + 1) + randMin;
    }

    public static void setRandomValues(List<Employee> employeeList) {
        String[] fullNames = {"Витальев А.О.", "Максимов Г.Н.", "Викторов Н.П.", "Купцов Д.О.", "Стародубов Н.С."};
        String[] departments = {"Разработка ПО", "Тестирование", "Администрирование", "DevOps-отдел", "Проектирование ПО"};
        var length = getRandomInteger(5, 10);

        for (int i = 0; i < length; i++) {
            Employee employee = new Employee(
                    fullNames[getRandomInteger(0, 4)],
                    getRandomInteger(18, 65),
                    departments[getRandomInteger(0, 4)],
                    getRandomDouble(60000.0, 350000.0)
            );
            employeeList.add(employee);
        }
    }
}
