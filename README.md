# Redesigned Cactus

Application built to learn appropriate ways to test drive through the Android UI.
 Specifically the tests located in `app/src/androidTest/java/com/example/redesignedcactus`.
 They should start the emulator and interact with the UI checking the expected results.
 
### Running Tests
Three Options
- If you have gradle installed locally `gradle connectedAndroidTest`
- If you use the built-in gradle wrapper `./gradlew connectedAndroidTest`
- If you want to run using the UI, navigate to MainActivityTest.kt and run from there

### Notes
The UI tests are being run using **Espresso**

Most of the support dependencies are pulled from **AndroidX**,
which is a replacement for previously used **Android Support Library**.
https://developer.android.com/jetpack/androidx/migrate
 