package com.axis.app

import java.sql.Connection
import java.sql.DriverManager

class dbConnection {
    fun connect(): Connection {
        val dburl ="jdbc:mysql://localhost:3306/kotlindb"
        val connection= DriverManager.getConnection(dburl,"root","hema")
        return connection
    }
}