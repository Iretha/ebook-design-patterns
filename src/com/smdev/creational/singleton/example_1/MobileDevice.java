package com.smdev.creational.singleton.example_1;

import java.util.HashMap;
import java.util.Map;

public class MobileDevice {

    /**
     * Volatile is used to indicate that a variable's value will be modified by different threads
     */
    private static volatile MobileDevice instance = null;

    private Map<String, MobileApp> runningApps = new HashMap<>();

    private MobileApp appOnFocus;


    private MobileDevice() {
    }

    public static MobileDevice getInstance() {
        if (instance == null) {
            synchronized (MobileDevice.class) {
                if (instance == null) {
                    instance = new MobileDevice();
                }
            }
        }
        return instance;
    }

    public synchronized void runApp(String appName, boolean moveToFocus) {
        MobileApp app = this.runningApps.get(appName);
        if (app == null) {
            app = new MobileApp(appName);
            this.runningApps.put(appName, app);
            app.runInBackground();
        }

        if (moveToFocus) {
            focusApp(appName);
        }
    }

    public synchronized void focusApp(String appName) {
        MobileApp app = this.runningApps.get(appName);
        if (app == null) {
            return;
        }

        if (this.appOnFocus != null) {
            this.appOnFocus.moveToBackground();
        }
        this.appOnFocus = app;
        this.appOnFocus.moveToFocus();
    }

    public synchronized void stopApp(String appName) {
        MobileApp app = this.runningApps.get(appName);
        if (app == null) {
            return;
        }

        if (this.appOnFocus != null && this.appOnFocus.equals(app)) {
            this.appOnFocus = null;
        }

        this.runningApps.remove(appName);
        app.stop();
    }
}
