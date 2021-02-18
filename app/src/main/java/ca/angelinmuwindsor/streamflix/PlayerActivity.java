package ca.angelinmuwindsor.streamflix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //mVideoView.setPlayerListener(new MyFKPlayerCallback());
        //mPlayerView.play("THE_STREAM_ID");
    }
}
