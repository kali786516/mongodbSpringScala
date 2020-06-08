package com.aws.mongodb.model

import java.time.LocalDate
import java.util
import java.util.List

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
class Release {

  @Id
  private var id:String = _
  private var name:String = _
  private var description:String = _
  private var tickets:util.List[Ticket] = _
  private var releaseDate:java.time.LocalDate = _



  def this(name: String, description: String, tickets: util.List[Ticket], releaseDate: LocalDate) {
    this()
    this.name = name
    this.description = description
    this.tickets = tickets
    this.releaseDate = releaseDate
  }

  def getReleaseDate: LocalDate = releaseDate

  def setReleaseDate(releaseDate: LocalDate): Unit = {
    this.releaseDate = releaseDate
  }

  def getId: String = id

  def setId(id: String): Unit = {
    this.id = id
  }

  def getName: String = name

  def setName(name: String): Unit = {
    this.name = name
  }

  def getDescription: String = description

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getTickets: util.List[Ticket] = tickets

  def setTickets(tickets: util.List[Ticket]): Unit = {
    this.tickets = tickets
  }


}
