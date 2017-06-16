package com.android.example.roomdemo.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.LinkedList;

/**
 * Created by bodhidipta on 06/06/17.
 */

@Dao
public interface WheatherDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void inserWheather(ColumnInfoEntity... entity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertGraphData(GraphEntitiy entitiy);

    @Query("SELECT * FROM ColumnInfoEntity ")
    ColumnInfoEntity[] getAllInfor();

    @Query("select * from ColumnInfoEntity where date_of_week = :date_of_entry")
    ColumnInfoEntity[] getAllInforByDate(String date_of_entry);

}
