fun main(){
names(listOf("Sakina","Ali","Sudeis","Mary","Siama","Salma","Sajad","Musa","Asia","Marwa"))
var result= height(listOf(43,21,23,46,67))
    println(result)

    var name=Person("Issa",21,114,52)
    var nameb=Person("Nadine",17,112,32)
    var namec=Person("Samia",32,111,56)
    var named= listOf(name,nameb,namec)
    println(named.sortedByDescending {z->z.age  })
    var namese=Person("Ali",12,113,31)
    var namesf=Person("Amina",34,101,76)
    var namesg= listOf(namese,namesf)
    println(namesg.plus(named))
    var reg1=Car("SK23",67)
    var reg2=Car("SWE12",31)
    var reg3=Car("WSR45",96)
    var reg= listOf(reg1,reg2,reg3)
    println(car(reg))
}

fun names(name:List<String>):List<String>{
    name.forEachIndexed { index, s ->
        if((index%2)==0){
            println(s)
    }
    }
    return name
}

fun height(meters:List<Int>):String{
    var avg= meters.average()
    var add = meters.sum()
    var product="$avg,$add"
    return product

}

data class Person(var name:String,var age:Int,var height:Int,var weight:Int)

data class Car(var registration:String,var mileage:Int)

fun car(words:List<Car>):Int{
    var loop=0
    words.forEach { y->y.mileage
        loop+=y.mileage
    }
    var total=loop/words.count()
    return total
}
