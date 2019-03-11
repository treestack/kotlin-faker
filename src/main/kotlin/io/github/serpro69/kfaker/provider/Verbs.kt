package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.VERBS] category.
 */
class Verbs internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.VERBS

    val base = resolve { fakerService.resolve(Faker, it, "base") }
    val past = resolve { fakerService.resolve(Faker, it, "past") }
    val pastParticiple = resolve { fakerService.resolve(Faker, it, "past_participle") }
    val simplePresent = resolve { fakerService.resolve(Faker, it, "simple_present") }
    val ingForm = resolve { fakerService.resolve(Faker, it, "ing_form") }
}