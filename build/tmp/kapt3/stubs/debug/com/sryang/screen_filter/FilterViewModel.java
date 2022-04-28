package com.sryang.screen_filter;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010H\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020:J\u000e\u0010I\u001a\u00020\u00062\u0006\u00103\u001a\u00020@J\u000e\u0010J\u001a\u00020\u00062\u0006\u0010K\u001a\u000206J\u000e\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020=R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R\u001a\u0010-\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\'\"\u0004\b/\u0010)R\u001a\u00100\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\'\"\u0004\b2\u0010)R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010!R\u001a\u0010B\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\'\"\u0004\bD\u0010)R\u001a\u0010E\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\'\"\u0004\bG\u0010)\u00a8\u0006N"}, d2 = {"Lcom/sryang/screen_filter/FilterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_clickDistance", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/torang_core/util/Event;", "", "_clickFood", "_clickPrice", "_clickRating", "_clickSearch", "_clickThisArea", "clickDistance", "Landroidx/lifecycle/LiveData;", "getClickDistance", "()Landroidx/lifecycle/LiveData;", "clickFood", "getClickFood", "clickPrice", "getClickPrice", "clickRating", "getClickRating", "clickSearch", "getClickSearch", "clickThisArea", "getClickThisArea", "filter", "Lcom/example/torang_core/data/model/Filter;", "getFilter", "()Lcom/example/torang_core/data/model/Filter;", "food", "", "getFood", "()Landroidx/lifecycle/MutableLiveData;", "isShow", "", "latitudeMyLocation", "", "getLatitudeMyLocation", "()D", "setLatitudeMyLocation", "(D)V", "longitudeMyLocation", "getLongitudeMyLocation", "setLongitudeMyLocation", "northEastLatitude", "getNorthEastLatitude", "setNorthEastLatitude", "northEastLongitude", "getNorthEastLongitude", "setNorthEastLongitude", "ratings", "getRatings", "selectedDistances", "Lcom/example/torang_core/data/model/Distances;", "getSelectedDistances", "selectedFoods", "Ljava/util/ArrayList;", "Lcom/example/torang_core/data/model/RestaurantType;", "getSelectedFoods", "selectedPrice", "Lcom/example/torang_core/data/model/Prices;", "getSelectedPrice", "selectedRatings", "Lcom/example/torang_core/data/model/Ratings;", "getSelectedRatings", "southWestLatitude", "getSouthWestLatitude", "setSouthWestLatitude", "southWestLongitude", "getSouthWestLongitude", "setSouthWestLongitude", "setFood", "setSelectRatings", "setSelectedDistances", "distances", "setSelectedPrice", "price", "screen_filter_debug"})
public final class FilterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> food = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ratings = null;
    
    /**
     * 거리 필터
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances> selectedDistances = null;
    
    /**
     * 가격 필터
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices> selectedPrice = null;
    
    /**
     * 음식종류 필터
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.RestaurantType>> selectedFoods = null;
    
    /**
     * 평점필터
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.Ratings>> selectedRatings = null;
    
    /**
     * 거리 필터 클릭
     */
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.util.Event<kotlin.Unit>> _clickDistance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> clickDistance = null;
    
    /**
     * 가격 필터 클릭
     */
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.util.Event<kotlin.Unit>> _clickPrice = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> clickPrice = null;
    
    /**
     * 평점 필터 클릭
     */
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.util.Event<kotlin.Unit>> _clickRating = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> clickRating = null;
    
    /**
     * 음식 필터 클릭
     */
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.util.Event<kotlin.Unit>> _clickFood = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> clickFood = null;
    
    /**
     * 재검색 클릭
     */
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.util.Event<kotlin.Unit>> _clickSearch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> clickSearch = null;
    
    /**
     * 이 지역 클릭
     */
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.util.Event<kotlin.Unit>> _clickThisArea = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> clickThisArea = null;
    
    /**
     * 내 위치
     */
    private double latitudeMyLocation = 0.0;
    private double longitudeMyLocation = 0.0;
    
    /**
     * 이 지역 위치
     */
    private double northEastLatitude = 0.0;
    private double northEastLongitude = 0.0;
    private double southWestLatitude = 0.0;
    private double southWestLongitude = 0.0;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShow = null;
    
    @javax.inject.Inject()
    public FilterViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFood() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRatings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Distances> getSelectedDistances() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.torang_core.data.model.Prices> getSelectedPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.RestaurantType>> getSelectedFoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.model.Ratings>> getSelectedRatings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> getClickDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> getClickPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> getClickRating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> getClickFood() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> getClickSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.util.Event<kotlin.Unit>> getClickThisArea() {
        return null;
    }
    
    public final double getLatitudeMyLocation() {
        return 0.0;
    }
    
    public final void setLatitudeMyLocation(double p0) {
    }
    
    public final double getLongitudeMyLocation() {
        return 0.0;
    }
    
    public final void setLongitudeMyLocation(double p0) {
    }
    
    public final double getNorthEastLatitude() {
        return 0.0;
    }
    
    public final void setNorthEastLatitude(double p0) {
    }
    
    public final double getNorthEastLongitude() {
        return 0.0;
    }
    
    public final void setNorthEastLongitude(double p0) {
    }
    
    public final double getSouthWestLatitude() {
        return 0.0;
    }
    
    public final void setSouthWestLatitude(double p0) {
    }
    
    public final double getSouthWestLongitude() {
        return 0.0;
    }
    
    public final void setSouthWestLongitude(double p0) {
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.torang_core.data.model.Filter getFilter() {
        return null;
    }
    
    public final void clickDistance() {
    }
    
    public final void clickFood() {
    }
    
    public final void clickPrice() {
    }
    
    public final void clickRating() {
    }
    
    public final void clickSearch() {
    }
    
    public final void clickThisArea() {
    }
}