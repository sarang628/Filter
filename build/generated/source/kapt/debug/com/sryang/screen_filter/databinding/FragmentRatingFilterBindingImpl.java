package com.sryang.screen_filter.databinding;
import com.sryang.screen_filter.R;
import com.sryang.screen_filter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRatingFilterBindingImpl extends FragmentRatingFilterBinding implements com.sryang.screen_filter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRatingFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentRatingFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.textView10.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        this.textView9.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sryang.screen_filter.FilterViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmSelectedRatings((androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.Ratings>>) object, fieldId);
            case 1 :
                return onChangeVmRatings((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSelectedRatings(androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.Ratings>> VmSelectedRatings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmRatings(androidx.lifecycle.MutableLiveData<java.lang.String> VmRatings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String vmRatingsGetValue = null;
        boolean vmSelectedRatingsContainsRatingsFIVE = false;
        boolean vmSelectedRatingsContainsRatingsFOUR = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.Ratings>> vmSelectedRatings = null;
        boolean vmSelectedRatingsContainsRatingsONE = false;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmRatings = null;
        java.util.ArrayList<com.example.torang_core.data.model.Ratings> vmSelectedRatingsGetValue = null;
        boolean vmSelectedRatingsContainsRatingsTWO = false;
        boolean vmSelectedRatingsContainsRatingsTHREE = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.selectedRatings
                        vmSelectedRatings = vm.getSelectedRatings();
                    }
                    updateLiveDataRegistration(0, vmSelectedRatings);


                    if (vmSelectedRatings != null) {
                        // read vm.selectedRatings.getValue()
                        vmSelectedRatingsGetValue = vmSelectedRatings.getValue();
                    }


                    if (vmSelectedRatingsGetValue != null) {
                        // read vm.selectedRatings.getValue().contains(Ratings.FIVE)
                        vmSelectedRatingsContainsRatingsFIVE = vmSelectedRatingsGetValue.contains(com.example.torang_core.data.model.Ratings.FIVE);
                        // read vm.selectedRatings.getValue().contains(Ratings.FOUR)
                        vmSelectedRatingsContainsRatingsFOUR = vmSelectedRatingsGetValue.contains(com.example.torang_core.data.model.Ratings.FOUR);
                        // read vm.selectedRatings.getValue().contains(Ratings.ONE)
                        vmSelectedRatingsContainsRatingsONE = vmSelectedRatingsGetValue.contains(com.example.torang_core.data.model.Ratings.ONE);
                        // read vm.selectedRatings.getValue().contains(Ratings.TWO)
                        vmSelectedRatingsContainsRatingsTWO = vmSelectedRatingsGetValue.contains(com.example.torang_core.data.model.Ratings.TWO);
                        // read vm.selectedRatings.getValue().contains(Ratings.THREE)
                        vmSelectedRatingsContainsRatingsTHREE = vmSelectedRatingsGetValue.contains(com.example.torang_core.data.model.Ratings.THREE);
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.ratings
                        vmRatings = vm.getRatings();
                    }
                    updateLiveDataRegistration(1, vmRatings);


                    if (vmRatings != null) {
                        // read vm.ratings.getValue()
                        vmRatingsGetValue = vmRatings.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.torang_core.util.BindingAdapterKt.select(this.textView10, vmSelectedRatingsContainsRatingsFIVE);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView4, vmSelectedRatingsContainsRatingsONE);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView5, vmSelectedRatingsContainsRatingsTWO);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView6, vmSelectedRatingsContainsRatingsTHREE);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView9, vmSelectedRatingsContainsRatingsFOUR);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.textView10.setOnClickListener(mCallback5);
            this.textView4.setOnClickListener(mCallback1);
            this.textView5.setOnClickListener(mCallback2);
            this.textView6.setOnClickListener(mCallback3);
            this.textView9.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, vmRatingsGetValue);
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




                    vm.setSelectRatings(com.example.torang_core.data.model.Ratings.FOUR);
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




                    vm.setSelectRatings(com.example.torang_core.data.model.Ratings.TWO);
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




                    vm.setSelectRatings(com.example.torang_core.data.model.Ratings.FIVE);
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




                    vm.setSelectRatings(com.example.torang_core.data.model.Ratings.THREE);
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




                    vm.setSelectRatings(com.example.torang_core.data.model.Ratings.ONE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.selectedRatings
        flag 1 (0x2L): vm.ratings
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}