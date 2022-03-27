rootProject.name = "dagger"
include("root")
include("root:package1")
include("root:package2")
include("root:package3")
include("root:package4")
include("root:package5")
include("root:package6")
include("root:package6:program")
include("root:package6:roller")

enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            alias("dagger2-di").to("com.google.dagger:dagger:2.16")
            alias("dagger2-compiler").to("com.google.dagger:dagger-compiler:2.16")
        }
    }
}

project(":root:package6:roller").name = "roller"
