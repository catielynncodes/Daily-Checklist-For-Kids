package com.shorelineapps.dailychecklistforkids;

import android.content.Context;
import android.media.MediaRecorder;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.shorelineapps.dailychecklistforkids.R;

import java.util.ArrayList;

/**
 * {@link TaskAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Task} objects.
 */

public class TaskAdapter extends ArrayAdapter<Task>  {

    //Resource ID for the background color for this list of tasks.
    private int mColorResourceId;

    /**
     * Create a new {@link TaskAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tasks is the list of {@link Task}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public TaskAdapter(Context context, ArrayList<Task> tasks, int colorResourceId) {
        super(context, 0, tasks);
        mColorResourceId = colorResourceId;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Task} object located at this position in the list
        Task currentTask = getItem(position);

        // Find the checkbox in the list_item.xml layout with the ID task_checkbox.
        CheckBox checkbox = (CheckBox) listItemView.findViewById(R.id.task_checkbox);

        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        checkbox.setChecked(currentTask.getTaskCheckbox());

        // Find the TextView in the list_item.xml layout with the ID task_name.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.task_name);

        // Get the task name from the currentTask object and set this text on
        // the name TextView.
        nameTextView.setText(currentTask.getTaskNameId());

        //Set the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.task_container);
        //Find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View.
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 1 CheckBox and 1 TextView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}