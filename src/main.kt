fun main() {
    println(Names("SARAH"))

    var Details=CurrentAccount(453662,"roadside",7832.00)
    deposit(3500.00)
    var total=3500.00+7832.00
    println(total)
    withdraw(2600.00)
    var totalBalance=7832.00-2600.00
    println(totalBalance)
     details()
    var withdrawls=Saving(54366,"Imani",90000.00,3)
    fun withrawal(withdrawals: Int) {
        for (withdraw in withdrawals) {
            if (withdraw < 4) {
                println("you can withdraw")
            }
        }
    }
    var totalAmount=currentBalance-totalWithdraw
    println(totalAmount)

}
data class Car(var make:String,var model:String,var color:String)

fun checkColors(colors:String){
    var carList= mutableListOf<String>()
  when =
    "red"->println()
}
fun Names(name:String):Int{

    return name.length


}
 data class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){

 }
fun deposit(amount:Double){
}
fun withdraw(amount:Double){

}
fun details(){
    println("Account number +''+ accountNumber with balance + ''+ balance is operated by + ''+ accountName")
}
 data class Saving(var accountNumber:Int,var accountName:String,var balance:Double,var withdrawals:Int){
 } }

