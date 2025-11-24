plugins {
    java
    application
    id("com.gradleup.shadow") version "9.2.2"
}

group = "edu.upc"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.jdom:jdom:1.1.3")
    implementation("com.formdev:flatlaf:3.6.2")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("edu.upc.fib.ossim.OSSimFrame")
}

tasks.jar {
    dependsOn("shadowJar")
    archiveClassifier.set("plain")
}

tasks.shadowJar {
    archiveClassifier.set("")
    manifest {
        attributes("Main-Class" to "edu.upc.fib.ossim.OSSimFrame")
    }
}