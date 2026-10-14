plugins { java }

repositories { maven("https://repo.papermc.io/repository/maven-public/") }

dependencies {
  compileOnly("com.velocitypowered:velocity-api:3.4.0-SNAPSHOT")
  annotationProcessor("com.velocitypowered:velocity-api:3.4.0-SNAPSHOT")
}

// Compiled for Java 17 so it runs on Java 17-25. Build JDK can be 17 or newer (25 works).
tasks.withType<JavaCompile> { options.release.set(17) }
