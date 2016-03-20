package com.illuzor.logextension.functions;

import com.adobe.fre.*;
import android.util.Log;

public class LogFuntion implements FREFunction {

    @Override
    public FREObject call(FREContext context, FREObject[] args) {
        try {
            String type = args[0].getAsString();
            String tag = args[1].getAsString();
            String message = args[2].getAsString();

            switch (type) {
                case "e":
                    Log.e(tag, message);
                    break;
                case "d":
                    Log.d(tag, message);
                    break;
                case "i":
                    Log.i(tag, message);
                    break;
                case "v":
                    Log.v(tag, message);
                    break;
                case "w":
                    Log.w(tag, message);
                    break;
                case "wtf":
                    Log.wtf(tag, message);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}