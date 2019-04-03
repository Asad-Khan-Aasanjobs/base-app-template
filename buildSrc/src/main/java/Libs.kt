// 1

object Versions {
  
  // Kotlin
  const val kotlin = "1.3.21"
  
  // Build Config
  const val minSDK = 16
  const val devSDK = 21
  const val compileSDK = 28
  const val targetSDK = 28
  
  // Gradle Plugins
  const val fabric = "1.27.1"
  const val googleServicesGms = "4.2.0"
  
  const val buildTools = "28.0.3"
  
  // Google Play APIs
  const val playServices = "15.0.1"
  //const val playBase = "16.1.0"
  const val playAuth = "16.0.1"
  //const val playMaps = "16.1.0"
  const val playPlaces = "16.0.0"
  const val playServiceAnalytics = "16.0.3"
  
  const val firebaseCore = "16.0.6"
  const val firebaseCrash = "16.2.1"
  const val firebaseRemote = "16.1.2"
  const val firebaseFCM = "17.3.4"
  const val firebaseIid = "17.0.4"
  const val firebasePerf = "16.1.0"
  const val firebaseAnalytics = "16.0.1"
  
  // 3rd Party Libs
  const val butterKnife = "9.0.0"
  const val dagger = "2.17"
  const val jsr250 = "1.0"
  
  const val bottomBar = "2.1.0"
  const val materialText = "1.0.5"
  const val parceler = "1.1.11"
  const val chips = "0.3.7@aar"
  const val shadowLayout = "1.0.3"
  const val multilineToolbar = "27.1.1"
  const val circleView = "2.2.0"
  
  const val clevertap = "3.4.2"
  const val crashlytics = "2.9.9@aar"
  const val answers = "1.4.3@aar"
  const val branch = "3.0.4"
  
  @Deprecated(message = "This is not to be used in future") const val newRelic = "5.13.0"
  
  const val rxJava = "2.2.7"
  const val rxAndroid = "2.1.1"
  
  const val retrofit = "2.4.0"
  const val okHttpLog = "3.12.0"
  
  const val linkedIn = "v1.1.4"
  const val facebook = "4.40.0"
  
  const val timber = "4.7.1"
  const val reactiveLoc = "2.1@aar"
  
  const val libPhone = "8.8.5"
  
  const val rxBinding = "2.2.0"
  
  // const val databinding = "3.0.0"
  
  // const val rxRelay = "2.0.0"
  
  const val rxActivity = "0.1.0"
  
  const val otpEditText = "1.3.4"
  
  const val saripaar = "2.0.3"
  
  // const val lottie = "2.3.1"
  
  const val rxpermission = "0.10.2@aar"
  
  // const val freshChat = "1.3.1"
  
  const val uxcam = "3.0.7@aar"
  
  const val deeplink = "3.1.1"
  
  const val leakCanary = "1.6.1"
  
  // Support Lib
  const val support = "28.0.0"
  const val constraintLayout = "1.1.3"
  const val multidex = "1.0.3"
  
  // Testing
  const val junit = "4.12"
  const val junit5 = "5.4.0"
  const val junit5Platform = "1.4.0"
  const val robolectric = "4.2"
  const val mockito = "2.25.0"
  const val espresso = "3.0.2"
  const val testRunner = "1.0.2"
  const val annotations = "17.0.0"
}

// 3
object Libs {
  
  const val v4 = "support-v4"
  const val v7 = "support-v7"
  const val v13 = "support-v13"
  const val compat7 = "appcompat-v7"
  const val gms = "com.google.android.gms"
  const val play = "play-services"
  const val gdagger = "com.google.dagger:dagger"
  
  // Organization packages
  const val gmsPlugin = "com.google.gms.google-services"
  
  private const val squareRetro = "com.squareup.retrofit2"
  private const val squareHttp = "com.squareup.okhttp3"
  private const val supportLib = "com.android.support"
  private const val firebase = "com.google.firebase"
  private const val googleplay = "com.google.android.gms:play-services"
  private const val canary = "com.squareup.leakcanary:leakcanary"
  private const val junitOrg = "org.junit"
  
  // Kotlin jdk8
  const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val kotlinx = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
  const val kotlinPluginApi = "org.jetbrains.kotlin:kotlin-gradle-plugin-api:${Versions.kotlin}"
  // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-gradle-plugin-api
  
  const val gmsGradlePlugin = "com.google.gms:google-services:${Versions.googleServicesGms}"
  
  // We recommend changing it to the latest version from our changelog:
  // https://docs.fabric.io/android/changelog.html#fabric-gradle-plugin
  const val fabricGradlePlugin = "io.fabric.tools:gradle:${Versions.fabric}"
  
  // Support Library
  const val appCompat = "$supportLib:$compat7:${Versions.support}"
  const val supportV4 = "$supportLib:$v4:${Versions.support}"
  const val supportV13 = "$supportLib:$v13:${Versions.support}"
  const val supportDesign = "$supportLib:design:${Versions.support}"
  const val cardView = "$supportLib:cardview-v7:${Versions.support}"
  const val recyclerView = "$supportLib:recyclerview-v7:${Versions.support}"
  const val supportCore = "$supportLib:support-core-utils:${Versions.support}"
  const val supportCompat = "$supportLib:support-compat:${Versions.support}"
  const val supportMediaCompat = "$supportLib:support-media-compat:${Versions.support}"
  const val supportAnnotations = "$supportLib:support-annotations:${Versions.support}"
  const val constraintLayout = "$supportLib.constraint:constraint-layout:${Versions.constraintLayout}"
  const val multidex = "$supportLib:multidex:${Versions.multidex}"
  
