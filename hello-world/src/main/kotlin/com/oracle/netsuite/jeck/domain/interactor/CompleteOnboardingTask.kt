package com.oracle.netsuite.jeck.domain.interactor

import com.oracle.netsuite.jeck.domain.entity.OnboardingTask
import com.oracle.netsuite.jeck.domain.entity.OnboardingTaskStatus
import com.oracle.netsuite.jeck.domain.interactor.common.BaseInteractor

class CompleteOnboardingTask(private val onboardingTaskId: Int): BaseInteractor() {
    override fun execute(): OnboardingTask {
        println("Onboarding task completed")
        return OnboardingTask(id = onboardingTaskId, taskStatus = OnboardingTaskStatus.COMPLETED)
    }
}