package com.oracle.netsuite.jeck.presentation

import com.oracle.netsuite.jeck.presentation.common.BasePresenter
import com.oracle.netsuite.jeck.presentation.common.ViewModel

class PrinterPresenter: BasePresenter {
    override fun display(viewModel: ViewModel){
        println(viewModel.toString())
    }
}