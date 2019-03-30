package clicker.equipment

abstract class Equipment {

  var numberOwned: Int = 0
  var name: String = ""

  def goldPerSecond(): Double

  def goldPerClick(): Double

  def costOfNextPurchase(): Double

  def buy(): Unit = {
    this.numberOwned += 1
  }

}
