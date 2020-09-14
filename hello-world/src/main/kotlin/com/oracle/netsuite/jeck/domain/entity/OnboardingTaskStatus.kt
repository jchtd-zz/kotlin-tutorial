package com.oracle.netsuite.jeck.domain.entity

/**
 * Enum classes: used to model types that represent a finite set of distinct values such as directions, states, modes, and so forth
 */
/** This type of enum class has a property */
enum class OnboardingTaskStatus(val description: String) {
    TO_DO(description = "To be started"),
    IN_PROGRESS(description = "Currently doing task"),
    COMPLETED(description = "Done")
}