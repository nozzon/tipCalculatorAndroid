package com.example.tipcalculator;




import com.example.tipcalculator.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText AmountText,PercentageText;
	TextView tipText;
	Button  calculateBtn;
	int percent;
	double amount, tip;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AmountText = (EditText)findViewById(R.id.amount);
		PercentageText = (EditText)findViewById(R.id.percentage);
		tipText = (TextView)findViewById(R.id.tipAmt);
		calculateBtn = (Button) findViewById(R.id.calculateBtn);
		calculateBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) 
            {
            	amount  = Double.parseDouble(AmountText.getText().toString());
        		percent = Integer.parseInt(PercentageText.getText().toString());
        		tip = amount*(percent*.01);
        		tipText.setText(""+tip);
            }
        });
	    
		
	        
	       
		
	}
	
    
	

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		int num;
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
