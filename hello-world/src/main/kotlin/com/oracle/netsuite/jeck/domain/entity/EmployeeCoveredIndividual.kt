package com.oracle.netsuite.jeck.domain.entity

import java.time.LocalDate

data class EmployeeCoveredIndividual(
    val id: Int,
    val name: String,
    val employeeId: Int,
    val startDate: LocalDate,
    val endDate: LocalDate
)