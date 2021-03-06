package alphagoldteamsquadron.com.binaryfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {
    //Convention for keys is to put company name as prefix
    public final static String EXTRA_MESSAGE = "com.alphagoldteamsquadron.binaryfun.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Ran when button is clicked
    public void startGame(View view) {
        Intent intent = new Intent(this, BinaryToDecimal.class);
        String message = "Bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts binaryToDecimal activity
        startActivity(intent);
    }

    public void startHexGame(View view) {
        Intent intent = new Intent(this, BinaryToHex.class);
        startActivity(intent);
    }

    //Ran when button is clicked
    public void startBinaryAdderGame(View view) {
        Intent intent = new Intent(this, BinaryAdder.class);
        String message = "Bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts binaryToDecimal activity
        startActivity(intent);
    }

    //Ran when button is clicked
    public void startBooleanTreeGame(View view) {
        Intent intent = new Intent(this, BooleanFun.class);
        String message = "Bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts binaryToDecimal activity
        startActivity(intent);
    }



    public void startLearnBinary(View view) {
        Intent intent = new Intent(this, LearnBinary.class);
        String message = "Learn about bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts activity
        startActivity(intent);
    }


    public void startLearnRepresentations(View view) {
        Intent intent = new Intent(this, LearnRepresentations.class);
        String message = "Learn about bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts activity
        startActivity(intent);
    }


    public void startLearnArithmetic(View view) {
        Intent intent = new Intent(this, LearnArithmetic.class);
        String message = "Learn about bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts activity
        startActivity(intent);
    }


    public void startLearnLogic(View view) {
        Intent intent = new Intent(this, LearnLogic.class);
        String message = "Learn about bananas!!!";
        //This is how we pass data to new activities
        intent.putExtra(EXTRA_MESSAGE, message);
        //Starts activity
        startActivity(intent);
    }
}
