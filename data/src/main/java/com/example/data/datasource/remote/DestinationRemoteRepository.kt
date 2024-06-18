package com.example.data.datasource.remote

import com.example.data.datasource.remote.model.DestinationRemoteDo
import kotlinx.coroutines.flow.Flow

/**
 * Interface for the remote repository of Destination.
 *
 * This interface defines the operations that can be performed on the remote repository of Destination.
 */
interface DestinationRemoteRepository {

    /**
     * Creates a new destination in the remote repository.
     *
     * @param destination The DestinationRemoteDo object to be created.
     * @return Boolean indicating the success of the operation.
     */
    suspend fun create(destination: DestinationRemoteDo): Flow<Boolean>

    /**
     * Deletes a destination identified by the given id from the remote repository.
     *
     * @param id The id of the destination to be deleted.
     * @return Boolean indicating the success of the operation.
     */
    fun deleteById(id: Int): Flow<Boolean>

    /**
     * Fetches all destinations from the remote repository.
     *
     * @return Result object containing a list of DestinationRemoteDo objects if the operation is successful.
     */
    fun getAll(): Flow<List<DestinationRemoteDo>>

    /**
     * Updates a given destination in the remote repository.
     *
     * @param id The id of the destination to be updated.
     * @param destination The DestinationRemoteDo object to be updated.
     * @return Boolean indicating the success of the operation.
     */
    fun update(id: Int, destination: DestinationRemoteDo): Flow<Boolean>
}