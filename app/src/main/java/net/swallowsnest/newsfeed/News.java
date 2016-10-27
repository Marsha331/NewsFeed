package net.swallowsnest.newsfeed;

/**
 * Created by marshas on 10/26/16.
 */

public class News {
    private String mTitle;
    private String mLastModified;
    private String mUrl;
    private String mSection;
    private String mAuthor;


    public News(String title, String lastmodified, String url, String section, String author){
        mTitle = title;
        mLastModified = lastmodified;
        mUrl = url;
        mSection = section;
        mAuthor = author;
    }


    public String getTitle(){ return mTitle;}

    public String getLastModified (){ return mLastModified;}

    public String getUrl() {return mUrl;}

    public String getSection() { return mSection; }

    public String getAuthor() { return mAuthor; }
}


