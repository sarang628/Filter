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
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFoodFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentFoodFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.tvFood.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        mCallback21 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 5);
        mCallback19 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 3);
        mCallback20 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 4);
        mCallback18 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
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
                return onChangeVmSelectedFoods((androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.RestaurantType>>) object, fieldId);
            case 1 :
                return onChangeVmFood((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSelectedFoods(androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.RestaurantType>> VmSelectedFoods, int fieldId) {
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean vmSelectedFoodsContainsRestaurantTypeJAPANESE = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.RestaurantType>> vmSelectedFoods = null;
        boolean vmSelectedFoodsContainsRestaurantTypeFOREIGN = false;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        java.util.ArrayList<com.example.torang_core.data.model.RestaurantType> vmSelectedFoodsGetValue = null;
        boolean vmSelectedFoodsContainsRestaurantTypeCHINESE = false;
        java.lang.String vmFoodGetValue = null;
        boolean vmSelectedFoodsContainsRestaurantTypeDRINK = false;
        boolean vmSelectedFoodsContainsRestaurantTypeKOREAN = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmFood = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.selectedFoods
                        vmSelectedFoods = vm.getSelectedFoods();
                    }
                    updateLiveDataRegistration(0, vmSelectedFoods);


                    if (vmSelectedFoods != null) {
                        // read vm.selectedFoods.getValue()
                        vmSelectedFoodsGetValue = vmSelectedFoods.getValue();
                    }


                    if (vmSelectedFoodsGetValue != null) {
                        // read vm.selectedFoods.getValue().contains(RestaurantType.JAPANESE)
                        vmSelectedFoodsContainsRestaurantTypeJAPANESE = vmSelectedFoodsGetValue.contains(com.example.torang_core.data.model.RestaurantType.JAPANESE);
                        // read vm.selectedFoods.getValue().contains(RestaurantType.FOREIGN)
                        vmSelectedFoodsContainsRestaurantTypeFOREIGN = vmSelectedFoodsGetValue.contains(com.example.torang_core.data.model.RestaurantType.FOREIGN);
                        // read vm.selectedFoods.getValue().contains(RestaurantType.CHINESE)
                        vmSelectedFoodsContainsRestaurantTypeCHINESE = vmSelectedFoodsGetValue.contains(com.example.torang_core.data.model.RestaurantType.CHINESE);
                        // read vm.selectedFoods.getValue().contains(RestaurantType.DRINK)
                        vmSelectedFoodsContainsRestaurantTypeDRINK = vmSelectedFoodsGetValue.contains(com.example.torang_core.data.model.RestaurantType.DRINK);
                        // read vm.selectedFoods.getValue().contains(RestaurantType.KOREAN)
                        vmSelectedFoodsContainsRestaurantTypeKOREAN = vmSelectedFoodsGetValue.contains(com.example.torang_core.data.model.RestaurantType.KOREAN);
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

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
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.torang_core.util.BindingAdapterKt.select(this.textView10, vmSelectedFoodsContainsRestaurantTypeDRINK);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView4, vmSelectedFoodsContainsRestaurantTypeKOREAN);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView5, vmSelectedFoodsContainsRestaurantTypeCHINESE);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView6, vmSelectedFoodsContainsRestaurantTypeFOREIGN);
            com.example.torang_core.util.BindingAdapterKt.select(this.textView9, vmSelectedFoodsContainsRestaurantTypeJAPANESE);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.textView10.setOnClickListener(mCallback21);
            this.textView4.setOnClickListener(mCallback17);
            this.textView5.setOnClickListener(mCallback18);
            this.textView6.setOnClickListener(mCallback19);
            this.textView9.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFood, vmFoodGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
        flag 0 (0x1L): vm.selectedFoods
        flag 1 (0x2L): vm.food
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}