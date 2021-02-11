plugins {
    id("application")
    id("com.github.johnrengelman.shadow") version "6.1.0"
    id("io.micronaut.application") version "1.3.3"
}

application {
    mainClass.set("com.example.Application")
}

micronaut {
    version("2.3.1")
    runtime("netty")
    testRuntime("junit")
    processing {
        incremental(true)
        annotations("com.example")
    }
}

dependencies {
    implementation(project(":library"))

    implementation("io.micronaut:micronaut-http-client")

    runtimeOnly("ch.qos.logback:logback-classic")
}
