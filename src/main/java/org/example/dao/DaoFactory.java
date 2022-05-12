package com.megabites.data;

public class DaoFactory {
    private static SandwichDao sandwichDao;
    private static OrderDao orderDao;
    private static CustomerDao customerDao;
    private static EmployeeDao employeeDao;
    private static ManagerDao managerDao;


    private DaoFactory(){}

    public static SandwichDao sandwichDao(){
        if(sandwichDao == null){
            sandwichDao = new SandwichDaoImpl();
        }

        return sandwichDao;
    }

    public static OrderDao orderDao(){
        if(orderDao == null){
            orderDao = new OrderDaoImpl();
        }

        return orderDao;
    }

    public static CustomerDao customerDao(){
        if(customerDao == null){
            customerDao = new CustomerDaoImpl();
        }

        return customerDao;
    }

    public static EmployeeDao userDao(){
        if(employeeDao == null){
            employeeDao = new EmployeeDaoImpl();
        }

        return employeeDao;
    }

    public static ManagerDao managerDao(){
        if(managerDao == null){
            managerDao = new ManagerDaoImpl();
        }

        return managerDao;
    }
}