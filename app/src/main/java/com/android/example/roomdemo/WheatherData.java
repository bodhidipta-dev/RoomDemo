package com.android.example.roomdemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.util.Log;

import com.android.example.roomdemo.pojo.MeteoData;

/**
 * Created by bodhidipta on 05/06/17.
 */

public class WheatherData extends LiveData<MeteoData> {
    private static WheatherData instance = null;
    private Context mContext;

    @MainThread
    public static WheatherData get(Context mContext) {
        if (instance == null)
            instance = new WheatherData(mContext);

        return instance;
    }

    private WheatherData(Context context) {
        mContext = context;
    }

    @Override
    protected void onActive() {
        super.onActive();
        Log.i("LFC_AWARE", "Life Data is ## onActive State");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        Log.i("LFC_AWARE", "Life Data is ## onInactive State");
    }

    /**
     * Sets the value. If there are active observers, the value will be dispatched to them.
     * <p>
     * This method must be called from the main thread. If you need set a value from a background
     * thread, you can use {@link #postValue(Object)}
     *
     * @param value The new value
     */
    @Override
    protected void setValue(MeteoData value) {
        super.setValue(value);
        Log.i("LFC_AWARE", "Life Data on the ## setValue ");

    }
}
