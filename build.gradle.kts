plugins {
    id("java")
}

group = "leo.org.com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.7.1")
}

tasks.test {
    useTestNG()
}