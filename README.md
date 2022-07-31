# KmmCaching
An application that illustrates fetching data from remote data source and caching it in local storage for both IOS and Android platforms using Kotlin Multiplatform Mobile and SqlDelight.

SqDelight Pros
* It generates type-safe code and classes from the different SQL statements.
* It is compatible with Kotlin Multi-platform (KMM) 
* SQL Delight is better when dealing with multi-table databases.

If you are good in Swift Feel Free to implement the IOS Design 

## ScreenShot
<img src="/screenshots/home.png" width="360">&emsp;

## Plugins and Resources

* [KMM Plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile)
* [SqDelight Plugin](https://plugins.jetbrains.com/plugin/8191-sqldelight)
* Resources

  * [Ktor Network Requests](https://ktor.io/docs/request.html)
  * [Getting Started with Kmm](https://kotlinlang.org/docs/multiplatform-mobile-getting-started.html)
  * [Kmm Networking and Data Storage](https://play.kotlinlang.org/hands-on/Networking%20and%20Data%20Storage%20with%20Kotlin%20Multiplatfrom%20Mobile/01_Introduction)
  * []()

## Tech Stack
 - [Kotlin](https://kotlinlang.org/docs/reference/) - Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise
 
<!-- * [Jetpack Components:](https://developer.android.com/topic/architecture?gclid=Cj0KCQjw8O-VBhCpARIsACMvVLOH1satX45o9f4PMQ4Sxr7bG9myl6-KZL9nYda8PJsHV7m2uJL8bzgaAmqiEALw_wcB&gclsrc=aw.ds)
    * [View Model](https://developer.android.com/topic/libraries/architecture/viewmodel)-  store and manage UI-related data in a lifecycle conscious way.
    * [Lifecycle]( https://developer.android.com/topic/libraries/architecture/lifecycle) - Perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
    * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html) - A lifecycle-aware data holder with the observer pattern
    * [Android KTX](https://developer.android.com/kotlin/ktx.html) - Android KTX is a set of Kotlin extensions that are included with Android Jetpack and other Android libraries. KTX extensions provide concise, idiomatic Kotlin to Jetpack, Android platform, and other APIs.
    * [AndroidX](https://developer.android.com/jetpack/androidx) - Major improvement to the original Android [Support Library](https://developer.android.com/topic/libraries/support-library/index), which is no longer maintained.-->


* [Sqlelight](https://cashapp.github.io/sqldelight/) -  a crossplatform database library built on Kotlin

* [Coroutines](https://developer.android.com/kotlin/coroutines) - a concurrency design pattern that you can use on Android to simplify code that executes asynchronously

* [Swift](https://developer.apple.com/swift/) - Swift is a powerful and intuitive programming language for iOS, iPadOS, macOS, tvOS, and watchOS. Writing Swift code is interactive and fun, the syntax is concise yet expressive, and Swift includes modern features developers love. Swift code is safe by design and produces software that runs lightning-fast.

* [KMM](https://kotlinlang.org/docs/multiplatform.html) (Kotlin MultiPlatform Mobile) - Kotlin Multiplatform Mobile (KMM) is an SDK designed to simplify the development of cross-platform mobile applications. You can share common code between iOS and Android apps and write platform-specific code only where it's necessary. For example, to implement a native UI or when working with platform-specific APIs.

* [Ktor](https://ktor.io/docs/welcome.html) - Ktor is a framework to easily build connected applications – web applications, HTTP services, mobile and browser applications. Modern connected applications need to be asynchronous to provide the best experience to users, and Kotlin coroutines provide awesome facilities to do it in an easy and straightforward way. The goal of Ktor is to provide an end-to-end multiplatform framework for connected applications.

## Data Source
This application fetches programming quotes from the [Programming Quotes](https://programming-quotes-api.herokuapp.com/quotes) Api.

## Author
Felix Kariuki

<a href="https://www.buymeacoffee.com/felix.kariuki" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

Do Reach Out :

  * [Twitter](https://twitter.com/felixkariuki_)

  * [LinkedIn](https://www.linkedin.com/in/felix-kariuki/)
  
  
  ## License and Copyright

[MIT LICENSE](LICENSE)

```
MIT License

Copyright (c) 2022 Felix  Kariuki

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
