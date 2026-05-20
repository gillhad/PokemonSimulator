package com.gillhad.data.models

import kotlinx.serialization.Serializable

@Serializable
data class MoveDTO(
    val name: String?,
    val url: String?
)