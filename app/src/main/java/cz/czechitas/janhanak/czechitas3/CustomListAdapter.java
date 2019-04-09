package cz.czechitas.janhanak.czechitas3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;
    private final ArrayList<Animal> animals;


    public CustomListAdapter(Activity context, ArrayList<Animal> animals) {
        super(context, R.layout.list_item, animals);
        this.context = context;
        this.animals = animals;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);

        //this code gets references to objects in the list_item.xml file
        TextView name = rowView.findViewById(R.id.name);
        TextView info = rowView.findViewById(R.id.info);
        ImageView icon = rowView.findViewById(R.id.icon);

        //this code sets the values of the objects to values from the arrays
        name.setText(animals.get(position).name);
        info.setText(animals.get(position).name);
        icon.setImageResource(animals.get(position).image);

        return rowView;

    };
}
