package example.project3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Chronometer;

public class SecondActivity extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Chronometer clock = findViewById(R.id.chronometer2);
        clock.start();
    }

    public void openA3(View view){
        startActivity(new Intent(this, ThirdActivity.class));
    }
}