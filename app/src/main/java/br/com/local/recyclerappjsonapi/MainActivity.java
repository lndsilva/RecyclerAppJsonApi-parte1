package br.com.local.recyclerappjsonapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    List<ListarItens> itensList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.idRecyclerView);
        recyclerView.hasFixedSize();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itensList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            ListarItens listarItens = new ListarItens(
                    "Cabeçalho " + i,
                    "Testando descrição"
            );

            itensList.add(listarItens);
        }

        adapter = new MyAdapter(itensList, this);

        recyclerView.setAdapter(adapter);
    }
}