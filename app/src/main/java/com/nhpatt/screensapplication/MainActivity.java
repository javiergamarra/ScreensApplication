package com.nhpatt.screensapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;

public class MainActivity extends AppCompatActivity implements LoginListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login);
		loginScreenlet.setListener(this);

		((EditText) findViewById(R.id.liferay_login)).setText("push1@liferay.com");
		((EditText) findViewById(R.id.liferay_password)).setText("push2");
	}

	@Override
	public void onLoginSuccess(final User user) {
		startActivity(new Intent(this, DDLFormActivity.class));
	}

	@Override
	public void onLoginFailure(final Exception e) {

	}
}
