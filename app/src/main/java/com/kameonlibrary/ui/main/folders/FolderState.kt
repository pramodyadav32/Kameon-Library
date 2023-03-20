package com.kameonlibrary.ui.main.folders

import com.kameonlibrary.network.model.FolderListData


/**
 * Created by Pramod on 3/19/23.
 */
data class FolderState(
    val isLoading:Boolean=false,
    val data: ArrayList<FolderListData>? = ArrayList<FolderListData>(),
    val error:String=""
)
