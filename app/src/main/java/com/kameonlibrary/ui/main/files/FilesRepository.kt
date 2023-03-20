package com.kameonlibrary.ui.main.files

import com.kameonlibrary.network.interceptors.ApiFactory
import com.kameonlibrary.network.interceptors.ApiService
import com.kameonlibrary.network.model.FileListData
import com.kameonlibrary.network.model.FolderListResponse
import com.kameonlibrary.util.Resource
import java.lang.Exception
import javax.inject.Inject

/**
 * Created by Pramod on 3/19/23.
 */
class FilesRepository @Inject constructor(private val apiService: ApiService?) {


    suspend fun getAllFiles():Resource<ArrayList<FileListData>>{
        return  try{
            val _apiService = ApiFactory.application?.create(
                ApiService::class.java
            )
            val result = _apiService?.getAllFiles()
            Resource.Success(data = result)
        }catch (e: Exception){
            Resource.Error(message = e.message.toString())
        }
    }


}