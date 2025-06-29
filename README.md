# Apache Spark Demo using classic map / reduce

The idea is that we can use Spark for calculations on large lists of numbers. The example here is to calculate statistics for a normal distribution either for a sample or a population. To make an algorithm for Spark we need to consider that Spark will split the problem and distribute the chunks and run part of the calculation in the `map` phase and then bring those results back together in the `reduce` phase which can also do calculations.

To take advantage of Spark and distributed calculations we needed to take an equation and rearrange the equation so we have the pieces needed to do the calculations when we get the final set of numbers once the Spark algorithm is complete. It turns out for basic statistics like the mean and standard deviation we just need the sum, count, and sum of squares of the original numbers.

Thanks to Rob Rucker for the help rearranging the equation at Scala Days 2015.

The equation we used is shown at https://www.mathsisfun.com/

![Image of Equation](https://www.mathsisfun.com/data/images/standard-deviation-formula.gif)

## Now setup for Scala cross build

Now that Spark 4.0.x only supports Scala 2.13 and can also work for Scala 3, we demonstrate cross building. This code can be added to the build of stable production systems that are using Scala 2.12.x and the Spark 3.5.x or earlier. Hopefully this can be helpful for those trying to make the transition to newer versions of Scala and Spark.

To build all versions, use the following at the sbt prompt:

```sh
sbt:Spark Stats> +clean
sbt:Spark Stats> +compile
sbt:Spark Stats> +run
```

If you would like to just build a single version, omit the `+` and it will build for just the first version, Scala 2.12. You can build for Scala 3 for example using the following and then just use your commands without the `+` prefix:

```sh
sbt:Spark Stats> ++3.3.6
sbt:Spark Stats> compile
```

Find me on the Scala Community Spark Discord channel. See the [Scala Community](https://scala-lang.org/community/) page for Discord.
