package com.rohantaneja.domain.repository

import com.rohantaneja.domain.model.GithubProject
import io.reactivex.Completable
import io.reactivex.Observable

/*
Contains data access/manipulation methods
 */
interface GithubProjectsRepository {

    fun getGithubProjects(): Observable<List<GithubProject>>

    fun bookmarkGithubProject(projectId: String): Completable

    fun unbookmarkGithubProject(projectId: String): Completable

    fun getBookmarkedGithubProjects(): Observable<List<GithubProject>>

}