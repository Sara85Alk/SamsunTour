package com.hazimfenjan.samsuntour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places>{

    public PlacesAdapter(Context context, ArrayList<Places> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Places currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        assert currentPlace != null;
        imageView.setImageResource(currentPlace.getImageResorceId());

        // Find the TextView in the list_item.xml layout with the ID title_text.
        TextView titleTextView = listItemView.findViewById(R.id.title_text);
        titleTextView.setText(currentPlace.getTitleId());

        // Find the TextView in the list_item.xml layout with the ID description__text.
        TextView descriptionTextView = listItemView.findViewById(R.id.description__text);
        descriptionTextView.setText(currentPlace.getDescriptionId());

        // Find the TextView in the list_item.xml layout with the ID location__text.
        TextView locationTextView = listItemView.findViewById(R.id.location_text);
        locationTextView.setText(currentPlace.getLocationId());

        // Find the TextView in the list_item.xml layout with the ID time__text.
        TextView timeTextView = listItemView.findViewById(R.id.time_text);
        timeTextView.setText(currentPlace.getTimeId());

        // Find the TextView in the list_item.xml layout with the ID phone__text.
        TextView costTextView = listItemView.findViewById(R.id.phone_text);
        costTextView.setText(currentPlace.getPhoneId());

        // Return the whole list item layout.
        return listItemView;
    }

}
