package com.sryang.screen_filter.databinding;
import com.sryang.screen_filter.R;
import com.sryang.screen_filter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDistanceFilterBindingImpl extends FragmentDistanceFilterBinding implements com.sryang.screen_filter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_distance, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDistanceFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentDistanceFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.textView.setTag(null);
        this.textView11.setTag(null);
        this.textView12.setTag(null);
        this.textView2.setTag(null);
        this.textView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback8 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        mCallback12 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 5);
        mCallback10 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback9 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.sryang.screen_filter.FilterViewModel) variable);
        }
        else if (BR.distance == variableId) {
            setDistance((com.sryang.torang_core.data.entity.Distances) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sryang.screen_filter.FilterViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setDistance(@Nullable com.sryang.torang_core.data.entity.Distances Distance) {
        this.mDistance = Distance;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.distance);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean distanceDistances100M = false;
        boolean distanceDistances300M = false;
        boolean distanceDistances500M = false;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        com.sryang.torang_core.data.entity.Distances distance = mDistance;
        boolean distanceDistances3KM = false;
        java.lang.String distances3KMToName = null;
        java.lang.String distances500MToName = null;
        java.lang.String distances300MToName = null;
        java.lang.String distances100MToName = null;
        java.lang.String distances1KMToName = null;
        boolean distanceDistances1KM = false;

        if ((dirtyFlags & 0x6L) != 0) {



                // read distance == Distances._100M
                distanceDistances100M = (distance) == (com.sryang.torang_core.data.entity.Distances._100M);
                // read distance == Distances._300M
                distanceDistances300M = (distance) == (com.sryang.torang_core.data.entity.Distances._300M);
                // read distance == Distances._500M
                distanceDistances500M = (distance) == (com.sryang.torang_core.data.entity.Distances._500M);
                // read distance == Distances._3KM
                distanceDistances3KM = (distance) == (com.sryang.torang_core.data.entity.Distances._3KM);
                // read distance == Distances._1KM
                distanceDistances1KM = (distance) == (com.sryang.torang_core.data.entity.Distances._1KM);
        }
        if ((dirtyFlags & 0x4L) != 0) {

                // read Distances._3KM.toName
                distances3KMToName = com.sryang.torang_core.data.entity.Distances._3KM.getToName();
                // read Distances._500M.toName
                distances500MToName = com.sryang.torang_core.data.entity.Distances._500M.getToName();
                // read Distances._300M.toName
                distances300MToName = com.sryang.torang_core.data.entity.Distances._300M.getToName();
                // read Distances._100M.toName
                distances100MToName = com.sryang.torang_core.data.entity.Distances._100M.getToName();
                // read Distances._1KM.toName
                distances1KMToName = com.sryang.torang_core.data.entity.Distances._1KM.getToName();
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView, distanceDistances100M);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView11, distanceDistances1KM);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView12, distanceDistances3KM);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView2, distanceDistances300M);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView3, distanceDistances500M);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, distances100MToName);
            this.textView11.setOnClickListener(mCallback11);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, distances1KMToName);
            this.textView12.setOnClickListener(mCallback12);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView12, distances3KMToName);
            this.textView2.setOnClickListener(mCallback9);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, distances300MToName);
            this.textView3.setOnClickListener(mCallback10);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, distances500MToName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.setSelectedDistances(com.sryang.torang_core.data.entity.Distances._1KM);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.setSelectedDistances(com.sryang.torang_core.data.entity.Distances._100M);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.setSelectedDistances(com.sryang.torang_core.data.entity.Distances._3KM);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.setSelectedDistances(com.sryang.torang_core.data.entity.Distances._500M);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.setSelectedDistances(com.sryang.torang_core.data.entity.Distances._300M);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): distance
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}