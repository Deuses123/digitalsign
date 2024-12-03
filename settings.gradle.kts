rootProject.name = "digitalsign"

include(":api")
include(":core")
include(":infrastructure")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
