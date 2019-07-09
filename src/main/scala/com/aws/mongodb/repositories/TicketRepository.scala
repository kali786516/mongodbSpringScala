package com.aws.mongodb.repositories
import com.aws.mongodb.model.Ticket
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
trait TicketRepository extends MongoRepository[Ticket, String] {
}
