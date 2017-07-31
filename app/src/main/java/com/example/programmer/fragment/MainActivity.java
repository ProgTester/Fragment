package com.example.programmer.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleFragment[] fragment = new ExampleFragment[3];

        //объект для рбаоты с фрагментами
        android.app.FragmentManager manager = getFragmentManager();
        android.app.FragmentTransaction transaction = manager.beginTransaction();

        //транзакция
        for(int i = 0; i < 3; ++i) {
            fragment[i] = new ExampleFragment();
        }
        transaction.add(R.id.main_frame, fragment[0]);
        transaction.commit();
    }

    //пользовательский фрагмент
    public static class ExampleFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.activity_fragment, container, false);
        }
    }

}
