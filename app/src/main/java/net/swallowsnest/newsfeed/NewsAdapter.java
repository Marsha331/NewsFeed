package net.swallowsnest.newsfeed;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by marshas on 10/26/16.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> stories) {
        super(context, 0, stories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        // Get the object located at this position in the list
        final News news = getItem(position);


        // Find the TextView in the list_item.xml layout
        TextView headlineTextView = (TextView) listItemView.findViewById(R.id.title);
        // Set the text on the TextView
        headlineTextView.setText(news.getTitle());

        // Find the TextView in the list_item.xml layout
        TextView blurbTextTextView = (TextView) listItemView.findViewById(R.id.story_blurb);
        // Set the text on the TextView
        blurbTextTextView.setText(news.getBlurb());

        TextView lastModifiedTextView = (TextView) listItemView.findViewById(R.id.date);
        lastModifiedTextView.setText(news.getLastModified());


        LinearLayout listItemContainerView = (LinearLayout) listItemView.findViewById(R.id.news_item);
        listItemContainerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse
                        (news.getUrl())));
            }
        });

        return listItemView;
    }
}

