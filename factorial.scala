
def factorial(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, acc: Int): Int =
    if ( n<= 0 ) acc
    else go(n-1, n*acc)
  go(n,1)
}


println(factorial(1))
println(factorial(2))
println(factorial(3))
println(factorial(4))
println(factorial(5))
println(factorial(6))
println(factorial(7))
println(factorial(8))
println(factorial(9))
println(factorial(10))
