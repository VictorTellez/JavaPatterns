package com.vtellez.apps.javapatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vtellez.apps.javapatterns.factory.FactoryUseCase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFactoryUseCase();
    }

    private void getFactoryUseCase(){
        FactoryUseCase factoryUseCase = new FactoryUseCase();
    }
}
