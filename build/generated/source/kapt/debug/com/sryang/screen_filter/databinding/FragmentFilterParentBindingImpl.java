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
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(3, 
            new String[] {"item_nation1"},
            new int[] {4},
            new int[] {com.example.travelmode.R.layout.item_nation1});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.filter_container1, 5);
    }
    // views
    @Nullable
    private final com.example.travelmode.databinding.ItemNation1Binding mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFilterParentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentFilterParentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            );
        this.btnThisLoc.setTag(null);
        this.button.setTag(null);
        this.constraintLayout2.setTag(null);
        this.mboundView3 = (com.example.travelmode.databinding.ItemNation1Binding) bindings[4];
        setContainedBinding(this.mboundView3);
        setRootTag(root);
        // listeners
        mCallback7 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.sryang.screen_filter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView3.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView3.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.filterViewModel == variableId) {
            setFilterViewModel((com.sryang.screen_filter.FilterViewModel) variable);
        }
        else if (BR.selectNationViewModel == variableId) {
            setSelectNationViewModel((com.example.travelmode.SelectNationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFilterViewModel(@Nullable com.sryang.screen_filter.FilterViewModel FilterViewModel) {
        this.mFilterViewModel = FilterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.filterViewModel);
        super.requestRebind();
    }
    public void setSelectNationViewModel(@Nullable com.example.travelmode.SelectNationViewModel SelectNationViewModel) {
        this.mSelectNationViewModel = SelectNationViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.selectNationViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView3.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSelectNationViewModelSelected((androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSelectNationViewModelSelected(androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem> SelectNationViewModelSelected, int fieldId) {
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
        com.example.torang_core.data.NationItem selectNationViewModelSelectedGetValue = null;
        com.sryang.screen_filter.FilterViewModel filterViewModel = mFilterViewModel;
        int selectNationViewModelSelectedRes = 0;
        androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem> selectNationViewModelSelected = null;
        java.lang.String selectNationViewModelSelectedName = null;
        com.example.travelmode.SelectNationViewModel selectNationViewModel = mSelectNationViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (selectNationViewModel != null) {
                    // read selectNationViewModel.selected
                    selectNationViewModelSelected = selectNationViewModel.getSelected();
                }
                updateLiveDataRegistration(0, selectNationViewModelSelected);


                if (selectNationViewModelSelected != null) {
                    // read selectNationViewModel.selected.getValue()
                    selectNationViewModelSelectedGetValue = selectNationViewModelSelected.getValue();
                }


                if (selectNationViewModelSelectedGetValue != null) {
                    // read selectNationViewModel.selected.getValue().res
                    selectNationViewModelSelectedRes = selectNationViewModelSelectedGetValue.getRes();
                    // read selectNationViewModel.selected.getValue().name
                    selectNationViewModelSelectedName = selectNationViewModelSelectedGetValue.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnThisLoc.setOnClickListener(mCallback7);
            this.button.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView3.setName(selectNationViewModelSelectedName);
            this.mboundView3.setRes(selectNationViewModelSelectedRes);
        }
        executeBindingsOn(mboundView3);
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
        flag 0 (0x1L): selectNationViewModel.selected
        flag 1 (0x2L): filterViewModel
        flag 2 (0x3L): selectNationViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}