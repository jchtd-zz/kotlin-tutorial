package com.oracle.netsuite.jeck.domain.entity

import java.time.LocalDate

/**
 * - Data classes make it easy to create classes that are used to store values
 * - automatically provided with methods for copying, getting a string representation, and using instances in collections
 */
data class Employee (
    val id: Int,
    val hireDate: LocalDate,
    val firstName: String,
    val lastName: String
)