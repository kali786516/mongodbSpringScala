package com.aws.mongodb.repositories

import com.aws.mongodb.model.Release
import org.springframework.data.mongodb.repository.MongoRepository

trait ReleaseRepository extends MongoRepository[Release, String] {

}
