package kr.co.octsun.oscamera.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class ScreenManager {

    public static int getPixelValue(Context context, int dp)
    {
        Resources resources = context.getResources();
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp,
                resources.getDisplayMetrics()
        );
    }
}
