package com.example.listview_with_custom_item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv1 = findViewById<ListView>(R.id.lv1)
        // val names = arrayOf("Item A", "Item B", "Item C", "Item D", "Item E")
        var list = ArrayList<Model>()

        list.add(Model("energy", "Melee/Ultimate Player", R.mipmap.falco_foreground))
        list.add(Model("Drank", "Melee/P+ Player", R.mipmap.sheik_foreground))



        lv1.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

 /*       lv1.setOnItemClickListener {adapterView, view, i, l ->
            Toast.makeText(
                this,
                "You Selected: " + names[i],
                Toast.LENGTH_LONG
            ).show()

        }*/
    }
}
