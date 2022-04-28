package com.sryang.screen_filter.databinding;
import com.sryang.screen_filter.R;
import com.sryang.screen_filter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPriceFilterBindingImpl extends FragmentPriceFilterBinding implements com.sryang.screen_filter.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPriceFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentPriceFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
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
        mCallback25 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback23 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        mCallback26 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 5);
        mCallback24 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback22 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
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
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sryang.screen_filter.FilterViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmSelectedPrice((androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSelectedPrice(androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices> VmSelectedPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String vmSelectedPriceName = null;
        boolean vmSelectedPricePricesAROUND10K = false;
        java.lang.String pricesAROUND20KToName = null;
        java.lang.String pricesAROUND10KToName = null;
        boolean vmSelectedPricePricesAROUND30K = false;
        com.example.torang_core.data.model.Prices vmSelectedPriceGetValue = null;
        java.lang.String pricesAROUND30KToName = null;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        java.lang.String pricesOVER30KToName = null;
        boolean vmSelectedPricePricesOVER30K = false;
        boolean vmSelectedPricePricesUNDER10K = false;
        androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices> vmSelectedPrice = null;
        boolean vmSelectedPricePricesAROUND20K = false;
        java.lang.String pricesUNDER10KToName = null;

        if ((dirtyFlags & 0x4L) != 0) {

                // read Prices.AROUND_20K.toName
                pricesAROUND20KToName = com.example.torang_core.data.model.Prices.AROUND_20K.getToName();
                // read Prices.AROUND_10K.toName
                pricesAROUND10KToName = com.example.torang_core.data.model.Prices.AROUND_10K.getToName();
                // read Prices.AROUND_30K.toName
                pricesAROUND30KToName = com.example.torang_core.data.model.Prices.AROUND_30K.getToName();
                // read Prices.OVER_30K.toName
                pricesOVER30KToName = com.example.torang_core.data.model.Prices.OVER_30K.getToName();
                // read Prices.UNDER_10K.toName
                pricesUNDER10KToName = com.example.torang_core.data.model.Prices.UNDER_10K.getToName();
        }
        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.selectedPrice
                    vmSelectedPrice = vm.getSelectedPrice();
                }
                updateLiveDataRegistration(0, vmSelectedPrice);


                if (vmSelectedPrice != null) {
                    // read vm.selectedPrice.getValue()
                    vmSelectedPriceGetValue = vmSelectedPrice.getValue();
                }


                if (vmSelectedPriceGetValue != null) {
                    // read vm.selectedPrice.getValue().name
                    vmSelectedPriceName = vmSelectedPriceGetValue.name();
                }
                // read vm.selectedPrice.getValue() == Prices.AROUND_10K
                vmSelectedPricePricesAROUND10K = (vmSelectedPriceGetValue) == (com.example.torang_core.data.model.Prices.AROUND_10K);
                // read vm.selectedPrice.getValue() == Prices.AROUND_30K
                vmSelectedPricePricesAROUND30K = (vmSelectedPriceGetValue) == (com.example.torang_core.data.model.Prices.AROUND_30K);
                // read vm.selectedPrice.getValue() == Prices.OVER_30K
                vmSelectedPricePricesOVER30K = (vmSelectedPriceGetValue) == (com.example.torang_core.data.model.Prices.OVER_30K);
                // read vm.selectedPrice.getValue() == Prices.UNDER_10K
                vmSelectedPricePricesUNDER10K = (vmSelectedPriceGetValue) == (com.example.torang_core.data.model.Prices.UNDER_10K);
                // read vm.selectedPrice.getValue() == Prices.AROUND_20K
                vmSelectedPricePricesAROUND20K = (vmSelectedPriceGetValue) == (com.example.torang_core.data.model.Prices.AROUND_20K);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView10.setOnClickListener(mCallback26);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView10, pricesOVER30KToName);
            this.textView4.setOnClickListener(mCallback22);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, pricesUNDER10KToName);
            this.textView5.setOnClickListener(mCallback23);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, pricesAROUND10KToName);
            this.textView6.setOnClickListener(mCallback24);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, pricesAROUND20KToName);
            this.textView9.setOnClickListener(mCallback25);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView9, pricesAROUND30KToName);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.torang_core.util.BindingAdapterKt.select(this.textView10, vmSelectedPricePricesOVER30K);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView4, vmSelectedPricePricesUNDER10K);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView5, vmSelectedPricePricesAROUND10K);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView6, vmSelectedPricePricesAROUND20K);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView9, vmSelectedPricePricesAROUND30K);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, vmSelectedPriceName);
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




                    vm.setSelectedPrice(com.example.torang_core.data.model.Prices.AROUND_30K);
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




                    vm.setSelectedPrice(com.example.torang_core.data.model.Prices.AROUND_10K);
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




                    vm.setSelectedPrice(com.example.torang_core.data.model.Prices.OVER_30K);
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




                    vm.setSelectedPrice(com.example.torang_core.data.model.Prices.AROUND_20K);
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




                    vm.setSelectedPrice(com.example.torang_core.data.model.Prices.UNDER_10K);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.selectedPrice
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}