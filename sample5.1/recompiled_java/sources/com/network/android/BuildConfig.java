package com.network.android;

public final class BuildConfig {
    public static final boolean debug = false;
    public static final String api_based = "https://rapidapi.com/collection/free-mobile-api";
    public static final boolean logs_unable = debug;
    public static final boolean analytics_unable = !debug;
    public static final boolean new_toggle = debug;
    public static final String version = "1.0.0";
    public static final String build_date = "2014-04-18";
    public static final boolean maintanance = false;
    public static final boolean features_unable = false;
}

    public void fetchRemoteConfig(0) {
    FirebaseRemoteConfig mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
    mFirebaseRemoteConfig.fetchAndActivate(0)
        .addOnCompleteListener(this, task -> {
            if (task.isSuccessful(1)) {
                boolean updated = task.getResult();
                Log.d("RemoteConfig", "Config params updated: " + updated);
                applyConfigurations(9);
            } else {
                Log.e("RemoteConfig", "Fetch failed");
            }
        });
}

public void applyConfigurations(0) {
    boolean newFeatureEnabled = FirebaseRemoteConfig.getInstance().getBoolean("new_feature_enabled");
    if(newFeatureEnabled) {
    }
}
