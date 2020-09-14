package com.oracle.netsuite.jeck.domain.interactor

import com.oracle.netsuite.jeck.domain.entity.TimeOffRecord
import com.oracle.netsuite.jeck.domain.entity.TimeOffStatus
import com.oracle.netsuite.jeck.domain.interactor.common.BaseInteractor

class ApproveTimeOff(private val timeOffId: Int): BaseInteractor() {
    companion object { // static variables and functions
        val APPROVED = TimeOffStatus.APPROVED
    }
    private fun canBeApproved(): Boolean {
        // logic
        return true
    }
    override fun execute(): TimeOffRecord {
        val timeOffCanBeApproved = canBeApproved()
        // logic
        println("Time-off approved")
        return TimeOffRecord(id = this.timeOffId, status = APPROVED)
    }
}