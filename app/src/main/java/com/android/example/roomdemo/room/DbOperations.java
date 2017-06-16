package com.android.example.roomdemo.room;

import android.icu.text.SimpleDateFormat;
import android.os.AsyncTask;

import com.android.example.roomdemo.AppUtil;

import java.util.Date;

/**
 * Created by bodhidipta on 06/06/17.
 */

public class DbOperations {
    private DbOperations() {
    }

    public static DbOperations getInstance() {
        return new DbOperations();
    }

   public void checkFilesForDate(String date, final OnCheckingFound callback) {
        new AsyncTask<String, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(String... params) {
                try {
                    ColumnInfoEntity[] arr = AppUtil.getInstance().getDatabaseInstance().wheatherDao().getAllInforByDate(params[0]);
                    if (arr == null)
                        return false;
                    else if (arr.length > 0)
                        return true;
                    else
                        return false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }

            }

            @Override
            protected void onPostExecute(Boolean aBoolean) {
                super.onPostExecute(aBoolean);
                callback.resultFound(aBoolean);

            }
        }.execute(date);
    }

    public interface OnCheckingFound {
        void resultFound(boolean result);
    }
}
