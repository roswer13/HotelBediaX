package com.example.data.datasource.remote

import com.example.data.datasource.remote.model.DestinationRemoteDo
import com.example.data.datasource.remote.network.ApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DestinationRemoteRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : DestinationRemoteRepository {
    override suspend fun create(destination: DestinationRemoteDo): Flow<Boolean> {
        return try {
            flow { emit(apiService.create(destination = destination)) }
        } catch (e: Exception) {
            flow { throw e }
        }
    }

    override fun deleteById(id: Int): Flow<Boolean> {
        return try {
            flow { emit(apiService.deleteById(id = id)) }
        } catch (e: Exception) {
            flow { throw e }
        }
    }

    override fun getAll(): Flow<List<DestinationRemoteDo>> {
        return try {
            flow { emit(apiService.getAll()) }
        } catch (e: Exception) {
            flow { throw e }
        }
    }

    override fun update(id: Int, destination: DestinationRemoteDo): Flow<Boolean> {
        return try {
            flow { emit(apiService.update(id = id, destination = destination)) }
        } catch (e: Exception) {
            flow { throw e }
        }
    }
}