# okiowatchdogtest

Demo app to recreate the 'Okio watchdog' thread CPU load bug: [https://github.com/square/okio/issues/185](https://github.com/square/okio/issues/185)


Problem goes away if the `-assumenosideeffects` line is commented out in `proguard-rules.pro`.
