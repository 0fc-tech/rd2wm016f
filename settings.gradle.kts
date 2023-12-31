pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Demonstrations"
include(":app")
include(":mod3demo1")
include(":mod3demo2")
include(":mod3demo3")
include(":mod3demo4")
include(":eni_shop")
include(":mod2launchericon")
include(":mod2demoihm")
include(":mod4findviewbyid")
include(":mod4databinding")
include(":mod5navfragment")
include(":mod5menu")
include(":mod6intent")
include(":mod7lifecycle")
include(":mod7configchange")
include(":mod8orm")
include(":mod10recyclerview")
include(":mod11apirest")
