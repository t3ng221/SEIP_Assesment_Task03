fun main() {

   val bse = BaseSalaried(name = "Siam", salary = 50000.0)
    val hse = HourlySalaried(name = "Tango",5.5,20.3)
    val cse = CommisionSalaried("Charlie",2000.0,15.0,5.0)
    val employees= arrayListOf<Employee>()
}

class salaryManager(val employee: Employee){
    fun pay()=employee.calculateSalary()
}
interface  foodAllowance{
    fun payfoodAllowance()
}
interface medicalAllowance{
    fun payMedicalAllowance()
}
interface transAllowance{
    fun payTransAllowance()
}