package pro.sky.skyprocalculatordemo.services;

import pro.sky.skyprocalculatordemo.model.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

}
