fun main(){
    var listing =listofStrings(listOf("one","two","three","four","five","six","seven","eight","nine","ten"))
//println(listing)
    var output =averageAndtotalheight(listOf(56.2,50.0,23.7,70.5,45.8))
    val weigh = " meters"
   print(output.average())
    println(weigh)
    print(output.sum())
    println(weigh)
    var person1 = Person("Happy",23,5.5,53.5)
    var person2 = Person("Gesare",20,4.5,79.7)
    var person3 = Person("James",34,6.3,60.7)
    var person = listOf(person1,person2,person3)
    println(person)
    var sorted = person.sortedByDescending { human -> human.age }
    println(sorted)
    var newperson1 = PersonNew("Happy",23,5.5,53.5)
    var newperson2 = PersonNew("Gesare",20,4.5,79.7)
    var newperson3 = PersonNew("James",34,6.3,60.7)
    var personnew = listOf(newperson1,newperson2,newperson3)
    println(personnew)
    var addedPerson1 = PersonNew("Tanya",18,5.6,40.9)
    var addedPerson2 = PersonNew("Lavyne",60,4.8,58.2)
var totaladded = listOf(addedPerson1,addedPerson2)
    println(personnew.plus(totaladded))
    var vehicle1 = CarObject("KDE900",200000)
    var vehicle2 = CarObject("KBU8976",30000)
    var vehicle3 = CarObject("KCA578",19000)
var totalVehicle = listOf(vehicle1,vehicle2,vehicle3)
    println(carMileage(totalVehicle))
}
fun listofStrings(lists: List<String>):List<String>{
lists.forEachIndexed { index, name ->
    if (index % 2 == 0){
println(name)
    }

}
return lists
}
fun averageAndtotalheight(height:List<Double>):List<Double>{

    return height
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
data class PersonNew(var name:String,var age:Int,var height:Double,var weight:Double)

 data class CarObject ( var registration: String,var mileage: Int)
    fun carMileage(car:List<CarObject>):Int{
var average = 0
        car.forEach { x -> x.mileage
        average+= x.mileage
    }
    var totalAverage = average/car.count()
        return totalAverage
}




