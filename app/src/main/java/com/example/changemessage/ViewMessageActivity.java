package com.example.changemessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ViewMessageActivity extends AppCompatActivity {

    private static final String TAG = "ViewMessageActivity";

    /**
    * Método callback que crea la activity
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se inicializa la interfaz
        setContentView(R.layout.activity_view_message);
        ///TODO Inicializar los widget
        Log.i(TAG, "ViewMessageActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "ViewMessageActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "ViewMessageActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "ViewMessageActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "ViewMessageActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ViewMessageActivity: onDestroy()");
    }
}