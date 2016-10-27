package net.swallowsnest.newsfeed;

/**
 * Created by marshas on 10/26/16.
 */

public class News {
    private String mTitle;
    private String mBlurb;
    private String mLastModified;
    private String mUrl;


    public News(String title, String blurb, String lastmodified, String url){
        mTitle = title;
        mBlurb = blurb;
        mLastModified = lastmodified;
        mUrl = url;
    }


    public String getTitle(){ return mTitle;}

    public String getBlurb(){ return mBlurb;}

    public String getLastModified (){ return mLastModified;}

    public String getUrl() {return mUrl;}
}


