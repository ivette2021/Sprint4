package com.example.sprint4_cv;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.sprint4_cv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private com.example.sprint4_cv.databinding.ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding.profileImage.setImageResource(R.drawable.profile_picture); // Replace with your own image
//        binding.nameTextView.setText("Ivette Valdivia");
  //      binding.professionTextView.setText("Automation and Robotics Engineer");
    //    binding.experienceTextView.setText("1 years of experience");
     //   binding.motivationTextView.setText("Never Stop Learning");
    }
    public void openSecondActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
