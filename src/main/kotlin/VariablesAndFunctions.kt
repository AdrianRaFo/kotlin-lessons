object VariablesAndFunctions {

  val a: Int = 1
  var b: Int = 1
  val c: Int by lazy { if (b == 1) throw Exception() else 3 }

  fun cal2(numeroComoTexto: String): Int = numeroComoTexto.toInt()

  @JvmStatic
  fun main(args: Array<String>) {
    println(a)
    println(b)
    b = cal2("2")
    println(b)
    println(c)
    println(cal2("a"))
  }
}