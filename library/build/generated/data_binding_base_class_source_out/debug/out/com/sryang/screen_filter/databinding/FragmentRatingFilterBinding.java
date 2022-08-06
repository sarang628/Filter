// Generated by data binding compiler. Do not edit!
package com.sryang.screen_filter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.torang_core.data.model.Ratings;
import com.sryang.screen_filter.FilterViewModel;
import com.sryang.screen_filter.R;
import java.lang.Deprecated;
import java.lang.Object;
import java.util.ArrayList;

public abstract class FragmentRatingFilterBinding extends ViewDataBinding {
  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView tvPrice;

  @Bindable
  protected FilterViewModel mVm;

  @Bindable
  protected ArrayList<Ratings> mRatings;

  protected FragmentRatingFilterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView textView10, TextView textView4, TextView textView5, TextView textView6,
      TextView textView9, TextView tvPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textView10 = textView10;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView9 = textView9;
    this.tvPrice = tvPrice;
  }

  public abstract void setVm(@Nullable FilterViewModel vm);

  @Nullable
  public FilterViewModel getVm() {
    return mVm;
  }

  public abstract void setRatings(@Nullable ArrayList<Ratings> ratings);

  @Nullable
  public ArrayList<Ratings> getRatings() {
    return mRatings;
  }

  @NonNull
  public static FragmentRatingFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_rating_filter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRatingFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRatingFilterBinding>inflateInternal(inflater, R.layout.fragment_rating_filter, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRatingFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_rating_filter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRatingFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRatingFilterBinding>inflateInternal(inflater, R.layout.fragment_rating_filter, null, false, component);
  }

  public static FragmentRatingFilterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentRatingFilterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRatingFilterBinding)bind(component, view, R.layout.fragment_rating_filter);
  }
}
