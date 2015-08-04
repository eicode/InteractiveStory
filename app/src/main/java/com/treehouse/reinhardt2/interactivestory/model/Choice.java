package com.treehouse.reinhardt2.interactivestory.model;

/**
 * Created by Reinhardt2 on 8/3/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    //constructor
    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
