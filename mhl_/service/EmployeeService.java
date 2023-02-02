package com.mhl_.service;


import com.mhl_.dao.EmployeeDao;
import com.mhl_.domain.Employee;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class EmployeeService{
    //定义employeeDao
    private EmployeeDao employeeDao = new EmployeeDao();


    //根据empId和pwd返回一个EmployeeDao对象
    //如过查询不到就返回null
    public Employee getEmployeeDaoByIdAndPwd(String empId, String pwd){
        return employeeDao.querySingle("select * from employee where empId = ? and pwd=md5(?)", Employee.class,empId,pwd);
    }
}
