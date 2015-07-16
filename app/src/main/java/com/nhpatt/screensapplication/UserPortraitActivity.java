package com.nhpatt.screensapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UserPortraitActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_portrait);

		findViewById(R.id.new_issue).setOnClickListener(this);
		findViewById(R.id.list_issues).setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		Class destination = v.getId() == R.id.new_issue ? DDLFormActivity.class : DDLListActivity.class;
		startActivity(new Intent(this, destination));
	}
}
