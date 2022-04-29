package com.sryang.screen_filter.databinding;
import com.sryang.screen_filter.R;
import com.sryang.screen_filter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFilterParentBindingImpl extends FragmentFilterParentBinding implements com.sryang.screen_filter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.filter_container1, 3);
        sViewsWithIds.put(R.id.constraintLayout2, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFilterParentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentFilterParentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.fragment.app.FragmentContainerView) bindings[3]
            );
        this.btnThisLoc.setTag(null);
        this.button.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.filterViewModel == variableId) {
            setFilterViewModel((com.sryang.screen_filter.FilterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFilterViewModel(@Nullable com.sryang.screen_filter.FilterViewModel FilterViewModel) {
        this.mFilterViewModel = FilterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.filterViewModel);
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
        com.sryang.screen_filter.FilterViewModel filterViewModel = mFilterViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnThisLoc.setOnClickListener(mCallback7);
            this.button.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // filterViewModel != null
                boolean filterViewModelJavaLangObjectNull = false;
                // filterViewModel
                com.sryang.screen_filter.FilterViewModel filterViewModel = mFilterViewModel;



                filterViewModelJavaLangObjectNull = (filterViewModel) != (null);
                if (filterViewModelJavaLangObjectNull) {


                    filterViewModel.clickThisArea();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // filterViewModel != null
                boolean filterViewModelJavaLangObjectNull = false;
                // filterViewModel
                com.sryang.screen_filter.FilterViewModel filterViewModel = mFilterViewModel;



                filterViewModelJavaLangObjectNull = (filterViewModel) != (null);
                if (filterViewModelJavaLangObjectNull) {


                    filterViewModel.clickSearch();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): filterViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}