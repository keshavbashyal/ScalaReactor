import akka.actor.{ActorSystem, Props}

/**
 * Created by keshavbashyal on 7/20/15.
 */
object Pi extends App {

  println("Hello Akka")

  calculate(nrOfWorkers = 4, nrOfElements = 1000, nrOfMessages = 1000)

  // actors and messages ...

  def calculate(nrOfWorkers: Int, nrOfElements: Int, nrOfMessages: Int) {
    // Create an Akka system
    val system = ActorSystem("PiSystem")

    // create the result listener, which will print the result and shutdown the system
    val listener = system.actorOf(Props[Listener], name = "listener")

    // create the master
    val master = system.actorOf(Props(new Master(
      nrOfWorkers, nrOfMessages, nrOfElements, listener)),
      name = "master")

    // start the calculation
    master ! Calculate


  }
}