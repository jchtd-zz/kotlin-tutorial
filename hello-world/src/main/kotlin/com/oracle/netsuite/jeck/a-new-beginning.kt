package com.oracle.netsuite.jeck

import com.oracle.netsuite.jeck.domain.entity.EmployeeCoveredIndividual
import com.oracle.netsuite.jeck.domain.entity.OnboardingTask
import com.oracle.netsuite.jeck.domain.entity.TimeOffRecord
import com.oracle.netsuite.jeck.domain.interactor.AddEmployeeCoveredIndividual
import com.oracle.netsuite.jeck.domain.interactor.ApproveTimeOff
import com.oracle.netsuite.jeck.domain.interactor.CompleteOnboardingTask
import com.oracle.netsuite.jeck.presentation.PrinterPresenter
import java.time.LocalDate

fun main(){
    val approvedTor: TimeOffRecord = ApproveTimeOff(88).execute()
    val finishedOnboardingTask: OnboardingTask = CompleteOnboardingTask(98).execute()
    val coveredIndividual: EmployeeCoveredIndividual = AddEmployeeCoveredIndividual(108, "Andres Bonificatio", LocalDate.now(), LocalDate.now()).execute()

    val viewModel = object {
        val timeOffRecord: TimeOffRecord = approvedTor
        val onboardingTask: OnboardingTask = finishedOnboardingTask
        val coveredIndividual: EmployeeCoveredIndividual = coveredIndividual
    }

    PrinterPresenter().display(viewModel)
}
