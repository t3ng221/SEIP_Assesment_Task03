fun main() {

   val bse = BaseSalaried(name = "Siam", salary = 50000.0)
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