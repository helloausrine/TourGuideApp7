package com.example.ausrine.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link PagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public PagerAdapter(Context context, FragmentManager fm) {
        super (fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CitiesFragment();
        } else if (position == 1) {
            return new CastlesFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new SitesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString ( R.string.cities);
        } else if (position == 1) {
            return mContext.getString ( R.string.castles );
        } else if (position == 2) {
            return mContext.getString ( R.string.museums);
        } else {
            return mContext.getString ( R.string.siteSeeing);
        }
    }
}
