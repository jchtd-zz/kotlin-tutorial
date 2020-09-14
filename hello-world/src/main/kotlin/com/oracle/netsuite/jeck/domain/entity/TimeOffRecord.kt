package com.oracle.netsuite.jeck.domain.entity

data class TimeOffRecord (
    val id: Int,
    val status: TimeOffStatus
)

/** You can create a similar structure by using just class: */
class TimeOffRecord2 (
    val id: Int,
    val status: TimeOffStatus
)

/** So why use data classes? */