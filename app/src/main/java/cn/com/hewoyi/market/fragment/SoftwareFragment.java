package cn.com.hewoyi.market.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.com.hewoyi.market.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SoftwareFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SoftwareFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SoftwareFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_software, container, false);
    }


}
