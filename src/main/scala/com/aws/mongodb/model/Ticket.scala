package com.aws.mongodb.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
class Ticket {

  @Id
  private var id : String = _
  private var title:String = _
  private var description:String = _
  private var appId:String = _
  private var status:String = _

  def this(title: String, description: String, appId: String, status: String) {
    this()
    this.title = title
    this.description = description
    this.appId = appId
    this.status = status
  }

  def this(title: String, description: String, status: String) {
    this()
    this.title = title
    this.description = description
    this.status = status
  }

  def getStatus: String = status

  def setStatus(status: String): Unit = {
    this.status = status
  }

  def getId: String = id

  def setId(id: String): Unit = {
    this.id = id
  }

  def getTitle: String = title

  def setTitle(title: String): Unit = {
    this.title = title
  }

  def getDescription: String = description

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getAppId: String = appId

  def setAppId(appId: String): Unit = {
    this.appId = appId
  }

  override def toString: String =
    "Ticket{" + "id=" + id + ", title='" + title + '\'' + ", description='" + description + '\'' + ", application_id=" + appId + ", status='" + status + '\'' + '}'

}
