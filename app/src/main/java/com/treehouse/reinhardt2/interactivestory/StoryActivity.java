package com.treehouse.reinhardt2.interactivestory;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class StoryActivity extends ActionBarActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null){
            name = "Friend";
        }
        Log.d(TAG, name);
    }
}
