package com.course.schneidermemorycolor.dagger;

import android.app.Application;

/**
 * Created by ernestschneiderolcina on 20/3/18.
 */

public class MemoryColor extends Application {

    private static MemoryComponent mMemoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMemoryComponent = DaggerMemoryComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static MemoryComponent getMemoryComponent() {
        return mMemoryComponent;
    }
}
