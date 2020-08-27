package com.example.x_o;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class TournamentAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener {

    public final static float BIG_SCALE = 1.0f;
    public final static float SMALL_SCALE = 1.0f;
    public final static float DIFF_SCALE = BIG_SCALE - SMALL_SCALE;
    private tournament context;
    private FragmentManager fragmentManager;
    private float scale;

    public TournamentAdapter(tournament context, FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        // make the first pager bigger than others
        try {
            if (position == tournament.FIRST_PAGE)
                scale = BIG_SCALE;
            else
                scale = SMALL_SCALE;

            position = position % tournament.count;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new TournamentFragment(context, position + 1, scale);
    }

    @Override
    public int getCount() {
        int count = 0;
        try {
            count = tournament.count;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        try {
            if (positionOffset >= 0f && positionOffset <= 1f) {
                CustomLinearLayout cur = getRootView(position);
                CustomLinearLayout next = getRootView(position + 1);

                cur.setScaleBoth(BIG_SCALE - DIFF_SCALE * positionOffset);
                next.setScaleBoth(SMALL_SCALE + DIFF_SCALE * positionOffset);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @SuppressWarnings("ConstantConditions")
    private CustomLinearLayout getRootView(int position) {
        return (CustomLinearLayout) fragmentManager.findFragmentByTag(this.getFragmentTag(position))
                .getView().findViewById(R.id.root_container);
    }

    private String getFragmentTag(int position) {
        return "android:switcher:" + context.pager.getId() + ":" + position;
    }
}
