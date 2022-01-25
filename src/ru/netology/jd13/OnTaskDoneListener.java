package ru.netology.jd13;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
