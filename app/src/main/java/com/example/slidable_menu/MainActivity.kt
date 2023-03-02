package com.example.slidable_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

lateinit var toggle: ActionBarDrawerToggle  //lateinit -> intialize var later


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.navView)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navDelete -> Toast.makeText(applicationContext,
                    "Cliked Trash", Toast.LENGTH_SHORT).show()
                R.id.navHome -> Toast.makeText(applicationContext,
                    "Cliked Home", Toast.LENGTH_SHORT).show()
                R.id.navLogin -> Toast.makeText(applicationContext,
                    "Cliked Login", Toast.LENGTH_SHORT).show()
                R.id.navMessage -> Toast.makeText(applicationContext,
                    "Cliked Message", Toast.LENGTH_SHORT).show()
                R.id.navRate -> Toast.makeText(applicationContext,
                    "Cliked Rate", Toast.LENGTH_SHORT).show()
                R.id.navSetting -> Toast.makeText(applicationContext,
                    "Cliked Setting", Toast.LENGTH_SHORT).show()
                R.id.navShare-> Toast.makeText(applicationContext,
                    "Cliked Share", Toast.LENGTH_SHORT).show()
                R.id.navSync -> Toast.makeText(applicationContext,
                    "Cliked Sync", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (toggle.onOptionsItemSelected(item)){
                return  true
        }
        return super.onOptionsItemSelected(item)
    }
}