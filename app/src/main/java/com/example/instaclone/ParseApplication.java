package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("G2i1nPFFiNuHOmp6vMQKE1pnOKXhxx5wJXPh3rPY")
                .clientKey("Nz7giTkVmV2xG5FaSaNqOMNPTzvpjyeDP0mGgMDb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
