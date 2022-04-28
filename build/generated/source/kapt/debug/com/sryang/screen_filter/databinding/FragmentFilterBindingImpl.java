package com.sryang.screen_filter.databinding;
import com.sryang.screen_filter.R;
import com.sryang.screen_filter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFilterBindingImpl extends FragmentFilterBinding implements com.sryang.screen_filter.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.tvDistance.setTag(null);
        this.tvFood.setTag(null);
        this.tvPrice.setTag(null);
        this.tvRating.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback11 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback9 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmSelectedDistances((androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances>) object, fieldId);
            case 1 :
                return onChangeVmFood((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmRatings((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmSelectedPrice((androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSelectedDistances(androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances> VmSelectedDistances, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFood(androidx.lifecycle.MutableLiveData<java.lang.String> VmFood, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmRatings(androidx.lifecycle.MutableLiveData<java.lang.String> VmRatings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSelectedPrice(androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices> VmSelectedPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances> vmSelectedDistances = null;
        java.lang.String vmSelectedPriceName = null;
        java.lang.String vmRatingsGetValue = null;
        com.example.torang_core.data.model.Distances vmSelectedDistancesGetValue = null;
        com.example.torang_core.data.model.Prices vmSelectedPriceGetValue = null;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmFood = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmRatings = null;
        androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices> vmSelectedPrice = null;
        java.lang.String vmFoodGetValue = null;
        java.lang.String vmSelectedDistancesName = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (vm != null) {
                        // read vm.selectedDistances
                        vmSelectedDistances = vm.getSelectedDistances();
                    }
                    updateLiveDataRegistration(0, vmSelectedDistances);


                    if (vmSelectedDistances != null) {
                        // read vm.selectedDistances.getValue()
                        vmSelectedDistancesGetValue = vmSelectedDistances.getValue();
                    }


                    if (vmSelectedDistancesGetValue != null) {
                        // read vm.selectedDistances.getValue().name
                        vmSelectedDistancesName = vmSelectedDistancesGetValue.name();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (vm != null) {
                        // read vm.food
                        vmFood = vm.getFood();
                    }
                    updateLiveDataRegistration(1, vmFood);


                    if (vmFood != null) {
                        // read vm.food.getValue()
                        vmFoodGetValue = vmFood.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (vm != null) {
                        // read vm.ratings
                        vmRatings = vm.getRatings();
                    }
                    updateLiveDataRegistration(2, vmRatings);


                    if (vmRatings != null) {
                        // read vm.ratings.getValue()
                        vmRatingsGetValue = vmRatings.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (vm != null) {
                        // read vm.selectedPrice
                        vmSelectedPrice = vm.getSelectedPrice();
                    }
                    updateLiveDataRegistration(3, vmSelectedPrice);


                    if (vmSelectedPrice != null) {
                        // read vm.selectedPrice.getValue()
                        vmSelectedPriceGetValue = vmSelectedPrice.getValue();
                    }


                    if (vmSelectedPriceGetValue != null) {
                        // read vm.selectedPrice.getValue().name
                        vmSelectedPriceName = vmSelectedPriceGetValue.name();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.tvDistance.setOnClickListener(mCallback8);
            this.tvFood.setOnClickListener(mCallback10);
            this.tvPrice.setOnClickListener(mCallback11);
            this.tvRating.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDistance, vmSelectedDistancesName);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFood, vmFoodGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, vmSelectedPriceName);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRating, vmRatingsGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.clickFood();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.clickPrice();
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


                    vm.clickRating();
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


                    vm.clickDistance();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.selectedDistances
        flag 1 (0x2L): vm.food
        flag 2 (0x3L): vm.ratings
        flag 3 (0x4L): vm.selectedPrice
        flag 4 (0x5L): vm
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}