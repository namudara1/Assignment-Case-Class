case class Point(x:Int,y:Int){
  
  def +(that:Point)={Point(this.x+that.x,this.y+that.y) }
  
  def move(dx:Int,dy:Int)={Point(this.x+dx,this.y+dy)}
  
  def -(that:Point)={Point(this.x-that.x,this.y-that.y) }
  def DisBetweenPoints(that:Point):Double=
  {
   val dist=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return dist
  }

  def Invertpoint(that:Point)={Point(this.y,this.x)}
}

object Pointcall extends App {
  
   val u=Point(5,10)
   val v=Point(15,20)
   val w=u-v
  
   println("Q1:add "+u+" and "+v+"="+(u+v))
   println("")
   println("Q2:move a "+u+" by given distance="+u.move(6, 2))
   println("")
   println("Q3:distance between "+u+" and "+v+"="+w.DisBetweenPoints(w))
   println("")
   println("Q4:invert  "+u+"="+u.Invertpoint(u))
  
}