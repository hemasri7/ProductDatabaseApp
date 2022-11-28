package com.axis.utility

import com.axis.app.dbConnection
import com.axis.modal.Product

class ProductUtility {

    var dbConnection = dbConnection()
    var connection = dbConnection.connect()
    var products=mutableListOf<Product>()

    fun insert():String{

        val stmt =connection.createStatement()
        val res = stmt.executeUpdate("insert into product1 values(104,'fridge',20000.0,2)")
        if (res > 0) {
            return "successfully inserted record into users db !!!"
        } else {
            return "Insert Not successful"
        }

    }
    fun selectAllDetails() {
        val query = connection.prepareStatement("select * from product1")
        val res = query.executeQuery()
        while (res.next()) {
            val productid = res.getInt("id")
            val productname = res.getString("name")
            val productprice = res.getDouble("price")
            val productquantity = res.getInt("quality")
            products.add(Product(productid, productname, productprice, productquantity))
        }
        for (product in products)
        {
            println(product)
        }

    }

    fun userInputInsert(product:Product){

        val prepareStmt=connection.prepareStatement("insert into product1 values(?,?,?,?)")
        prepareStmt.setInt(1,product.productid)
        prepareStmt.setString(2,product.productname)
        prepareStmt.setDouble(3,product.productprice)
        prepareStmt.setInt(4,product.productquantity)

        val result =prepareStmt.executeUpdate()

        if (result>0){
            println("inserted")
        }
        else{
            println("not inserted")
        }
    }


}