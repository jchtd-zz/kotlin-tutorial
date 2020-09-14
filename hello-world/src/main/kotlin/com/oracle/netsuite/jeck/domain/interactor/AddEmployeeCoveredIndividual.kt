package com.oracle.netsuite.jeck.domain.interactor

import com.oracle.netsuite.jeck.domain.entity.Employee
import com.oracle.netsuite.jeck.domain.entity.EmployeeCoveredIndividual
import com.oracle.netsuite.jeck.domain.interactor.common.BaseInteractor
import java.time.LocalDate

class AddEmployeeCoveredIndividual(private val employeeId: Int, private val name: String, private val startDate: LocalDate, private val endDate: LocalDate): BaseInteractor() {
    private fun isCoveredAfterEmployeeHireDate(employeeHireDate: LocalDate, startDate: LocalDate): Boolean {
        // logic logic logic
        return true
    }
    private fun isRangeValid(startDate: LocalDate, endDate: LocalDate): Boolean {
        // logic logic logic
        return true
    }
    override fun execute(): EmployeeCoveredIndividual {
        val isRangeValid = isRangeValid(startDate, endDate)
        val hireDate = GetEmployeeHireDate(employeeId).execute()
        val isCoveredAfterHireDate = isCoveredAfterEmployeeHireDate(hireDate, startDate)
        return EmployeeCoveredIndividual(88, name, employeeId, startDate, endDate)
    }
}