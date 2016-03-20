package com.illuzor.logextension {
	
	import flash.external.ExtensionContext;
	
	public class Log {
		
		private static var context:ExtensionContext;
		
		public static function e(tag:String, message:String):void {
			log("e", tag, message);
		}
		
		public static function d(tag:String, message:String):void {
			log("d", tag, message);
		}
		
		public static function i(tag:String, message:String):void {
			log("i", tag, message);
		}
		
		public static function v(tag:String, message:String):void {
			log("v", tag, message);
		}
		
		public static function w(tag:String, message:String):void {
			log("w", tag, message);
		}
		
		public static function wtf(tag:String, message:String):void {
			log("wtf", tag, message);
		}
		
		private static function log(type:String, tag:String, message:String):void {
			if (!context) context = ExtensionContext.createExtensionContext("com.illuzor.extensions.LogExtension", null);
			context.call("log", type, tag, message);
		}
		
	}

}