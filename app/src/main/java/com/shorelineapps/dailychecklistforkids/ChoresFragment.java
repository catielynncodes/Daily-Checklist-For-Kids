package com.shorelineapps.dailychecklistforkids;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of self care activities.
 */
public class ChoresFragment extends Fragment {


    public ChoresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.task_list, container, false);

        // Create a default list of chore tasks
        final ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task(false, R.string.chores_1));
        tasks.add(new Task(false, R.string.chores_2));
        tasks.add(new Task(false, R.string.chores_3));
        tasks.add(new Task(false, R.string.chores_4));
        tasks.add(new Task(false, R.string.chores_5));
        tasks.add(new Task(false, R.string.chores_6));

        // Create an {@link TaskAdapter}, whose data source is a list of {@link Task}s. The
        // adapter knows how to create list items for each item in the list.
        TaskAdapter adapter = new TaskAdapter(getActivity(), tasks, R.color.category_chores);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // task_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Task} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
