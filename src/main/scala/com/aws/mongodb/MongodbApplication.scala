package com.aws.mongodb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MongodbApplication {

}

object MongodbApplication{
  def main(args: Array[String]): Unit = {

    SpringApplication.run(classOf[MongodbApplication], args: _*)

  }
}
