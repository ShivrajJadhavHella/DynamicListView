package com.example.dynamiclistview;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ManageItemsAdapter extends ArrayAdapter<String> {

    private final Context context;
    //private final String[] values;

    private final ArrayList<String> objects;

    public ManageItemsAdapter(Context context, ArrayList<String> values) {
        super(context, R.layout.activity_main, values);
        this.context = context;
        this.objects = values;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.settings_text);



        /*toggleButton.setOnClickListener(new View.OnClickListener() {
            private final String[] values = getContext().getResources().getStringArray(R.array.Strings);

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), values[position] + " checked", Toast.LENGTH_LONG).show();
            }
        });*/

        //textView.setText(values[position]);

        textView.setText(objects.get(position));
        /*if(position == 0){
            switchbutton.setChecked(true);
        }*/

        return rowView;
    }
}
