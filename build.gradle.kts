plugins {
    kotlin("js") version "2.2.20"
}

kotlin {
    js {
        browser {
            binaries.executable()
            commonWebpackConfig { cssSupport { enabled.set(true) } }
        }
    }
}

repositories {
    mavenCentral()
}

tasks.register("dev") {
    dependsOn("browserDevelopmentRun")
}
tasks.register("buildProd") {
    dependsOn("browserProductionWebpack")
}
