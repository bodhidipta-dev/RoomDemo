package com.android.example.roomdemo;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.android.example.roomdemo.room.DatabaseSpecs;

/**
 * Created by bodhidipta on 06/06/17.
 */

public class AppUtil extends Application {
    private static AppUtil ourInstance = null;

    public static AppUtil getInstance() {
        return ourInstance;
    }
    private DatabaseSpecs db;

    @Override
    public void onCreate() {
        super.onCreate();
        ourInstance = this;
        db = Room.databaseBuilder(getApplicationContext(),
                DatabaseSpecs.class, "demo-one").build();
    }

    public DatabaseSpecs getDatabaseInstance() {
        return db;
    }
}
