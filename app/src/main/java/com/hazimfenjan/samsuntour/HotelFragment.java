package com.hazimfenjan.samsuntour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
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
        places.add(new Places(R.drawable.hotel1,R.string.Hotel_1_title,R.string.Hotel_1_desc,R.string.Hotel_1_location,R.string.Hotel_1_time,R.string.Hotel_1_phone));
        places.add(new Places(R.drawable.hotel2,R.string.Hotel_2_title,R.string.Hotel_2_desc,R.string.Hotel_2_location,R.string.Hotel_2_time,R.string.Hotel_2_phone));
        places.add(new Places(R.drawable.holtel3,R.string.Hotel_3_title,R.string.Hotel_3_desc,R.string.Hotel_3_location,R.string.Hotel_3_time,R.string.Hotel_3_phone));
        places.add(new Places(R.drawable.hotel4,R.string.Hotel_4_title,R.string.Hotel_4_desc,R.string.Hotel_4_location,R.string.Hotel_4_time,R.string.Hotel_4_phone));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;

    }
}
