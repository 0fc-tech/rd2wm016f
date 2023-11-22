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
