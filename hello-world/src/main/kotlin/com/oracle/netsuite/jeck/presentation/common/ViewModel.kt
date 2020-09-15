package com.oracle.netsuite.jeck.presentation.common

import com.oracle.netsuite.jeck.domain.entity.EmployeeCoveredIndividual
import com.oracle.netsuite.jeck.domain.entity.OnboardingTask
import com.oracle.netsuite.jeck.domain.entity.TimeOffRecord

data class ViewModel (
    val timeOffRecord: TimeOffRecord,
    val onboardingTask: OnboardingTask,
    val coveredIndividual: EmployeeCoveredIndividual
)