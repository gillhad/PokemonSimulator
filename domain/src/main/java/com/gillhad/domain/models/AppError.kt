package com.gillhad.domain.models

sealed class AppError: Throwable() {
    class NetworkError: AppError()
    class ServerError: AppError()
    class NotFound: AppError()
    class UnknownError: AppError()
    data class CustomError(val msg:String): AppError()
}