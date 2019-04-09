package cz.czechitas.janhanak.czechitas3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Animal animal = getIntent().getParcelableExtra("data");
        setTitle(animal.name);
    }
}
