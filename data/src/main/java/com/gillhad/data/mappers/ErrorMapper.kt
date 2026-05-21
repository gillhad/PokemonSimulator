package com.gillhad.data.mappers

import com.gillhad.domain.models.AppError
import okio.IOException
import retrofit2.HttpException

fun Throwable.toAppError(): AppError{
    return when(this){
        is IOException -> AppError.NetworkError()
        is HttpException ->  when (this.code()) {
            404 -> AppError.NotFound()
            500 -> AppError.ServerError()
            else -> AppError.UnknownError()
        }
        else -> AppError.UnknownError()
    }
}