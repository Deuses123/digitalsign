plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:3.4.0") // Укажите корректную версию Spring Boot
    implementation("org.springframework:spring-context:6.1.14") // Укажите подходящую версию Spring Context
}


tasks.withType<Test> {
    useJUnitPlatform()
}
