package ekrich

object StatsSimpleApp extends App {
    val numbers = List(3,3.5,4,5,5.5,6.5,7)
    val stats = Stats.process(numbers)
    stats.print()
    println(stats)
}