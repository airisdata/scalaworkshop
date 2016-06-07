package com.airisdata.meetup4.func

import java.sql.{Statement, DriverManager, Connection, ResultSet}
import java.util.Properties

// Higher order functions - a practical way to implement "DRY" principle
// An example of "Execute Around" pattern
object AutoResourceManagement {

  // This function is a closure as it
  def usingARMAuto[A <: AutoCloseable, B](resource: A)(block: A => B): B = {

    try {

      // execute block
      block(resource)

    } finally {

      // close the resource
      if (resource != null) resource.close()

    }

  }


}


object DatabaseQueryClient {

  import AutoResourceManagement._

  def executeQuery[A](f: ResultSet => A, queryString: String): A = {

    val connectionProperties: Properties = new Properties()
    connectionProperties.put("username", "airisdata")
    connectionProperties.put("password", "pa55w0rd")

    usingARMAuto[Connection, A](

      // Establish connection to database
      DriverManager.getConnection("jdbc:mysql://servername:port", connectionProperties)) { connection =>

      usingARMAuto[Statement, A](

        //Create Statement
        connection.createStatement()) { statement =>

        usingARMAuto[ResultSet, A](

          // Execute Query
          statement.executeQuery(queryString)) { resultSet =>

          f(resultSet)

        }

      }

    }

  }

}


object ClientProgram extends App {

  import DatabaseQueryClient._



  val result: Option[String] = executeQuery[Option[String]]((resultSet: ResultSet) => {

    if (resultSet != null && resultSet.next()) {
      Some(resultSet.getString("COLUMN_NAME"))
    } else {
      None
    }

  }, "SELECT COLUMN_NAME FROM TABLE_NAME")



  val result2: Option[Int] = executeQuery[Option[Int]]((resultSet: ResultSet) => {

    if (resultSet != null && resultSet.next()) {
      Some(resultSet.getInt("COLUMN_NAME"))
    } else {
      None
    }

  }, "SELECT COLUMN_NAME FROM TABLE_NAME")


}