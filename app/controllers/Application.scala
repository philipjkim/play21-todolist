package controllers

import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.tasks)
  }

  def tasks = TODO

  def newTask = TODO

  def deleteTask(id: Long) = TODO
}