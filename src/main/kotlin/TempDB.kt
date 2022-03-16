class TempDB {
    val managerList = listOf<projectManager>(
        projectManager(managerName = "Sam", dept = "HR"),
        projectManager(managerName = "Tam", dept = "DEV"),
        projectManager(managerName = "Vam", dept = "Soft"),
        projectManager(managerName = "Cam", dept = "Unga Bunga")
    )

    val projectList = mapOf(
        "ABC" to listOf<Project>(
            Project(projectName = "P01", projectDuration = "3 months"),
            Project(projectName = "P02", projectDuration = "1 months"),
            Project(projectName = "P03", projectDuration = "4 months"),
            Project(projectName = "P04", projectDuration = "5 months"),
        ),
        "DEF" to listOf<Project>(
            Project(projectName = "P01", projectDuration = "3 months"),
            Project(projectName = "P02", projectDuration = "1 months"),
            Project(projectName = "P03", projectDuration = "4 months"),
        ),
        "XYZ" to listOf<Project>(
            Project(projectName = "P01", projectDuration = "3 months"),
            Project(projectName = "P02", projectDuration = "1 months"),
        ),
        "PQR" to listOf<Project>(
            Project(projectName = "P01", projectDuration = "3 months"),
            Project(projectName = "P02", projectDuration = "1 months"),
            Project(projectName = "P03", projectDuration = "4 months"),
            Project(projectName = "P04", projectDuration = "5 months"),
            Project(projectName = "P05", projectDuration = "6 months"),
        ),


        )

}