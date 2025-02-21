package academy.softserve.dogs

import academy.softserve.dogs.model.Dog
import academy.softserve.dogs.service.DogService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dogs")
class DogController @Autowired constructor(
    private val dogService: DogService
) {
    @GetMapping
    fun findAll(): Flow<Dog> = flow { dogService.getAll().forEach { dog -> emit(dog) } }

    @GetMapping("/{id}")
    suspend fun findById(@PathVariable id: Int): Dog? = dogService.getById(id)
}