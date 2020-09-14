package com.oracle.netsuite.jeck.domain.interactor

import com.oracle.netsuite.jeck.domain.entity.TimeOffRecord
import com.oracle.netsuite.jeck.domain.entity.TimeOffRecord2
import com.oracle.netsuite.jeck.domain.entity.TimeOffStatus

class CopyTimeOff {
    fun copy1(timeOff: TimeOffRecord): TimeOffRecord{
        /** readable toString() - more apparent when testing */
        println(timeOff.toString())
        /** can copy class to new instance and change select parameters */
        val newTimeOff = timeOff.copy(status = TimeOffStatus.PENDING_APPROVAL)
        /** can be destructured */
        val (id, status) = newTimeOff
        println("The new timeoff is $id having $status")
        return newTimeOff
    }
    fun copy2(timeOff2: TimeOffRecord2): TimeOffRecord2 {
        /** less readable toString() */
        println(timeOff2.toString())
        /** cannot copy */
//        val newTimeOff = timeOff2.copy(status = TimeOffStatus.PENDING_APPROVAL)
        /** cannot be destructured */
//        val (id, status) = timeOff2
//        println("The new timeoff is $id having $status")
        return timeOff2
    }
}