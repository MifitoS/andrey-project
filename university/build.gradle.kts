plugins {
    java
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "ru.andreyCompany"
version = "0.0.1-SNAPSHOT"
description = "university"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.1.4"))
    annotationProcessor(platform("org.springframework.boot:spring-boot-dependencies:3.1.4"))
    testImplementation(platform("org.springframework.boot:spring-boot-dependencies:3.1.4"))
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.liquibase:liquibase-core")
    implementation("io.hypersistence:hypersistence-utils-hibernate-62:3.6.0")
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    implementation("com.github.ben-manes.caffeine:caffeine")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    //implementation("ru.pim.dictionary:dictionary-service-client:1.0.50-RELEASE")



    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")


    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
