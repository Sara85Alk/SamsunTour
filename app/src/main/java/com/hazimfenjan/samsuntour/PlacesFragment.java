package com.hazimfenjan.samsuntour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // create a list of words
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.drawable.atatork,R.string.places_1_title,R.string.places_1_desc,R.string.place_1_location,R.string.place_1_time,R.string.place_1_phone));
        places.add(new Places(R.drawable.place2,R.string.places_2_title,R.string.places_2_desc,R.string.place_2_location,R.string.place_2_time,R.string.place_2_phone));
        places.add(new Places(R.drawable.place4,R.string.places_3_title,R.string.places_3_desc,R.string.place_3_location,R.string.place_3_time,R.string.place_3_phone));
        places.add(new Places(R.drawable.place3,R.string.places_1_title,R.string.places_1_desc,R.string.place_1_location,R.string.place_1_time,R.string.place_1_phone));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.places_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
