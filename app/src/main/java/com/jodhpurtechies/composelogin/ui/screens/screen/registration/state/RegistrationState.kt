package com.jodhpurtechies.composelogin.ui.screens.screen.registration.state

import com.jodhpurtechies.composelogin.ui.common.state.ErrorState

/**
 * Registration State holding ui input values
 */
data class RegistrationState(
    val emailId: String = "",
    val nickname: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    val errorState: RegistrationErrorState = RegistrationErrorState(),
    val isRegistrationSuccessful: Boolean = false
)

/**
 * Error state in registration holding respective
 * text field validation errors
 */
data class RegistrationErrorState(
    val emailIdErrorState: ErrorState = ErrorState(),
    val nicknameErrorState: ErrorState = ErrorState(),
    val passwordErrorState: ErrorState = ErrorState(),
    val confirmPasswordErrorState: ErrorState = ErrorState()
)