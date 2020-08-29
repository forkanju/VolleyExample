package com.forkan.json_volley3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import static com.forkan.json_volley3.MainActivity.EXTRA_CREATOR;
import static com.forkan.json_volley3.MainActivity.EXTRA_LIKES;
import static com.forkan.json_volley3.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView mCreator;
    private TextView mLikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().hide();

        imageView = findViewById(R.id.image_view_detail);
        mCreator = findViewById(R.id.txt_view_creator_detail);
        mLikes = findViewById(R.id.txt_view_like_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        Picasso.get().load(imageUrl).fit().centerInside().into(imageView);
        mCreator.setText(creatorName);
        mLikes.setText("Likes: "+ likeCount);


    }
}