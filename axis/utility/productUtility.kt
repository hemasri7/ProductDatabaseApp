package com.axis.utility

import com.axis.modal.Employee

class EmployeeUtil {
    var employee=mutableListOf<Employee>()
    init{
        employee.add(Employee(1,"Swarna",30000,"HR"))
        employee.add(Employee(2,"Suha",40000,"Manager"))
        employee.add(Employee(3,"Manju",30000,"Admin"))
    }
    fun data():MutableList<Employee>{
        return employee
    }


}