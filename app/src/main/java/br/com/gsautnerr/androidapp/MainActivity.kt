// MainActivity.kt
package br.com.gsautnerr.androidapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val itemsAdapter = ItemsAdapter()
        recyclerView.adapter = itemsAdapter

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonRemoveLast = findViewById<Button>(R.id.buttonRemoveLast)
        val editText = findViewById<EditText>(R.id.editText)

        buttonAdd.setOnClickListener {
            val item = ItemModel(
                name = editText.text.toString()
            )

            itemsAdapter.addItem(item)
        }

        buttonRemoveLast.setOnClickListener {
            itemsAdapter.removeLastItem()
        }
    }
}