  // Firebase
  const val fireCore = "$firebase:firebase-core:${Versions.firebaseCore}"
  const val firePerf = "$firebase:firebase-perf:${Versions.firebasePerf}"
  const val fireFCM = "$firebase:firebase-messaging:${Versions.firebaseFCM}"
  const val fireIid = "$firebase:firebase-iid:${Versions.firebaseIid}"
  
  // Play Service APIs
  const val playBase = "$googleplay-base:${Versions.playServices}"
  const val googleLoc = "$googleplay-location:${Versions.playServices}"
  const val googlePlaces = "$googleplay-places:${Versions.playPlaces}"
  const val googleAuth = "$googleplay-auth:${Versions.playAuth}"
  const val googleMap = "$googleplay-maps:${Versions.playServices}"
  // const val googleAnalytix = "$googleplay-analytics:${Versions.playServiceAnalytics}"
  
  // 3rd Party Libs
  
  const val butterKnife = "com.jakewharton:butterknife:${Versions.butterKnife}"
  const val butterKnifeCompiler = "com.jakewharton:butterknife-compiler:${Versions.butterKnife}"
  const val butterKnifePlugin = "com.jakewharton:butterknife-gradle-plugin:${Versions.butterKnife}"
  
  const val dagger = "$gdagger:${Versions.dagger}"
  const val daggerCompiler = "$gdagger-compiler:${Versions.dagger}"
  const val daggerAndroid = "$gdagger-android:${Versions.dagger}"
  const val daggerAndroidProcessor = "$gdagger-android-processor:${Versions.dagger}"
  const val jsr250 = "javax.annotation:jsr250-api:${Versions.jsr250}"
  
  const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
  const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
  const val rxBinding = "com.jakewharton.rxbinding2:rxbinding:${Versions.rxBinding}"
  const val rxBindingDesign = "com.jakewharton.rxbinding2:rxbinding-design:${Versions.rxBinding}"
  const val rxActivity = "com.hendraanggrian:rx-activity:${Versions.rxActivity}"
  const val rxpermission = "com.github.tbruyelle:rxpermissions:${Versions.rxpermission}"
  
  const val bottomBar = "com.aurelhubert:ahbottomnavigation:${Versions.bottomBar}"
  const val materialText = "me.zhanghai.android.materialedittext:library:${Versions.materialText}"
  const val otpEditText = "com.alimuzaffar.lib:pinentryedittext:${Versions.otpEditText}"
  
  const val parceler = "org.parceler:parceler-api:${Versions.parceler}"
  const val parcelProcessor = "org.parceler:parceler:${Versions.parceler}"
  
  const val retrofit = "$squareRetro:retrofit:${Versions.retrofit}"
  const val retrofitRx = "$squareRetro:adapter-rxjava2:${Versions.retrofit}"
  const val retrofitGson = "$squareRetro:converter-gson:${Versions.retrofit}"
  const val okHttpLog = "$squareHttp:logging-interceptor:${Versions.okHttpLog}"
  
  const val chips = "com.beloo.widget:ChipsLayoutManager:${Versions.chips}"
  
  const val shadowLayout = "com.github.dmytrodanylyk.shadow-layout:library:${Versions.shadowLayout}"
  
  const val multilineToolbar = "net.opacapp:multiline-collapsingtoolbar:${Versions.multilineToolbar}"
  
  const val circleView = "de.hdodenhof:circleimageview:${Versions.circleView}"
  
  const val saripaar = "com.mobsandgeeks:android-saripaar:${Versions.saripaar}"
  
  // Annotations
  const val annotations = "org.jetbrains:annotations:${Versions.annotations}"
  
  const val deeplink = "com.airbnb:deeplinkdispatch:${Versions.deeplink}"
  const val deeplinkProcessor = "com.airbnb:deeplinkdispatch-processor:${Versions.deeplink}"
  
  const val linkedInAuth = "com.github.neurospeech:unofficial-linkedin-sdk-android:${Versions.linkedIn}"
  const val facebookAuth = "com.facebook.android:facebook-android-sdk:${Versions.facebook}"
  
  const val reactiveLocation = "pl.charmas.android:android-reactive-location2:${Versions.reactiveLoc}"
  
  const val uxcam = "com.uxcam:uxcam:${Versions.uxcam}"
  const val branch = "io.branch.sdk.android:library:${Versions.branch}"
  const val clevertap = "com.clevertap.android:clevertap-android-sdk:${Versions.clevertap}"
  const val crashlytix = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
  const val answers = "com.crashlytics.sdk.android:answers:${Versions.answers}"
  
  const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
  
  // Memory leak util libs
  const val leakCanary = "$canary-android:${Versions.leakCanary}"
  const val leakCanaryNoop = "$canary-android-no-op:${Versions.leakCanary}"
  const val leakCanarySupport = "$canary-support-fragment:${Versions.leakCanary}"
  
  // Testing
  const val junit = "junit:junit:${Versions.junit}"
  const val junit5 = "$junitOrg.jupiter:junit-jupiter-api:${Versions.junit5}"
  const val junit5Platform = "$junitOrg.platform:junit-platform-launcher:${Versions.junit5Platform}"
  const val junit5engine = "$junitOrg.jupiter:junit-jupiter-engine:${Versions.junit5}"
  const val junit4engine = "$junitOrg.vintage:junit-vintage-engine:${Versions.junit5}"
  
  const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
  
  const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
  const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
  const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
}
