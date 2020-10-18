package com.example.changemessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * <h1>Función de la clase</h1>
 * <p>Esta clase envía un texto a otra avtivity y le indica el tamaño del texto</p>
 * <h2>Aprendizaje</h2>
 * <ul>
        <li>Qué es context</li>
        <li>Que se puede introducir etiquetas html desntro de los comentarios javadoc</li>
        <li>Qué es un objeto {@link android.os.Bundle}</li>
        <li>El paso de mensajes entre dos activitys mediante la clase <a target=" blank" href="https://developer.android.com/reference/android/content/Intent"></li>
 * </ul>
 * @author Angel Galvez del Postigo Campos
 * @version 1.0
 * @see ViewMessageActivity#onCreate(Bundle)
 */
public class SendMessageActivity extends AppCompatActivity {

    private static final String TAG = "SendMessageActivity";
    private Button btSendMessage;
    private EditText edMessage;
    private SeekBar skSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendmessage);
        edMessage=findViewById(R.id.edMessage);
        skSize=findViewById(R.id.skSize);
        btSendMessage= findViewById(R.id.btSendMessage);
        btSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 //1. Crear un objeto contenedor o Bundle para añdir los datos
                Bundle bundle = new Bundle();
                bundle.putString("message", edMessage.getText().toString());
                bundle.putInt("size", skSize.getProgress());

                //2. Se crea el objeto Intent explícito se conoce la Activity origen y la Activity destino
                Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);

                //3. Añadir el objeto Bundle al Intent
                intent.putExtras(bundle);

                //4. Iniciar la activity desitno ViewMessageActivity
                startActivity(intent);
            }
        });

        Log.i(TAG, "SendMessageActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SendMessageActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "SendMessageActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SendMessageActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SendMessageActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SendMessageActivity: onDestroy()");
    }


}