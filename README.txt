PlainKick - Velocity plugin
Removes the "You were kicked from <server>:" header so only the kick reason shows.

OPTION A - build on your PC (JDK 17+, Java 25 works, and Gradle 9.1+):
  gradle build
  -> build/libs/plainkick-*.jar  -> put it in your proxy "plugins" folder, restart proxy.

OPTION B - no install, free GitHub build:
  1. Create a new GitHub repo, upload everything in this folder (keep .github folder).
  2. Open the Actions tab -> "build" -> run it (or it runs on upload).
  3. Open the finished run -> Artifacts -> download plainkick-jar.
  4. Put the jar in your proxy "plugins" folder, restart proxy.
