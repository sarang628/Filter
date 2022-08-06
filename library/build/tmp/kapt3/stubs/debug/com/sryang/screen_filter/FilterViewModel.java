package com.sryang.screen_filter;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.OptIn(markerClass = {kotlinx.coroutines.InternalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ1\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/sryang/screen_filter/FilterViewModel;", "Landroidx/lifecycle/ViewModel;", "mapRepository", "Lcom/example/torang_core/repository/MapRepository;", "findRepository", "Lcom/example/torang_core/repository/FindRepository;", "filterRepository", "Lcom/example/torang_core/repository/FilterRepository;", "nationRepository", "Lcom/example/torang_core/repository/NationRepository;", "(Lcom/example/torang_core/repository/MapRepository;Lcom/example/torang_core/repository/FindRepository;Lcom/example/torang_core/repository/FilterRepository;Lcom/example/torang_core/repository/NationRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/sryang/screen_filter/FilterUiState;", "isShow", "Landroidx/lifecycle/MutableLiveData;", "", "selected", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/torang_core/data/NationItem;", "getSelected", "()Lkotlinx/coroutines/flow/StateFlow;", "showRestaurantCardAndFilter", "getShowRestaurantCardAndFilter", "uiState", "getUiState", "searchBoundRestaurant", "", "northEastLatitude", "", "northEastLongitude", "southWestLatitude", "southWestLongitude", "(DDDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchFilterRestaurant", "setFood", "food", "Lcom/example/torang_core/data/model/RestaurantType;", "setSelectRatings", "ratings", "Lcom/example/torang_core/data/model/Ratings;", "setSelectedDistances", "distances", "Lcom/example/torang_core/data/model/Distances;", "setSelectedPrice", "price", "Lcom/example/torang_core/data/model/Prices;", "library_debug"})
public final class FilterViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.torang_core.repository.MapRepository mapRepository = null;
    private final com.example.torang_core.repository.FindRepository findRepository = null;
    private final com.example.torang_core.repository.FilterRepository filterRepository = null;
    private final com.example.torang_core.repository.NationRepository nationRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.sryang.screen_filter.FilterUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.sryang.screen_filter.FilterUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.torang_core.data.NationItem> selected = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showRestaurantCardAndFilter = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShow = null;
    
    @javax.inject.Inject()
    public FilterViewModel(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.MapRepository mapRepository, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.FindRepository findRepository, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.FilterRepository filterRepository, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.NationRepository nationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.sryang.screen_filter.FilterUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.torang_core.data.NationItem> getSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowRestaurantCardAndFilter() {
        return null;
    }
    
    /**
     * 음식 종류 선택
     */
    public final void setFood(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.model.RestaurantType food) {
    }
    
    public final void setSelectedPrice(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.model.Prices price) {
    }
    
    public final void setSelectRatings(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.model.Ratings ratings) {
    }
    
    public final void setSelectedDistances(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.model.Distances distances) {
    }
    
    public final void searchFilterRestaurant() {
    }
    
    public final void searchBoundRestaurant() {
    }
    
    private final java.lang.Object searchBoundRestaurant(double northEastLatitude, double northEastLongitude, double southWestLatitude, double southWestLongitude, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}