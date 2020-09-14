package com.oracle.netsuite.jeck.domain.interactor

import com.oracle.netsuite.jeck.domain.interactor.common.BaseInteractor
import java.time.LocalDate

class GetEmployeeHireDate(private val employeeId: Int): BaseInteractor() {
    override fun execute(): LocalDate {
        return LocalDate.of(2000,1,1)
    }
}