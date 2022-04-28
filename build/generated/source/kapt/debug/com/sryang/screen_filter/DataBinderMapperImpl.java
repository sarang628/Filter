package com.sryang.screen_filter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sryang.screen_filter.databinding.FragmentDistanceFilterBindingImpl;
import com.sryang.screen_filter.databinding.FragmentFilterBindingImpl;
import com.sryang.screen_filter.databinding.FragmentFilterParentBindingImpl;
import com.sryang.screen_filter.databinding.FragmentFoodFilterBindingImpl;
import com.sryang.screen_filter.databinding.FragmentPriceFilterBindingImpl;
import com.sryang.screen_filter.databinding.FragmentRatingFilterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTDISTANCEFILTER = 1;

  private static final int LAYOUT_FRAGMENTFILTER = 2;

  private static final int LAYOUT_FRAGMENTFILTERPARENT = 3;

  private static final int LAYOUT_FRAGMENTFOODFILTER = 4;

  private static final int LAYOUT_FRAGMENTPRICEFILTER = 5;

  private static final int LAYOUT_FRAGMENTRATINGFILTER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sryang.screen_filter.R.layout.fragment_distance_filter, LAYOUT_FRAGMENTDISTANCEFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sryang.screen_filter.R.layout.fragment_filter, LAYOUT_FRAGMENTFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sryang.screen_filter.R.layout.fragment_filter_parent, LAYOUT_FRAGMENTFILTERPARENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sryang.screen_filter.R.layout.fragment_food_filter, LAYOUT_FRAGMENTFOODFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sryang.screen_filter.R.layout.fragment_price_filter, LAYOUT_FRAGMENTPRICEFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sryang.screen_filter.R.layout.fragment_rating_filter, LAYOUT_FRAGMENTRATINGFILTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTDISTANCEFILTER: {
          if ("layout/fragment_distance_filter_0".equals(tag)) {
            return new FragmentDistanceFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_distance_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILTER: {
          if ("layout/fragment_filter_0".equals(tag)) {
            return new FragmentFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILTERPARENT: {
          if ("layout/fragment_filter_parent_0".equals(tag)) {
            return new FragmentFilterParentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_filter_parent is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODFILTER: {
          if ("layout/fragment_food_filter_0".equals(tag)) {
            return new FragmentFoodFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRICEFILTER: {
          if ("layout/fragment_price_filter_0".equals(tag)) {
            return new FragmentPriceFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_price_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRATINGFILTER: {
          if ("layout/fragment_rating_filter_0".equals(tag)) {
            return new FragmentRatingFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_rating_filter is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.torang_core.DataBinderMapperImpl());
    result.add(new com.example.travelmode.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "filterViewModel");
      sKeys.put(2, "name");
      sKeys.put(3, "nationItem");
      sKeys.put(4, "res");
      sKeys.put(5, "selectNationViewModel");
      sKeys.put(6, "viewModel");
      sKeys.put(7, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/fragment_distance_filter_0", com.sryang.screen_filter.R.layout.fragment_distance_filter);
      sKeys.put("layout/fragment_filter_0", com.sryang.screen_filter.R.layout.fragment_filter);
      sKeys.put("layout/fragment_filter_parent_0", com.sryang.screen_filter.R.layout.fragment_filter_parent);
      sKeys.put("layout/fragment_food_filter_0", com.sryang.screen_filter.R.layout.fragment_food_filter);
      sKeys.put("layout/fragment_price_filter_0", com.sryang.screen_filter.R.layout.fragment_price_filter);
      sKeys.put("layout/fragment_rating_filter_0", com.sryang.screen_filter.R.layout.fragment_rating_filter);
    }
  }
}
