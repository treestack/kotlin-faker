package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.STRANGER_THINGS] category.
 */
class StrangerThings internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.STRANGER_THINGS

    val character = resolve { fakerService.resolve(Faker, it, "character") }
    val quote = resolve { fakerService.resolve(Faker, it, "quote") }
}