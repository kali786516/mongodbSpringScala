package com.aws.mongodb.controller

import com.aws.mongodb.model.Application
import com.aws.mongodb.model.Release
import com.aws.mongodb.model.Ticket
import com.aws.mongodb.repositories.{ApplicationRepository, ReleaseRepository, TicketRepository}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._
import java.util
import java.util.{List, Optional}


@RestController
@RequestMapping (value = Array("/tza"))
class TzaController {

  @Autowired
  private var applicationRepository:ApplicationRepository = _

  @Autowired
  private var releaseRepository:ReleaseRepository = _

  @Autowired
  private var ticketRepository:TicketRepository = _

  // ************** Methods for Applications *************************
  @RequestMapping(value = Array("/applications"), method = Array(RequestMethod.GET))
  def getAllApplications: util.List[Application] = {
    applicationRepository.findAll
  }

  @RequestMapping(value = Array("/applications/{id}"), method = Array(RequestMethod.GET))
  def getApplicationById(@PathVariable("id") id: String): Optional[Application] = {
    applicationRepository.findById(id)
  }

  @RequestMapping(value = Array("/applications"), method = Array(RequestMethod.POST))
  def addNewApplication(@RequestBody application: Application): Application = {
    applicationRepository.save(application)
  }

  @RequestMapping(value = Array("/applications/{id}"), method = Array(RequestMethod.PUT))
  def updateApplication(@PathVariable("id") id: String, @RequestBody application: Application): Application = {
    application.setId(id)
    applicationRepository.save(application)
  }

  @RequestMapping(value = Array("/applications/{id}"), method = Array(RequestMethod.DELETE))
  def deleteApplication(@PathVariable("id") id: String): Unit = {
    applicationRepository.deleteById(id)
  }

  // ************** Methods for Tickets *************************
  @RequestMapping(value = Array("/tickets"), method = Array(RequestMethod.GET))
  def getAllTickets: util.List[Ticket] = {
    ticketRepository.findAll
  }

  @RequestMapping(value = Array("/tickets/{id}"), method = Array(RequestMethod.GET))
  def getTicketById(@PathVariable("id") id: String): Optional[Ticket] = {
    ticketRepository.findById(id)
  }

  @RequestMapping(value = Array("/tickets"), method = Array(RequestMethod.POST))
  def addNewApplication(@RequestBody ticket: Ticket): Ticket = {
    ticketRepository.save(ticket)
  }

  @RequestMapping(value = Array("/tickets/{id}"), method = Array(RequestMethod.PUT))
  def updateApplication(@PathVariable("id") id: String, @RequestBody ticket: Ticket): Ticket = {
    ticket.setId(id)
    ticketRepository.save(ticket)
  }

  @RequestMapping(value = Array("/tickets/{id}"), method = Array(RequestMethod.DELETE))
  def deleteTicket(@PathVariable("id") id: String): Unit = {
    ticketRepository.deleteById(id)
  }

  // ************** Methods for Releases *************************
  @RequestMapping(value = Array("/releases"), method = Array(RequestMethod.GET))
  def getAllReleases: util.List[Release] = {
    releaseRepository.findAll
  }

  @RequestMapping(value = Array("/releases/{id}"), method = Array(RequestMethod.GET))
  def getReleaseId(@PathVariable("id") id: String): Optional[Release] = {
    releaseRepository.findById(id)
  }

  @RequestMapping(value = Array("/releases"), method = Array(RequestMethod.POST))
  def addNewRelease(@RequestBody release: Release): Release = {
    releaseRepository.save(release)
  }

  @RequestMapping(value = Array("/releases/{id}"), method = Array(RequestMethod.PUT))
  def updateRelease(@PathVariable("id") id: String, @RequestBody release: Release): Release = {
    release.setId(id)
    releaseRepository.save(release)
  }

  @RequestMapping(value = Array("/releases/{id}"), method = Array(RequestMethod.DELETE))
  def deleteRelease(@PathVariable("id") id: String): Unit = {
    releaseRepository.deleteById(id)
  }

}
