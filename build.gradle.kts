plugins {
    java

    id("org.springframework.boot") version "2.5.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "io.obadiah"
version = "0.0.1-SNAPSHOT"
description = "Simple tool to automatically pay my tax."

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.6")
    implementation("org.springframework.boot:spring-boot-starter-data-rest:2.5.6")
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.6")

    implementation("org.jetbrains:annotations:22.0.0")

    runtimeOnly("org.mariadb.jdbc:mariadb-java-client:2.7.4")
}
