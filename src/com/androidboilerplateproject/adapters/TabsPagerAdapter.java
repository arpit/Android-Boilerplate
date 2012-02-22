package com.androidboilerplateproject.adapters;

import com.androidboilerplateproject.ui.fragments.SimpleListFragment;
import com.viewpagerindicator.TitleProvider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class TabsPagerAdapter extends FragmentPagerAdapter implements TitleProvider {
	
	FragmentRef[] pages;
	
	public TabsPagerAdapter(FragmentManager fm, FragmentRef[] pages){
		super(fm);
		this.pages = pages;
	}
	
	@Override
	public int getCount() {
		return pages.length;
	}

	@Override
	public String getTitle(int position) {
		return pages[position].title;
	}
	
	@Override
	public Fragment getItem(int position) {
		return pages[position].fragment;
	}
	
	public final static class FragmentRef{
		public String title;
		public Fragment fragment;
		
		public FragmentRef(String t, Fragment f){
			this.title = t;
			this.fragment = f;
		}
	}

}
