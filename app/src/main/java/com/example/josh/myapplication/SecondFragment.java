package com.example.josh.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.second_layout, container, false);

        Context context = getActivity().getApplicationContext();
        CharSequence text = "111";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //TextView t2 = (TextView) getView().findViewById(R.id.create_account_link);

        text = "222";
        toast = Toast.makeText(context, text, duration);
        toast.show();

        //t2.setClickable(true);
        //t2.setMovementMethod(LinkMovementMethod.getInstance());
        return myView;
    }
}
