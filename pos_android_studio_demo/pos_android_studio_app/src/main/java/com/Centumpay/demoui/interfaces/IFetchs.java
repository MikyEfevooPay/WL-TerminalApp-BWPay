package com.BusinessWallet.demoui.interfaces;

import androidx.annotation.Nullable;

import com.BusinessWallet.demoui.utils.FetchUIManager;

import java.util.List;

public interface IFetchs {
    void addFetchs(FetchUIManager manager) throws Exception;
    void onFetchCurrentResult(FetchEntity entity,@Nullable FetchEntity error);
    void onFetchResults(List<FetchEntity> entities, List<FetchEntity> errors);
    void onRequestsFetching(boolean isFetching);
}
