package com.sryang.screen_filter.ui;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;

import java.util.List;

public class FilterAnimFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSharedElementEnterTransition(new ChangeBounds());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setEnterSharedElementCallback(new SharedElementCallback() {
            @Override
            public void onSharedElementEnd(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
                super.onSharedElementEnd(sharedElementNames, sharedElements, sharedElementSnapshots);
                ViewGroup parent = (ViewGroup) getView();
                for (int i = 0; i < parent.getChildCount(); i++) {
                    parent.getChildAt(i).setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        setEnterSharedElementCallback(null);
    }
}
