package com.cevin.umuclone;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.cevin.umuclone.components.ServiceSectionAdapter;
import com.cevin.umuclone.fragment.BayarFragment;
import com.cevin.umuclone.fragment.HomeFragment;
import com.cevin.umuclone.fragment.ProfileFragment;
import com.cevin.umuclone.fragment.RiwayatFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mainBottomNav;
    private HomeFragment homeFragment;
    private RiwayatFragment riwayatFragment;
    private BayarFragment bayarFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBottomNav = findViewById(R.id.mainBottomNav);

//        Fragment
        homeFragment = new HomeFragment();
        riwayatFragment = new RiwayatFragment();
        bayarFragment = new BayarFragment();
        profileFragment = new ProfileFragment();

        initializeFragment();


        mainBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.main_container);

                switch (menuItem.getItemId()) {
                    case R.id.bottom_action_home:
//                        Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
                        replaceFragment(homeFragment, currentFragment);
                        return true;
                    case R.id.bottom_action_riwayat:
//                        Toast.makeText(getApplicationContext(), "Riwayat", Toast.LENGTH_SHORT).show();
                        replaceFragment(riwayatFragment, currentFragment);
                        return true;
                    case R.id.bottom_action_bayar:
//                        Toast.makeText(getApplicationContext(), "bayar", Toast.LENGTH_SHORT).show();
                        replaceFragment(bayarFragment, currentFragment);
                        return true;
                    case R.id.bottom_action_profile:
//                        Toast.makeText(getApplicationContext(), "profile", Toast.LENGTH_SHORT).show();
                        replaceFragment(profileFragment, currentFragment);
                        return true;
                    default:
//                        Toast.makeText(getApplicationContext(), "Belum ada", Toast.LENGTH_SHORT).show();
                        return false;

                }
            }
        });
    }

    private void replaceFragment(Fragment fragment, Fragment currentFragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (fragment == homeFragment) {

            fragmentTransaction.hide(riwayatFragment);
            fragmentTransaction.hide(bayarFragment);
            fragmentTransaction.hide(profileFragment);

        }
        if(fragment == riwayatFragment){

            fragmentTransaction.hide(homeFragment);
            fragmentTransaction.hide(bayarFragment);
            fragmentTransaction.hide(profileFragment);

        }
        if(fragment == bayarFragment){

            fragmentTransaction.hide(homeFragment);
            fragmentTransaction.hide(riwayatFragment);
            fragmentTransaction.hide(profileFragment);

        }
        if(fragment == profileFragment){

            fragmentTransaction.hide(homeFragment);
            fragmentTransaction.hide(riwayatFragment);
            fragmentTransaction.hide(bayarFragment);

        }
        fragmentTransaction.show(fragment);

        fragmentTransaction.commit();
    }

    private void initializeFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.add(R.id.main_container, homeFragment);
        fragmentTransaction.add(R.id.main_container, riwayatFragment);
        fragmentTransaction.add(R.id.main_container, bayarFragment);
        fragmentTransaction.add(R.id.main_container, profileFragment);

        fragmentTransaction.hide(riwayatFragment);
        fragmentTransaction.hide(bayarFragment);
        fragmentTransaction.hide(profileFragment);

        fragmentTransaction.commit();
    }

}
