package com.androidboilerplateproject.ui.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.androidboilerplateproject.R;
import com.androidboilerplateproject.adapters.TabsPagerAdapter;
import com.androidboilerplateproject.adapters.TabsPagerAdapter.FragmentRef;
import com.androidboilerplateproject.ui.fragments.SimpleListFragment;
import com.viewpagerindicator.TabPageIndicator;

public class AndroidBoilerPlateProjectActivity extends FragmentActivity {
    
	private TabsPagerAdapter tabsAdapter;
	private ViewPager tabs;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        FragmentRef page1 = new FragmentRef("Page 1", new SimpleListFragment());
        FragmentRef page2 = new FragmentRef("Page 2", new SimpleListFragment());
        FragmentRef page3 = new FragmentRef("Page 3", new SimpleListFragment());
        FragmentRef page4 = new FragmentRef("Page 4", new SimpleListFragment());
        
        tabsAdapter = new TabsPagerAdapter(
        		this.getSupportFragmentManager(),
        		new FragmentRef[]{page1, page2, page3, page4}
        );
        tabs = (ViewPager) findViewById(R.id.viewpager);
        tabs.setAdapter(tabsAdapter);
        
        TabPageIndicator titleIndicator = (TabPageIndicator)findViewById(R.id.titles);
        titleIndicator.setViewPager(tabs);
    }
}