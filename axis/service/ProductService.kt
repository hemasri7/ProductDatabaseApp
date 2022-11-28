package com.axis.service

import com.axis.modal.Product
import com.axis.utility.ProductUtility

class ProductServices{
    var productUtility=ProductUtility()

    fun insert() {
        var res=productUtility.insert()
        println(res)
    }
    fun viewAllProductDetails(){
        productUtility.selectAllDetails()
    }
    fun insertUserInput(product:Product) {
        productUtility.userInputInsert(product)
    }

}