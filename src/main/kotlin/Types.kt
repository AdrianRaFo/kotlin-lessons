import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

object Types {
  val text: String = "abc"
  val num: Int = 1
  val littleNum: Short = Short.MAX_VALUE
  val byte: Byte = Byte.MAX_VALUE
  val largeNum: Long = Long.MAX_VALUE
  val largeNum2: Long = 1235L
  val decimal: Double = 1.23
  val otherDecimal: Float = 1.23f
  val character: Char = 'a'
  val condition: Boolean = true
  val textList: List<String> = listOf("a", "b", "c")
  val numList: List<Int> = listOf(1, 2, 3)
  val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

  //Extra
  val uuid: UUID = UUID.randomUUID()
  val bigInteger: BigInteger = BigInteger.valueOf(largeNum)
  val bigDecimal: BigDecimal = BigDecimal.valueOf(decimal)

  @JvmStatic
  fun main(args: Array<String>) {
    println("text = $text")
    println("num = $num")
    println("littleNum = $littleNum")
    println("byte = $byte")
    println("largeNum = $largeNum")
    println("largeNum2 = $largeNum2")
    println("decimal = $decimal")
    println("otherDecimal = $otherDecimal")
    println("character = $character")
    println("condition = $condition")
    println("textList = $textList")
    println("numList = $numList")
    println("map = $map")
    println("uuid = $uuid")
    println("bigInteger = $bigInteger")
    println("bigDecimal = $bigDecimal")
  }
}