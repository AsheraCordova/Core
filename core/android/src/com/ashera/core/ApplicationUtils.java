//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.core;

import android.app.Activity;

public class ApplicationUtils {
    
   /**
     * Method to Check if the application is running.
     *
     * @param context
     *            context.
     * @return true if app running.
     */
    public static boolean isAppRunning(android.content.Context context) {
        android.app.ActivityManager manager = (android.app.ActivityManager) context.getSystemService(Activity.ACTIVITY_SERVICE);
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTaskInfos = manager.getRunningTasks(Integer.MAX_VALUE);
        boolean found = false;

        for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : runningTaskInfos) {
            android.content.ComponentName componentInfo = runningTaskInfo.topActivity;

            if (componentInfo.getPackageName().equals(context.getPackageName())) {
                found = true;
                break;
            }
        }

        return found;
    }
}
