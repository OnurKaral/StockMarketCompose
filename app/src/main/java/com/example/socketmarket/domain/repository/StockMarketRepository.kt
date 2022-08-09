package com.example.socketmarket.domain.repository

import com.example.socketmarket.domain.model.CompanyListing
import com.example.socketmarket.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query

interface StockMarketRepository {

    suspend fun getCompanyListings(
        fetchFromRemote:  Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}