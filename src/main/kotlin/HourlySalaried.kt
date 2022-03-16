class HourlySalaried(name:String,
                     val totalHour:Double,
val hourRate:Double=50.0,
val project:List<Project>,
val projectManager: List<projectManager>):Employee(name) {
    override fun calculateSalary()=totalHour*hourRate
}
class Project(
    val projectName:String,
    val projectDuration:String
){
    override fun toString(): String {
        return "Project(projectName='$projectName', projectDuration='$projectDuration')"
    }
}
class projectManager(
    val managerName:String,
    val mangDept:String
){
    override fun toString(): String {
        return "projectManager(managerName='$managerName', mangDept='$mangDept')"
    }
}