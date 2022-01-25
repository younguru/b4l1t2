package ru.netology.jd13;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
