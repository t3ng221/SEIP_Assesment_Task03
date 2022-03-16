class CommisionSalaried(name:String,
        val salary:Double,
        val totalSale:Double,
        val comissionRate:Double=2.5):Employee(name),foodAllowance,medicalAllowance,transAllowance{
        override fun calculateSalary()=salary+(totalSale*comissionRate)
        override fun payfoodAllowance() {
                println("Pay food allowance to $name")
        }

        override fun payTransAllowance() {
                println("Pay transport allowance to $name")
        }

        override fun payMedicalAllowance() {
                println("Pay medical allowance to $name")
        }
        }