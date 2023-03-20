package com.kameonlibrary.ui.main.fileDetails

import com.kameonlibrary.network.model.FileListData


/**
 * Created by Pramod on 3/19/23.
 */
data class FileDetailsState(
    val isLoading:Boolean=false,
    val data: FileListData? = FileListData(),
    val error:String=""
)
