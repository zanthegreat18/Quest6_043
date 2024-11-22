package com.tugas.quest6_043.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MahasiswaViewModel : ViewModel() {
    private val _dataModel = MutableStateFlow(Mahasiswa())
    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()