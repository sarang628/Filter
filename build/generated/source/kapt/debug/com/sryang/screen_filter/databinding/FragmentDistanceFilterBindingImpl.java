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
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDistanceFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentDistanceFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.textView.setTag(null);
        this.textView11.setTag(null);
        this.textView12.setTag(null);
        this.textView2.setTag(null);
        this.textView3.setTag(null);
        this.tvDistance.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback13 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 5);
        mCallback14 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback12 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
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
                return onChangeVmSelectedDistances((androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.torang_core.data.model.Distances vmSelectedDistancesGetValue = null;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        java.lang.String distances3KMToName = null;
        java.lang.String distances500MToName = null;
        java.lang.String vmSelectedDistancesName = null;
        androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances> vmSelectedDistances = null;
        java.lang.String distances300MToName = null;
        boolean vmSelectedDistancesDistances1KM = false;
        boolean vmSelectedDistancesDistances500M = false;
        java.lang.String distances100MToName = null;
        boolean vmSelectedDistancesDistances100M = false;
        boolean vmSelectedDistancesDistances300M = false;
        java.lang.String distances1KMToName = null;
        boolean vmSelectedDistancesDistances3KM = false;

        if ((dirtyFlags & 0x7L) != 0) {



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
                // read vm.selectedDistances.getValue() == Distances._1KM
                vmSelectedDistancesDistances1KM = (vmSelectedDistancesGetValue) == (com.example.torang_core.data.model.Distances._1KM);
                // read vm.selectedDistances.getValue() == Distances._500M
                vmSelectedDistancesDistances500M = (vmSelectedDistancesGetValue) == (com.example.torang_core.data.model.Distances._500M);
                // read vm.selectedDistances.getValue() == Distances._100M
                vmSelectedDistancesDistances100M = (vmSelectedDistancesGetValue) == (com.example.torang_core.data.model.Distances._100M);
                // read vm.selectedDistances.getValue() == Distances._300M
                vmSelectedDistancesDistances300M = (vmSelectedDistancesGetValue) == (com.example.torang_core.data.model.Distances._300M);
                // read vm.selectedDistances.getValue() == Distances._3KM
                vmSelectedDistancesDistances3KM = (vmSelectedDistancesGetValue) == (com.example.torang_core.data.model.Distances._3KM);
        }
        if ((dirtyFlags & 0x4L) != 0) {

                // read Distances._3KM.toName
                distances3KMToName = com.example.torang_core.data.model.Distances._3KM.getToName();
                // read Distances._500M.toName
                distances500MToName = com.example.torang_core.data.model.Distances._500M.getToName();
                // read Distances._300M.toName
                distances300MToName = com.example.torang_core.data.model.Distances._300M.getToName();
                // read Distances._100M.toName
                distances100MToName = com.example.torang_core.data.model.Distances._100M.getToName();
                // read Distances._1KM.toName
                distances1KMToName = com.example.torang_core.data.model.Distances._1KM.getToName();
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.torang_core.util.BindingAdapterKt.select(this.textView, vmSelectedDistancesDistances100M);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView11, vmSelectedDistancesDistances1KM);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView12, vmSelectedDistancesDistances3KM);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView2, vmSelectedDistancesDistances300M);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView3, vmSelectedDistancesDistances500M);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDistance, vmSelectedDistancesName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView.setOnClickListener(mCallback12);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, distances100MToName);
            this.textView11.setOnClickListener(mCallback15);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, distances1KMToName);
            this.textView12.setOnClickListener(mCallback16);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView12, distances3KMToName);
            this.textView2.setOnClickListener(mCallback13);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, distances300MToName);
            this.textView3.setOnClickListener(mCallback14);
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




                    vm.setSelectedDistances(com.example.torang_core.data.model.Distances._1KM);
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




                    vm.setSelectedDistances(com.example.torang_core.data.model.Distances._300M);
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




                    vm.setSelectedDistances(com.example.torang_core.data.model.Distances._3KM);
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




                    vm.setSelectedDistances(com.example.torang_core.data.model.Distances._500M);
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




                    vm.setSelectedDistances(com.example.torang_core.data.model.Distances._100M);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.selectedDistances
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}