package com.aws.mongodb.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Application {

  @Id
  private var id:String = _
  private var name:String = _
  private var description:String = _
  private var owner:String = _

  def this(id: String, name: String, owner: String, description: String) {
    this()
    this.id = id
    this.name = name
    this.owner = owner
    this.description = description
  }

  def getId: String = id

  def setId(id: String): Unit = {
    this.id = id
  }

  def getName: String = name

  def setName(name: String): Unit = {
    this.name = name
  }

  def getOwner: String = owner

  def setOwner(owner: String): Unit = {
    this.owner = owner
  }

  def getDescription: String = description

  def setDescription(description: String): Unit = {
    this.description = description
  }

  override def toString: String = "Application{" + "id=" + id + ", name='" + name + '\'' + ", owner=" + owner + ", description='" + description + '\'' + '}'

}
