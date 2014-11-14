

def findFirst[A](as: Array[A], p: A => Boolean) : Int = {

  @annotation.tailrec
  def loop(n: Int): Int = {
    if (n >= as.length) -1
    else if (p(as(n))) n
    else loop(n+1)
  }

  loop(0)
}

def isItTheThing(a: String) : Boolean = {
  a == "c"
}

var z = Array("a","b","c","d","e")

println( findFirst(z, isItTheThing) )