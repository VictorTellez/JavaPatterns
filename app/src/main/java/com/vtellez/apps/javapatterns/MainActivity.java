package com.vtellez.apps.javapatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vtellez.apps.design.patterns.factory.method.FactoryMethodUseCase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFactoryUseCase();
    }

    private void getFactoryUseCase(){
        FactoryMethodUseCase factoryMethodUseCase = new FactoryMethodUseCase();
    }
}
