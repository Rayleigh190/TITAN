package com.mycompany.jin;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.content.*;
import android.net.*;
import android.app.Activity.*;
import android.media.MediaPlayer.*;
import android.os.Bundle.*;
import android.app.Activity.*;
import android.app.AlertDialog.*;
import android.content.DialogInterface.*;
import android.os.Bundle.*;
import android.view.View.*;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.webkit.*;
import android.media.*;
import android.widget.Toast.*;
import android.app.Activity;
import android.widget.EditText.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.util.Log;
import android.content.*;

public class MainActivity extends Activity
{
public boolean onKeyDown(int
						  KeyCode, KeyEvent event) {
		super.onKeyDown(KeyCode, event);
		if (event.getAction() ==
			KeyEvent.ACTION_DOWN) {
			switch (KeyCode) {
				case KeyEvent.KEYCODE_BACK: // 뒤로 키와 같은 기능을 한다.
					AlertDialog.Builder builder = new AlertDialog.Builder(this);
					builder.setTitle("종료");
					builder.setMessage("종료하시겠습니까?");
					builder.setNegativeButton("확인",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface
												dialog, int which) {
								finish();}});
					builder.setPositiveButton("취소", new
						DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface
												dialog, int which) {}});
					builder.show();}}
		return false;}

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
		
        super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.main);
		
		Toast.makeText(this,"ver.1.1",Toast.LENGTH_LONG).show();
		
		startActivity(new Intent(this, SplashActivity.class));
		
		new AlertDialog.Builder(this).setCancelable(true).setTitle("공지").setMessage("*무단 배포를 금합니다.\n*무단 수정 및 변조를 금합니다.\n\n※동영상 모든 기능은 인터넷 연결이 필요합니다.\n\n문의 : dnwls8462@naver.com\n").setNeutralButton("",null) .setNeutralButton("확인",null).show();
		
		{Button Button1 = (Button) findViewById(R.id.Button00);

			Button1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
						Intent i=new Intent(MainActivity.this,m1.class);
						startActivity(i);}
		
					{Button Button1 = (Button) findViewById(R.id.Button0); Button1.setOnClickListener(new OnClickListener() { public void onClick(View v) { Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.blog.naver.com/dnwls8462/60196835242")); startActivity(myIntent);}

			{Button Button1 = (Button) findViewById(R.id.Button000); Button1.setOnClickListener(new OnClickListener() { public void onClick(View v) { Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.fengyunzhibo.com/tv/380789_1361122482222-q3qq1sn4.htm")); startActivity(myIntent);}
 
						{Button Button1 = (Button) findViewById(R.id.Button0000);

							Button1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
										Intent i=new Intent(MainActivity.this,m2.class);
										startActivity(i);}
 
 
 
 });
}});}});}});}}}
