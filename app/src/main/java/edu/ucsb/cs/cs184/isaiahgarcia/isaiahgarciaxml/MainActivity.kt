package edu.ucsb.cs.cs184.isaiahgarcia.isaiahgarciaxml

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import java.util.ArrayList
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        val buttonList = ArrayList<Button>()
        buttonList.add(findViewById<Button>(R.id.button1) as Button)
        buttonList.add(findViewById<Button>(R.id.button2) as Button)
        buttonList.add(findViewById<Button>(R.id.button3) as Button)
        buttonList.add(findViewById<Button>(R.id.button4) as Button)
        buttonList.add(findViewById<Button>(R.id.button5) as Button)
        buttonList.add(findViewById<Button>(R.id.button6) as Button)
        buttonList.add(findViewById<Button>(R.id.button7) as Button)
        buttonList.add(findViewById<Button>(R.id.button8) as Button)
        buttonList.add(findViewById<Button>(R.id.button9) as Button)
        val tv = findViewById<View>(R.id.text_view) as TextView

        for (i in buttonList) {
            val j = buttonList.indexOf(i) + 1
            i.setOnClickListener {tv.text = "Button $j"}
        }
    }
}
