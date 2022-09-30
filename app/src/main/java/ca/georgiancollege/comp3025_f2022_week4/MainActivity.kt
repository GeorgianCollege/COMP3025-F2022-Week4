package ca.georgiancollege.comp3025_f2022_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    var ResultLabel: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ResultLabel = findViewById<TextView>(R.id.Result_TextView)
    }

    fun NumberButtons(view: View)
    {
        val buttonInfo = view as Button
        val buttonText = buttonInfo.text
        if(ResultLabel?.text == "0")
        {
            ResultLabel?.text = buttonText
        }
        else
        {
            if (buttonText == ".")
            {
                if(ResultLabel?.text?.contains(".") != true)
                {
                    ResultLabel?.text = ResultLabel?.text.toString().plus(buttonText)
                }
            }
            else
            {
                ResultLabel?.text = ResultLabel?.text.toString().plus(buttonText)
            }
        }


    }

    fun OperatorButtons(view: View)
    {
        val buttonInfo = view as Button


    }

    fun ExtraButtons(view: View)
    {
        val buttInfo = view as Button


    }

}