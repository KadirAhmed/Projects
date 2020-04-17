package com.dataexchange;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dataexchange.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class CommunicationFragment extends Fragment {

    public CommunicationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_communication, container, false);
    }
}
