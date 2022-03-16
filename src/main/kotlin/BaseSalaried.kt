open class BaseSalaried(
   name:String,
    var salary:Double

):Employee(name),foodAllowance,medicalAllowance,transAllowance{
    override fun payfoodAllowance(){
        println("Pay Food Allowance to $name")
    }

    override fun calculateSalary()=salary
    override fun payMedicalAllowance() {
       println("Pay medical allowance to $name")
    }

    override fun payTransAllowance() {
       println("Pay transport allowance to $name")
    }
}
