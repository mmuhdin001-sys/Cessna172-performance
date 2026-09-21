# Takeoff EFB Pro Android project

This is an Android Studio project wrapping the offline HTML prototype in a WebView.

## Build APK
1. Install Android Studio on a computer.
2. Open this folder as an existing project.
3. Allow Gradle sync and install any requested Android SDK components.
4. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. Find the debug APK at `app/build/outputs/apk/debug/app-debug.apk`.
6. Transfer it to your Android phone and install it. Android may ask you to allow installs from that file manager.

## Notes
- Application ID: `com.muhdin.takeoffefb`
- Minimum Android: 6.0 (API 23)
- The calculator is bundled locally and does not request internet permission.
- This is an educational prototype, not an approved EFB or aircraft performance tool. Verify all performance data and calculations against the current POH/AFM and instructor/SOP requirements before flight.
