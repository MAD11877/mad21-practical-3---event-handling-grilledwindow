package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Main Activity Created");

        TextView title = findViewById(R.id.title);
        title.setText("MAD " + getIntent().getIntExtra("rng", 0));
        User user = new User(false);

        Button followBtn = findViewById(R.id.follow_btn);
        followBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                user.setFollowed(!user.isFollowed());
                followBtn.setText(user.isFollowed() ? "Unfollow" : "Follow");

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(
                        MainActivity.this,
                        !user.isFollowed() ? "Unfollowed" : "Followed",
                        duration
                );
                toast.show();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }
}