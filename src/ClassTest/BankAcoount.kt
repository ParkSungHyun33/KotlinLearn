package ClassTest

open class BankAccount(val accountNumber: Int,
                  val accountBalance: Double = 0.0) {
    init {
        println("BankAccount is created" +
                " Number is $accountNumber," +
                " Balance is $accountBalance $" )
    }

    open fun displayBalance() {
        println("Current Account" +
                " Number is $accountNumber, " +
                "Balance is ${getBalance()} $")
    }

    open fun getBalance() : Double {
        return accountBalance
    }
}

class SavingAccount(accountNumber: Int,
                    accountBalance: Double,
                    val interestRate: Double) :
    BankAccount(accountNumber, accountBalance) {

    val interest : Double
        get() {
            return accountBalance * interestRate / 100
        }

    override fun displayBalance() {
        super.displayBalance()
        println("SavingsAccount " +
                "interest : $interest $," +
                " interestRate : $interestRate %")
    }

    override fun getBalance(): Double {
        return accountBalance + interest
    }
}