package com.kameonlibrary.ui.main.files

import com.kameonlibrary.network.model.FileListData
import com.kameonlibrary.network.model.FolderListData
import com.kameonlibrary.network.model.FolderListResponse


/**
 * Created by Pramod on 3/19/23.
 */
data class FileState(
    val isLoading:Boolean=false,
    val data: ArrayList<FileListData>? = ArrayList<FileListData>(),
    val error:String=""
)
