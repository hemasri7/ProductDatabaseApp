package com.axis.App
import com.axis.modal.Employee
import com.axis.services.EmployeeServices

fun main(){
    var employeService=EmployeeServices()


    var employee=Employee(4,"Hema",40000,"HR")
    employeService.addData(employee)
    employeService.ViewDetails()
}
