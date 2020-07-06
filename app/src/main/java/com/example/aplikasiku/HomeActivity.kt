package com.example.aplikasiku

import ahmed.easyslider.EasySlider
import ahmed.easyslider.SliderItem
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar

class HomeActivity : AppCompatActivity() {

    val listImage : MutableList<SliderItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_home)

        setSupportActionBar(toolbar)


        val imageSlider = findViewById<EasySlider>(R.id.image_slider)

        listImage.add(SliderItem("Bis",R.drawable.bis))
        listImage.add(SliderItem("Pesawat Terbang",R.drawable.pesawat))
        listImage.add(SliderItem("Kapal Laut",R.drawable.kapal))

        imageSlider.setPages(listImage)

    }

    private fun setSupportActionBar(toolbar: Toolbar?) {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.action_profile -> {
                Toast.makeText(this, "Menu Profile",Toast.LENGTH_SHORT).show()
            }
            R.id.action_logout -> {
                Toast.makeText(this, "Menu Logout",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
