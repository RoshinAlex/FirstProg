package com.example.popupex;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class MainActivity extends Activity implements OnMenuItemClickListener {

	RelativeLayout rel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		rel=(RelativeLayout)findViewById(R.id.relate);
    }


    public void changeColor(View v){
    	PopupMenu popup = new PopupMenu(this, v);
    	popup.setOnMenuItemClickListener(this);
    	popup.getMenuInflater().inflate(R.menu.mymenu, popup.getMenu());
    	popup.show();
    	
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public boolean onMenuItemClick(MenuItem item) {
		
		switch(item.getItemId()){
		
		case R.id.itm1:
			rel.setBackgroundColor(Color.RED);
			Toast.makeText(getApplicationContext(), "Changed to Red", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.itm2:
			rel.setBackgroundColor(Color.GREEN);
			Toast.makeText(getApplicationContext(), "Changed to Green", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.itm3:
			rel.setBackgroundColor(Color.BLUE);
			Toast.makeText(getApplicationContext(), "Changed to Blue", Toast.LENGTH_SHORT).show();
			return true;
		
	}
		
		return false;
	}
    
}
