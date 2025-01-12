plugins {
    id("buildlogic.java-library-conventions")
}

dependencies {
    implementation("org.freemarker:freemarker:2.3.34")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.1.2")
    implementation("com.baomidou:mybatis-plus-generator:3.1.2")
    implementation("io.springfox:springfox-swagger2:3.0.0")
    implementation("org.projectlombok:lombok:1.18.36")
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("com.github.yulichang:mybatis-plus-join-boot-starter:1.5.2")
    implementation("org.springframework.boot:spring-boot-starter-web:2.2.0.RELEASE")
}