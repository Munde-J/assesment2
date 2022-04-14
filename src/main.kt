fun main(){
  var account= CurrentAccount("0721334376","Angela",200.00)
    account.deposit(300.00)

    account.withdraw(100.00)

    account.details()
}
//Assessment 2
//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)

class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Double){
    fun deposit(amount:Double){
        var x = amount+balance
        println(x)
    }
    fun withdraw(amount: Double){
        var y =balance-amount
        println(y)
    }
    fun details(){
        println("Accountnumber $accountnumber with balance $balance is operated by $accountname")
    }

    var pen=product("bick",2.3,30,"other")
    var socks=product("ankle",1.5,50,"hygiene")
    var kale= product("spinach",5.8,100,"groceries")

    var save=SavingsAccount("98564334","Ann",340.00)


    var nms =Names("watermelon")



}
//2.Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
class SavingsAccount(var accountnumber:String,var accountname:String,var balance:Double){
    fun withdrwals(amount:Int){
        var p =withdrwals(300)
        if (p >4){
            println(p)
        }
    }
}
//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
data class product(var name: String,var weight:Double,var price:Int,var category:String)
    fun prd(){
        var x= mutableListOf<product>()

        var a=prd()
        var b=prd()
        var c=prd()


       when(x.forEach()){

        }





//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”(2 points)
fun Names(name:String){

    var a=name.indices.elementAt(2)
    if (a%2==0) {

        println(a)
    }
}

