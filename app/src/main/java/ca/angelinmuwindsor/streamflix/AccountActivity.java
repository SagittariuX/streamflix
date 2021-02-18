package ca.angelinmuwindsor.streamflix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }


    public void loadStreamInfo(View view) {
        Intent intent = new Intent(this, StreamInfoActivity.class);
        startActivity(intent);
    }

    public void loadStreams(View view) {
        Intent intent = new Intent(this, GroupsActivity.class);
        startActivity(intent);
    }

    public void logOut(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
        Toast.makeText(this, "Logged Out.",Toast.LENGTH_SHORT);
    }
}
