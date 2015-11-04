package test

object Average {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val list = List(3,3.5,4,5,5.5,6.5,7)            //> list  : List[Double] = List(3.0, 3.5, 4.0, 5.0, 5.5, 6.5, 7.0)
  val list2 = List(3d,4,5)                        //> list2  : List[Double] = List(3.0, 4.0, 5.0)
  //val len = list2.size
  val mapRes = list.flatMap(x => List((x, x*x, 1)))
                                                  //> mapRes  : List[(Double, Double, Int)] = List((3.0,9.0,1), (3.5,12.25,1), (4.
                                                  //| 0,16.0,1), (5.0,25.0,1), (5.5,30.25,1), (6.5,42.25,1), (7.0,49.0,1))
  val res =	mapRes.reduce((x,y) => (x._1+y._1, x._2+y._2, x._3+y._3))
                                                  //> res  : (Double, Double, Int) = (34.5,183.75,7)
  val sum = res._1                                //> sum  : Double = 34.5
  val sumOfSquares = res._2                       //> sumOfSquares  : Double = 183.75
  val len = res._3                                //> len  : Int = 7
  val ave = sum / len                             //> ave  : Double = 4.928571428571429
  val variance = sumOfSquares / len - ave * ave   //> variance  : Double = 1.9591836734693864
  val stddev = Math.sqrt(variance)                //> stddev  : Double = 1.3997084244475297
  
}