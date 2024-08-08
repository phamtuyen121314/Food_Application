package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.food_application.TableLayoutFavorite.Tabcoming;
import com.example.food_application.TableLayoutFavorite.Tabfavorite;
import com.example.food_application.TableLayoutFavorite.Tabhistory;
import com.example.food_application.TableLayoutFavorite.Tabrating;

public class ViewPageFavoriteFragmentAdapter extends FragmentStateAdapter {

    public ViewPageFavoriteFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Tabfavorite();
            case 1:
                return new Tabcoming();
            case 2:
                return new Tabhistory();
            case 3:
                return new Tabrating();
            default:
                return new Tabfavorite();
        }
    }

    @Override
    public int getItemCount() {
        return 4; // Number of tabs
    }
}