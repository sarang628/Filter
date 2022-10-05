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
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_price, 6);
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
        else if (BR.ratings == variableId) {
            setRatings((java.util.ArrayList<com.sryang.torang_core.data.entity.Ratings>) variable);
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
    public void setRatings(@Nullable java.util.ArrayList<com.sryang.torang_core.data.entity.Ratings> Ratings) {
        this.mRatings = Ratings;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ratings);
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
        boolean ratingsContainsRatingsFOUR = false;
        boolean ratingsContainsRatingsFIVE = false;
        com.sryang.screen_filter.FilterViewModel vm = mVm;
        boolean ratingsContainsRatingsTHREE = false;
        boolean ratingsContainsRatingsONE = false;
        java.util.ArrayList<com.sryang.torang_core.data.entity.Ratings> ratings = mRatings;
        boolean ratingsContainsRatingsTWO = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (ratings != null) {
                    // read ratings.contains(Ratings.FOUR)
                    ratingsContainsRatingsFOUR = ratings.contains(com.sryang.torang_core.data.entity.Ratings.FOUR);
                    // read ratings.contains(Ratings.FIVE)
                    ratingsContainsRatingsFIVE = ratings.contains(com.sryang.torang_core.data.entity.Ratings.FIVE);
                    // read ratings.contains(Ratings.THREE)
                    ratingsContainsRatingsTHREE = ratings.contains(com.sryang.torang_core.data.entity.Ratings.THREE);
                    // read ratings.contains(Ratings.ONE)
                    ratingsContainsRatingsONE = ratings.contains(com.sryang.torang_core.data.entity.Ratings.ONE);
                    // read ratings.contains(Ratings.TWO)
                    ratingsContainsRatingsTWO = ratings.contains(com.sryang.torang_core.data.entity.Ratings.TWO);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView10, ratingsContainsRatingsFIVE);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView4, ratingsContainsRatingsONE);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView5, ratingsContainsRatingsTWO);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView6, ratingsContainsRatingsTHREE);
            com.sryang.torang_core.util.BindingAdapterKt.select(this.textView9, ratingsContainsRatingsFOUR);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView10.setOnClickListener(mCallback5);
            this.textView4.setOnClickListener(mCallback1);
            this.textView5.setOnClickListener(mCallback2);
            this.textView6.setOnClickListener(mCallback3);
            this.textView9.setOnClickListener(mCallback4);
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




                    vm.setSelectRatings(com.sryang.torang_core.data.entity.Ratings.FOUR);
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




                    vm.setSelectRatings(com.sryang.torang_core.data.entity.Ratings.TWO);
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




                    vm.setSelectRatings(com.sryang.torang_core.data.entity.Ratings.FIVE);
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




                    vm.setSelectRatings(com.sryang.torang_core.data.entity.Ratings.THREE);
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




                    vm.setSelectRatings(com.sryang.torang_core.data.entity.Ratings.ONE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): ratings
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}