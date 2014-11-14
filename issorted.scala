
def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
  
  @annotation.tailrec
  def loop(n:Int, n1:Int): Boolean = {
    if( n == as.length-1 ) true
    else ordered(as(n),as(n+1)) && loop(n+1,n+2) 
  }

  loop(0,1)
}

def order(x: String, y: String): Boolean = {
  x < y
}

var z1 = Array("a","b","c","d","e")
var z2 = Array("a","e","d","e","b")

println( isSorted(z1, order) )
println( isSorted(z2, order) )