package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Click {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Person> list = new ArrayList<>();
        list.add(new Person("parviz","parastooei"));
        list.add(new Person("sara","bahrami"));
        list.add(new Person("leila","hatami"));
        list.add(new Person("shahab","hoseini"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(list,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));


    }





    @Override
    public void clicked(String family) {
        Toast.makeText(this, family, Toast.LENGTH_SHORT).show();


    }
}
