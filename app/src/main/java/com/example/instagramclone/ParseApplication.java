package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("W4p8ywsbVOEFiLjkdrgceEk30kDM8UGco6mYA4HL")
                .clientKey("U2DOkZoTYocNXZUHwuujb2gmz2TmOJMQNK4IXmLq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
