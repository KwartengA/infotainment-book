package com.trykb.infotainmentbook.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.trykb.infotainmentbook.adapters.AdapterClass;
import com.trykb.infotainmentbook.ModelClass;
import com.trykb.infotainmentbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
   private ArrayList <ModelClass> arrayList;
   private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList <ModelClass> arrayList;
        AdapterClass adapterClass;

       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
       // recyclerView.setLayoutManager(new StaggeredGridLayoutManager((2,StaggeredGridLayoutManager.VERTICAL));

        arrayList = new ArrayList<>();

        ModelClass modelClass1 = new ModelClass("countries","The Countries");
        ModelClass modelClass2 = new ModelClass("leader", "The Leaders");
        ModelClass modelClass3 = new ModelClass("museums", "The Museums");
        ModelClass modelClass4 = new ModelClass("wonderss", "The  Wonders of the World");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter =  new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);
    }
}