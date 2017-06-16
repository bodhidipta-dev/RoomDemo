package com.android.example.roomdemo.room;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.RoomDatabase;

import com.android.example.roomdemo.WheatherData;

/**
 * Created by bodhidipta on 06/06/17.
 */
@Database(entities = {ColumnInfoEntity.class,GraphEntitiy.class},version = 2)
public abstract class  DatabaseSpecs extends RoomDatabase {
    public abstract WheatherDAO wheatherDao();

}
