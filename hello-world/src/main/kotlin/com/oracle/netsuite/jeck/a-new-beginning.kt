package com.oracle.netsuite.jeck

import com.oracle.netsuite.jeck.domain.entity.EmployeeCoveredIndividual
import com.oracle.netsuite.jeck.domain.entity.OnboardingTask
import com.oracle.netsuite.jeck.domain.entity.TimeOffRecord
import com.oracle.netsuite.jeck.domain.interactor.AddEmployeeCoveredIndividual
import com.oracle.netsuite.jeck.domain.interactor.ApproveTimeOff
import com.oracle.netsuite.jeck.domain.interactor.CompleteOnboardingTask
import com.oracle.netsuite.jeck.presentation.PrinterPresenter
import com.oracle.netsuite.jeck.presentation.common.ViewModel
import java.time.LocalDate

interface LivingRoom
interface DiningRoom
interface Sewer
interface Plumbing
interface Electrical
interface MaidRoom
interface MasterBedroom
interface Bedroom
interface Garden
interface Garage

abstract class BasicHouse(){}

class SubdivisionHouse: BasicHouse(), LivingRoom, Garden, DiningRoom, Sewer, Plumbing, Electrical, MaidRoom, MasterBedroom, Garage {}
class StudioApartment: BasicHouse(), LivingRoom, DiningRoom, Bedroom {}
class TownHouse: BasicHouse(), LivingRoom, DiningRoom, MasterBedroom, Garage {}


interface Employee
interface Employer
interface SuiRate
interface Payroll
interface Paycheck

open class TaxFile(): Employee {
    /** common functionality of the tax files - all files have the employee */
}

class PeriodicTaxFile: TaxFile(), SuiRate, Payroll, Paycheck {
    /** interfaces implement specific handling for this file */
}
class QuarterlyTaxFile: TaxFile(), Employer, Payroll, Paycheck
class AnnualTaxFile: TaxFile(), Employer, Payroll, Paycheck

fun main(){
    val approvedTor: TimeOffRecord = ApproveTimeOff(88).execute()
    val finishedOnboardingTask: OnboardingTask = CompleteOnboardingTask(98).execute()
    val coveredIndividual: EmployeeCoveredIndividual = AddEmployeeCoveredIndividual(108, "Andres Bonifacio", LocalDate.now(), LocalDate.now()).execute()

    val viewModel: ViewModel = ViewModel(approvedTor, finishedOnboardingTask, coveredIndividual)

    PrinterPresenter().display(viewModel)
}
