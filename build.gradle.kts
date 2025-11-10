plugins {
    java
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
}

tasks.test {
    useJUnitPlatform()
}