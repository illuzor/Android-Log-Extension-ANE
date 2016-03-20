package com.illuzor.logextension;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class LogExtension implements FREExtension {
        
        LogExtensionContext context;

        @Override
        public FREContext createContext(String arg0) {
                context = new LogExtensionContext();
                return context;
        }

        @Override
        public void dispose() {
                context.dispose();
                context = null;
        }

        @Override
        public void initialize() {
                // TODO Auto-generated method stub

        }

}