// Generated by data binding compiler. Do not edit!
package com.sryang.screen_filter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.sryang.screen_filter.FilterViewModel;
import com.sryang.screen_filter.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFilterParentBinding extends ViewDataBinding {
  @NonNull
  public final Button btnThisLoc;

  @NonNull
  public final Button button;

  @NonNull
  public final ConstraintLayout clFilterParent;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final FragmentContainerView filterContainer1;

  @Bindable
  protected FilterViewModel mFilterViewModel;

  protected FragmentFilterParentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnThisLoc, Button button, ConstraintLayout clFilterParent,
      ConstraintLayout constraintLayout2, FragmentContainerView filterContainer1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnThisLoc = btnThisLoc;
    this.button = button;
    this.clFilterParent = clFilterParent;
    this.constraintLayout2 = constraintLayout2;
    this.filterContainer1 = filterContainer1;
  }

  public abstract void setFilterViewModel(@Nullable FilterViewModel filterViewModel);

  @Nullable
  public FilterViewModel getFilterViewModel() {
    return mFilterViewModel;
  }

  @NonNull
  public static FragmentFilterParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_filter_parent, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFilterParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFilterParentBinding>inflateInternal(inflater, R.layout.fragment_filter_parent, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFilterParentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_filter_parent, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFilterParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFilterParentBinding>inflateInternal(inflater, R.layout.fragment_filter_parent, null, false, component);
  }

  public static FragmentFilterParentBinding bind(@NonNull View view) {
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
  public static FragmentFilterParentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFilterParentBinding)bind(component, view, R.layout.fragment_filter_parent);
  }
}
