package com.rohantaneja.domain.exectuor

import io.reactivex.Scheduler

interface PostExecutionThread {
    val scheduler: Scheduler;
}