package com.shorelineapps.dailychecklistforkids;

/**
 * {@link Task} represents a task that the user is wanting to complete on their list.
 */
public class Task {

    /** Checkbox representing whether the task was done or not */
    private boolean mTaskCheckbox;

    /** Name of the task */
    private int mTaskNameId;

    /**
     * Create a new Word object.
     *
     * @param taskCheckbox is the boolean that tells whether the task is complete or not
     * @param taskNameId is the name of the task
     */
    public Task(boolean taskCheckbox, int taskNameId) {
        mTaskCheckbox = taskCheckbox;
        mTaskNameId = taskNameId;
    }

    // Get the default translation of the word.
    public boolean getTaskCheckbox() {
        return mTaskCheckbox;
    }

    // Get the Miwok translation of the word.
    public int getTaskNameId() {
        return mTaskNameId;
    }
}