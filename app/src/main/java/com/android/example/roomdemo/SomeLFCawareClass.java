package com.android.example.roomdemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.util.Log;


/**
 * Created by bodhidipta on 05/06/17.
 */

@SuppressWarnings("ALL")
public class SomeLFCawareClass implements LifecycleObserver {
    private Context mcontext;

    public SomeLFCawareClass(Context context) {
        mcontext = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void oncreate() {
        Log.i("LFC_AWARE", "On Life Aware class its on the ********>>>>>> ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart() {
        Log.i("LFC_AWARE", "On Life Aware class its on the ********>>>>>> ON_START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        Log.i("LFC_AWARE", "On Life Aware class its on the ********>>>>>> ON_RESUME");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        Log.i("LFC_AWARE", "On Life Aware class its on the ********>>>>>> ON_PAUSE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        Log.i("LFC_AWARE", "On Life Aware class its on the ********>>>>>> ON_STOP");
    }
}
