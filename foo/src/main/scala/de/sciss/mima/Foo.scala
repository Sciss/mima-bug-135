package de.sciss

package object mima {
  implicit class Ops(private val s: String) extends scala.AnyVal {
    def `\\` (index: Int  ): String = s.substring(index, index + 1)
    def `\\` (range: Range): String = range.map(s.charAt).mkString
  }
}
