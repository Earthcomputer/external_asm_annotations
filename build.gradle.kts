plugins {
    id("java")
}

group = "net.earthcomputer"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.1")
    implementation("org.ow2.asm:asm:9.6")
    implementation("org.ow2.asm:asm-tree:9.6")
    implementation("org.ow2.asm:asm-analysis:9.6")
    implementation("org.ow2.asm:asm-util:9.6")
}
