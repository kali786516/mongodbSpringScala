package com.aws.mongodb.repositories
import com.aws.mongodb.model.Application
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
trait ApplicationRepository extends MongoRepository[Application, String]{

}
