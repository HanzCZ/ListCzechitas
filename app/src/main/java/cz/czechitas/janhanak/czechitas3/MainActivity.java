package cz.czechitas.janhanak.czechitas3;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.bear, "BEAR", "Big Scary Bear"));
        animals.add(new Animal(R.drawable.horse, "HORSE", "its fun to ride"));

        CustomListAdapter adapter = new CustomListAdapter(this, animals);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,
                        DetailActivity.class);
                intent.putExtra("data", animals.get(position));
                MainActivity.this.startActivity(intent);
            }
        });

    }
}
