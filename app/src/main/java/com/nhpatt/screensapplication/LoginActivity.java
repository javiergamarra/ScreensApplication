package com.nhpatt.screensapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;

public class LoginActivity extends AppCompatActivity implements LoginListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login);
		loginScreenlet.setListener(this);

		setDefaultLoginAndPassword();
	}

	private void setDefaultLoginAndPassword() {
		EditText login = (EditText) findViewById(R.id.liferay_login);
		login.setText(getString(R.string.default_login));

		EditText password = (EditText) findViewById(R.id.liferay_password);
		password.setText(getString(R.string.default_password));
	}

	@Override
	public void onLoginSuccess(final User user) {
		startActivity(new Intent(this, UserPortraitActivity.class));
	}

	@Override
	public void onLoginFailure(final Exception e) {

	}

	public void goToForgotPassword(View view) {
		startActivity(new Intent(this, ForgotPasswordActivity.class));
	}

	public void goToSignUp(View view) {
		startActivity(new Intent(this, SignUpActivity.class));
	}


	public void goToOAuthLogin(View view) {
		startActivity(new Intent(this, OAuthActivity.class));
	}
}
