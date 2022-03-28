package com.android.simpleapplicationoftest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 这里设置了setContentView()方法，来个当前活动加载一个布局
        // 之前在布局文件中添加的+@id/***,会在R文件中生成相应的资源id
        // R.layout.activity_main是activity_main.xml的id,然后将这个值传入setContentView()中
        setContentView(R.layout.activity_main);

        // 在onCreate方法中使用Toast
        // 定义一个Toast触发点

        // findViewById()方法用来获取在布局温文件中定义的元素，返回的是一个View对象，将其向下转成Button对象
        // 则得到是按钮的实例
        Button button1 = (Button) findViewById(R.id.button1);


        // 调用setOnClick()方法为按钮注册一个监听器，点击按钮则会执行监听器中的onClick方法
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 通过静态方法makeText创建一个Toast对象，然后调用show()，将Toast显示出来就可以了，makeText需要传入三个参数
                // 参数：活动、显示文字、显示时长
//                Toast.makeText(MainActivity.this,"You clicked Button 1",
//                Toast.LENGTH_LONG).show();

                //显示Intent
                //Intent (Context packageContext,Class<?>cls),这个构造函数接收两个参数，
                //第一个参数Context要求提供一个启动活动的上下文
                //第二个参数 Class 则是指定想要启动的目标活动
                // 通过这个构造函数就可以构建出Intent的“意图“
                //即在MainActivity这个活动的基础上打开SecondActivity这个活动，通过starActivity()方法来执行这个Intent

//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);


                //隐式Intent

//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//                Intent.addCatgory("com.example.activitytest.MY_CATEGORY");
//                startActivity(intent);

                //进一步使用隐式的Intent
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://cloud.tencent.com/developer/ask/sof/1070456"));
                startActivity(intent);



            }

        });

//        @Override
//        pubilc boolean onCreateOptionsMenu(Menu menu){
//
//        }

    }


}