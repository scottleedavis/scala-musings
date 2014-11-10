
//This is a fibonacci example.
// takes in 'n', which will return the 'nth' value in a fibonacci sequence

def fib(n: Int): Int = {

  @annotation.tailrec
  def go(n: Int, prev: Int, prevprev: Int): Int = {
    if (n == 0)
      prev+prevprev
    else
      go(n-1, prev+prevprev, prev)
  }

  if( n == 1 )
    0
  else if( n == 2 )
    1
  else
    go(n-2,0,1)
}

println(fib(1))
println(fib(2))
println(fib(3))
println(fib(4))
println(fib(5))
println(fib(6))
println(fib(7))
println(fib(8))
println(fib(9))
println(fib(10))