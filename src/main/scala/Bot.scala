import bwapi.{BWClient, DefaultBWListener, Game}

class Bot(var bwClient: BWClient = null, var game: Game = null) extends DefaultBWListener {
  override def onStart(): Unit = {
    game = bwClient.getGame
  }

  override def onFrame(): Unit = {
    game.drawTextScreen(100, 100, "Hello World!")
  }
}


object Bot {
  def main(args: Array[String]): Unit = {
    val bot = new Bot
    bot.bwClient = new BWClient(bot)
    bot.bwClient.startGame()
  }
}
