package com.Centumpay.demoui.interfaces;

public interface IFetching {
    void onFetchResult(Object result, String error);
    void onRequestFetching(boolean isFetching);
    void setBodyContentType(String _contentType);
}
