The idea is that we can use Spark for calculations on large lists of numbers. The example here is to calculate statistics for a normal distribution either for a sample or a population. To make an algorithm for Spark we need to consider that Spark will split the problem and distribute the chunks and run part of the calculation in the map phase and then bring those results back together in the reduce phase which can also do calculations. 

To take advantage of Spark and distributed calculations we needed to take an equation and rearrange the equation so we have the pieces needed to do the calculations when we get the final set of numbers once the Spark algorithm is complete. It turns out for basic statistics like the mean and standard deviation we just need the sum, count, and sum of squares of the original numbers.

Thanks to Rob Rucker for the help rearranging the equation at Scala Days 2015.

The equation we used from https://www.mathsisfun.com/

![Image of Equation](https://www.mathsisfun.com/data/images/standard-deviation-formula.gif)
