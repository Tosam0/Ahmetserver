package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

interface HeroRepositoryAlternative {

    val heroes:  List<Hero>

    suspend fun getAllHeroes(page: Int = 1,limit: Int = 6): ApiResponse //4 5 yapıldı unutma
    suspend fun searchHeroes(name: String?): ApiResponse
}
