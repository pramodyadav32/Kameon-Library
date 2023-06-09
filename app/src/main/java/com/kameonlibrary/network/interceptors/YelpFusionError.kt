package com.kameonlibrary.network.interceptors

import java.io.IOException

/**
 * Created by Pramod on 3/19/23.
 */
abstract class YelpFusionError(
    val responseCode: Int,
    override val message: String,
    val code: String,
    val description: String
) : IOException()