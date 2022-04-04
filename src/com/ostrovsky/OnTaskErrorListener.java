package com.ostrovsky;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
