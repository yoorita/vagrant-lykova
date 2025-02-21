package academy.softserve.dogs.model

import kotlinx.serialization.Serializable

@Serializable
data class Dog(
    val id: Int,
    val title: String,
    val sex: Sex,
    val age: Int,
    val description: String,
    val dogImage: String
)

enum class Sex {
    MALE, FEMALE
}