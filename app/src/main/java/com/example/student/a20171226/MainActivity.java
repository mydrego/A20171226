package com.example.student.a20171226;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click1(View view) {
        File file = getFilesDir();
        File filecache = getCacheDir();
        Log.d ("LOGD1" , file.toString());
        Log.d ("LOGD1" , filecache.toString());
        File myfile = new File(file, "myfile.txt");
        try {
            FileWriter fileWriter = new FileWriter(myfile);
            fileWriter.write("1234qwer");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
