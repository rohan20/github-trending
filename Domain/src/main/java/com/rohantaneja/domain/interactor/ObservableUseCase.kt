package com.rohantaneja.domain.interactor

import com.rohantaneja.domain.exectuor.PostExecutionThread
import io.reactivex.Observable

abstract class ObservableUseCase<T, in Params> constructor(
        private val postExecutionThread: PostExecutionThread) {

    protected abstract fun buildUseCaseObservable(params: Params? = null): Observable<T>
}