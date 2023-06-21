package org.ascending.training;

import org.ascending.training.model.Department;
import org.ascending.training.repository.DepartmentJDBCDaoImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        DepartmentJDBCDaoImpl departmentDao = new DepartmentJDBCDaoImpl();
        List<Department> departments = departmentDao.getDepartments();
        System.out.format("List department %s", departments.size());
    }
}
