package com.example.digitalpolice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class Home_Framgment extends Fragment {

    SliderLayout mDemoSlider;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ((HOME)  getActivity()).ChangeActionbar("Digital Police");
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        mDemoSlider = view.findViewById(R.id.slider);

        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Helmate Aware Ness Camp", R.drawable.helmateadd);
        file_maps.put("Award Reciving Ceremony", R.drawable.award);
        file_maps.put("Safety First Speed Next", R.drawable.helmateaware);
        //file_maps.put("Game of Thrones", R.drawable.site);
        file_maps.put("Don't Break The Trafic Rules", R.drawable.sevelince);
        file_maps.put("Please Avoid Thriple Riding", R.drawable.helmate);

      for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(getContext());
// initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

//add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                   .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(2500);
       // mDemoSlider.addOnPageChangeListener();


        return view;


    }

    @Override
    public void onStop() {

        mDemoSlider.stopAutoCycle();
        super.onStop();
    }
}
