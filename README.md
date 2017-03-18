Android-Log-Extension-ANE
==========================
Native Extension for Adobe AIR

Features:

	- android system logging via Log class with the same syntax.
	
Important! Be shure you are using latest version of AIR SDK. This ANE builded for 21
	
How to use:

Connect com.illuzor.extensions.LogExtension.ane file to your android air project.
Import com.illuzor.logextension.Log;

Using example:
```actionscript	
Log.e("TAG", "message"); // error
Log.d("TAG", "message"); // debug
Log.i("TAG", "message"); // info
Log.v("TAG", "message"); // verbose
Log.w("TAG", "message"); // warn
Log.wtf("TAG", "message"); // What a Terrible Failure
```
