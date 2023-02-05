package com.example.fileupdate;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String APK_TEMP_FILE_NAME = "app-debug.apk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Watch for button clicks.
        Button button = (Button) findViewById(R.id.installBtn);
        File tempFile = new File(getExternalCacheDir(), APK_TEMP_FILE_NAME);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = FileProvider.getUriForFile(MainActivity.this, BuildConfig.APPLICATION_ID, tempFile);
//                Uri uri = Uri.fromFile(tempFile);
                Log.d(TAG, "commit3: " + uri);
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + getExternalCacheDir());
                Log.d(TAG, "commit3: " + tempFile);
                Log.d(TAG, "commit3: " + BuildConfig.APPLICATION_ID);
                Intent intent = new Intent(Intent.ACTION_VIEW);
//                            Uri uri = Uri.fromFile(tempFile);
                intent.setDataAndType(uri, "application/vnd.android.package-archive");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(intent);
//                finish();
            }
        });
    }
}