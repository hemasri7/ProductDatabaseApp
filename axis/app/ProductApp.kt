package com.axis.app

import com.axis.modal.Product
import com.axis.service.ProductServices
import java.sql.DriverManager
import java.util.*

fun main(){
    var serviceobj=ProductServices()
    var scan=Scanner(System.`in`)
    println("Enter ProductId:")
    var productid=scan.nextInt()
    println("Enter ProductName:")
    var productname=scan.next()
    println("Enter ProductPrice:")
    var productprice=scan.nextDouble()
    println("Enter ProductQuantity:")
    var productquantity=scan.nextInt()

    var product=Product(productid,productname,productprice,productquantity)
    val dburl ="jdbc:mysql://localhost:3306/kotlindb"
    val connection= DriverManager.getConnection(dburl,"root","hema")


    serviceobj.insert()
    serviceobj.insertUserInput(product)
    serviceobj.viewAllProductDetails()
}