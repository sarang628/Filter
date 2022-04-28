package com.sryang.screen_filter;

import java.lang.System;

/**
 * [FragmentFilterParentBinding]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/sryang/screen_filter/FilterParentFragment;", "Landroidx/fragment/app/Fragment;", "()V", "filterViewModel", "Lcom/sryang/screen_filter/FilterViewModel;", "getFilterViewModel", "()Lcom/sryang/screen_filter/FilterViewModel;", "filterViewModel$delegate", "Lkotlin/Lazy;", "nationFragment", "Lcom/example/travelmode/SelectNationFragment;", "selectNationViewModel", "Lcom/example/travelmode/SelectNationViewModel;", "getSelectNationViewModel", "()Lcom/example/travelmode/SelectNationViewModel;", "selectNationViewModel$delegate", "filterNavigation", "Landroidx/navigation/fragment/NavHostFragment;", "id", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showFilter", "", "b", "", "view", "subScribeUI", "binding", "Lcom/sryang/screen_filter/databinding/FragmentFilterParentBinding;", "screen_filter_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FilterParentFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy filterViewModel$delegate = null;
    
    /**
     * 공유 뷰모델
     */
    private final kotlin.Lazy selectNationViewModel$delegate = null;
    private final com.example.travelmode.SelectNationFragment nationFragment = null;
    
    public FilterParentFragment() {
        super();
    }
    
    private final com.sryang.screen_filter.FilterViewModel getFilterViewModel() {
        return null;
    }
    
    /**
     * 공유 뷰모델
     */
    private final com.example.travelmode.SelectNationViewModel getSelectNationViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void subScribeUI(com.sryang.screen_filter.databinding.FragmentFilterParentBinding binding) {
    }
    
    private final void showFilter(boolean b, android.view.View view) {
    }
    
    private final androidx.navigation.fragment.NavHostFragment filterNavigation(int id) {
        return null;
    }
}