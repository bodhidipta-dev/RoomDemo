package com.android.example.roomdemo;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.LifecycleRegistryOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import java.text.SimpleDateFormat;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.example.roomdemo.pojo.MeteoData;
import com.android.example.roomdemo.room.DbOperations;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements LifecycleRegistryOwner {
    SomeLFCawareClass observerClass = null;
    LifecycleRegistry mLifecycleRegistry = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLifecycleRegistry = new LifecycleRegistry(this);
        observerClass = new SomeLFCawareClass(MainActivity.this);
        getLifecycle().addObserver(observerClass);
        final MeteoViewMode mode = ViewModelProviders.of(this).get(MeteoViewMode.class);


        DbOperations.getInstance().checkFilesForDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()),new DbOperations.OnCheckingFound(){
            @Override
            public void resultFound(boolean result) {
                Log.i("LFC_AWARE", "Result on database : "+result);
                if (result){

                }else{
                    mode.loadData();
                }
            }
        });

        findViewById(R.id.text_refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode.loadData();
            }
        });


        mode.getLiveDataObserver().observe(this, new Observer<MeteoData>() {
            @Override
            public void onChanged(@Nullable MeteoData meteoData) {
                Log.i("LFC_AWARE", "On main Activity meteo data has been changed");



            }
        });
    }

    @Override
    public LifecycleRegistry getLifecycle() {
        return mLifecycleRegistry;
    }
}
