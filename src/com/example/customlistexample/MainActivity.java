package com.example.customlistexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	ListView list;
	String[] web = {
			"Google Plus",
			"Twitter",
			"Windows",
			"Bing",
			"Itunes",
			"Wordpress",
			"Drupal"
	} ;
	Integer[] imageId = {
			R.drawable.imagen1,
			R.drawable.imagen2,
			R.drawable.imagen3,
			R.drawable.imagen4,
			R.drawable.imagen5,
			R.drawable.imagen6,
			R.drawable.imagen7
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CustomAdapter adapter = new CustomAdapter(MainActivity.this, web, imageId);
		list = (ListView)findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
			}
		});
	}
}