//this file is saved as UTF-16 LE with BOM
object Test {
  def main(args: Array[String]): Unit = {
    val testchar = '⇒'
    println(testchar == '\u21D2')
  }
}