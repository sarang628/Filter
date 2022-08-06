package com.sryang.screen_filter.databinding;
import com.sryang.screen_filter.R;
import com.sryang.screen_filter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFoodFilterBindingImpl extends FragmentFoodFilterBinding implements com.sryang.screen_filter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_food, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFoodFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentFoodFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.textView10.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        this.textView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 5);
        mCallback15 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback13 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        mCallback16 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback14 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
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
        else if (BR.selectedRestaurantType == variableId) {
            setSelectedRestaurantType((java.util.ArrayList<com.example.torang_core.data.model.RestaurantType>) variable);
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
    public void setSelectedRestaurantType(@Nullable java.util.ArrayList<com.example.torang_core.data.model.RestaurantType> SelectedRestaurantType) {
        this.mSelectedRestaurantType = SelectedRestaurantType;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.selectedRestaurantType);
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
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        boolean selectedRestaurantTypeContainsRestaurantTypeKOREAN = false;
        boolean selectedRestaurantTypeContainsRestaurantTypeFOREIGN = false;
        boolean selectedRestaurantTypeContainsRestaurantTypeDRINK = false;
        boolean selectedRestaurantTypeContainsRestaurantTypeJAPANESE = false;
        boolean selectedRestaurantTypeContainsRestaurantTypeCHINESE = false;
        java.util.ArrayList<com.example.torang_core.data.model.RestaurantType> selectedRestaurantType = mSelectedRestaurantType;

        if ((dirtyFlags & 0x6L) != 0) {



                if (selectedRestaurantType != null) {
                    // read selectedRestaurantType.contains(RestaurantType.KOREAN)
                    selectedRestaurantTypeContainsRestaurantTypeKOREAN = selectedRestaurantType.contains(com.example.torang_core.data.model.RestaurantType.KOREAN);
                    // read selectedRestaurantType.contains(RestaurantType.FOREIGN)
                    selectedRestaurantTypeContainsRestaurantTypeFOREIGN = selectedRestaurantType.contains(com.example.torang_core.data.model.RestaurantType.FOREIGN);
                    // read selectedRestaurantType.contains(RestaurantType.DRINK)
                    selectedRestaurantTypeContainsRestaurantTypeDRINK = selectedRestaurantType.contains(com.example.torang_core.data.model.RestaurantType.DRINK);
                    // read selectedRestaurantType.contains(RestaurantType.JAPANESE)
                    selectedRestaurantTypeContainsRestaurantTypeJAPANESE = selectedRestaurantType.contains(com.example.torang_core.data.model.RestaurantType.JAPANESE);
                    // read selectedRestaurantType.contains(RestaurantType.CHINESE)
                    selectedRestaurantTypeContainsRestaurantTypeCHINESE = selectedRestaurantType.contains(com.example.torang_core.data.model.RestaurantType.CHINESE);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.torang_core.util.BindingAdapterKt.select(this.textView10, selectedRestaurantTypeContainsRestaurantTypeDRINK);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView4, selectedRestaurantTypeContainsRestaurantTypeKOREAN);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView5, selectedRestaurantTypeContainsRestaurantTypeCHINESE);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView6, selectedRestaurantTypeContainsRestaurantTypeFOREIGN);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView9, selectedRestaurantTypeContainsRestaurantTypeJAPANESE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView10.setOnClickListener(mCallback17);
            this.textView4.setOnClickListener(mCallback13);
            this.textView5.setOnClickListener(mCallback14);
            this.textView6.setOnClickListener(mCallback15);
            this.textView9.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sryang.screen_filter.FilterViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.setFood(com.example.torang_core.data.model.RestaurantType.DRINK);
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




                    vm.setFood(com.example.torang_core.data.model.RestaurantType.FOREIGN);
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




                    vm.setFood(com.example.torang_core.data.model.RestaurantType.KOREAN);
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




                    vm.setFood(com.example.torang_core.data.model.RestaurantType.JAPANESE);
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




                    vm.setFood(com.example.torang_core.data.model.RestaurantType.CHINESE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): selectedRestaurantType
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}