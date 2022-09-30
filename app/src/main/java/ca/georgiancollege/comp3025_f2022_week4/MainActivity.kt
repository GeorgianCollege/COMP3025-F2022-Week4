package ca.georgiancollege.comp3025_f2022_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ResultLabel = findViewById(R.id.Result_TextView) as TextView


        // named event handler
        fun NumberButtons(view: View)
        {
            val buttonInfo = view as Button

            println(buttonInfo.text)
        }

        fun OperatorButtons(view: View)
        {
            val buttonInfo = view as Button

            println(buttonInfo.text)
        }


        findViewById<Button>(R.id.Clear_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Plus_Minus_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Percent_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Divide_Button).setOnClickListener { view -> OperatorButtons(view) }
    }
}