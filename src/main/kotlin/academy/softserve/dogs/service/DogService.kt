package academy.softserve.dogs.service

import academy.softserve.dogs.model.Dog
import academy.softserve.dogs.model.Sex
import org.springframework.stereotype.Component

interface DogService {
    fun getAll(): List<Dog>
    fun getById(id: Int): Dog?
}

@Component
class DogServiceImpl : DogService {

    override fun getAll(): List<Dog> = dogs
    override fun getById(id: Int): Dog? = dogs.firstOrNull { it.id == id }

    companion object {
        val dogs = listOf(
            Dog(
                id = 1,
                title = "Monty",
                sex = Sex.MALE,
                age = 14,
                description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
                dogImage = "/images/dog/p1.jpeg"
            ),
            Dog(
                id = 2,
                title = "Jubilee",
                sex = Sex.FEMALE,
                age = 6,
                description = "Jubilee enjoys thoughtful discussions by the campfire.",
                dogImage = "/images/dog/p2.jpeg"
            ),
            Dog(
                id = 3,
                title = "Beezy",
                sex = Sex.MALE,
                age = 8,
                description = "Beezy's favorite past-time is helping you choose your brand color.",
                dogImage = "/images/dog/p3.jpeg"
            ),
            Dog(
                id = 4,
                title = "Mochi",
                sex = Sex.MALE,
                age = 10,
                description = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
                dogImage = "/images/dog/p4.jpeg"
            ),
            Dog(
                id = 5,
                title = "Brewery",
                sex = Sex.FEMALE,
                age = 12,
                description = "Brewery loves fetching you your favorite homebrew.",
                dogImage = "/images/dog/p5.jpeg"
            ),
            Dog(
                id = 6,
                title = "Lucy",
                sex = Sex.FEMALE,
                age = 8,
                description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
                dogImage = "/images/dog/p6.jpeg"
            ),
            Dog(
                id = 7,
                title = "Astro",
                sex = Sex.MALE,
                age = 10,
                description = "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
                dogImage = "/images/dog/p7.jpeg"
            ),
            Dog(
                id = 8,
                title = "Boo",
                sex = Sex.FEMALE,
                age = 9,
                description = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
                dogImage = "/images/dog/p8.jpeg"
            ),
            Dog(
                id = 9,
                title = "Pippa",
                sex = Sex.MALE,
                age = 7,
                description = "Pippa likes to look out the window and write pup-poetry.",
                dogImage = "/images/dog/p9.jpeg"
            ),
            Dog(
                id = 10,
                title = "Coco",
                sex = Sex.FEMALE,
                age = 10,
                description = "Coco enjoys getting pampered at the local puppy spa.",
                dogImage = "/images/dog/p10.jpeg"
            ),
            Dog(
                id = 11,
                title = "Brody",
                sex = Sex.MALE,
                age = 13,
                description = "Brody is a good boy, waiting for your next command.",
                dogImage = "/images/dog/p11.jpeg"
            ),
            Dog(
                id = 12,
                title = "Stella",
                sex = Sex.FEMALE,
                age = 14,
                description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
                dogImage = "/images/dog/p12.jpeg"
            ),
        )
    }
}