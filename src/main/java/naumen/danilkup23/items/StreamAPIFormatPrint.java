package naumen.danilkup23.items;

import naumen.danilkup23.entities.Employee;
import naumen.danilkup23.utils.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIFormatPrint extends Item {
    public StreamAPIFormatPrint() {
        title = "Задание №3. Форматный вывод полей класса, используя StreamAPI";
    }

    @Override
    public void execute() {
        List<Employee> employeeList = new ArrayList<>();
        ListUtil.setRandomValues(employeeList);

        System.out.println("Список сотрудников в формате \"Полное имя - отдел\"");
        employeeList.stream()
                .forEach(val -> System.out.println(val.getFullName() + ' ' + val.getDepartment()));
    }
}
