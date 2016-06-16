package com.example.marthasaka.navigation_drawer;

import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private ListView navList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
         navList = (ListView) findViewById(R.id.navlist);
         ArrayList<String>navArray=new ArrayList<String>();
         navArray.add("Home");
         navArray.add("Fragment1");
         navArray.add("Fragment2");
         navArray.add("Fragment3");
         navArray.add("Fragment4");
         navArray.add("Fragment5");
         navList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,navArray);
         navList.setAdapter(adapter);
         navList.setOnItemClickListener(this);
         actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.opendrawer,R.string.closedrawer);
         drawerLayout.setDrawerListener(actionBarDrawerToggle);
         ActionBar actionBar = getSupportActionBar();
         actionBar.setDisplayShowHomeEnabled(true);
         actionBar.setDisplayHomeAsUpEnabled(true);
         loadselection(0);

    }
    private void loadselection(int i){
        navList.setItemChecked(i,true);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
     //Inflate the menu;this adds items to the actionbar if present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here.The action bar will
        //automatically handle clicks on the Home/Up button,so long
        //as you specify a parent activity in the AndroidManifest.xml
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(navList)){
                drawerLayout.closeDrawer(navList);
            }else{
                drawerLayout.openDrawer(navList);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     switch (position){
         case 0:
             break;
         case 1:
             break;
         case 2:
             break;
         case 3:
             break;
         case 4:
             break;
         case 5:
             break;
     }
        drawerLayout.closeDrawer(navList);
    }
}
