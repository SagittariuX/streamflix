package ca.angelinmuwindsor.streamflix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StreamInfoActivity extends AppCompatActivity {

    private Button back_button;
    private Button broadcast_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_info);

        back_button  = (Button) findViewById(R.id.back_button_info);
        broadcast_button  = (Button) findViewById(R.id.broadcast_button_info);

        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadPrevious();
            }
        });

    }

    public void loadPrevious(){
        finish();
    }


}
