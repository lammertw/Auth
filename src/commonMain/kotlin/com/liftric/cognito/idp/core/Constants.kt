package com.liftric.cognito.idp.core

internal object Header {
    const val Authority = "authority"
    const val CacheControl = "cache-control"
    const val AmzUserAgent = "x-amz-user-agent"
    const val Useragent = "user-agent"
    const val Accept = "accept"
    const val SecFetchSite = "sec-fetch-site"
    const val SecFetchMode = "sec-fetch-mode"
    const val AcceptLanguage = "accept-language"
    const val Dnt = "dnt"
    const val AmzTarget = "x-amz-target"
    const val AmzJson = "application/x-amz-json-1.1"
}

internal enum class Authentication(val flow: String) {
    RefreshTokenAuth("REFRESH_TOKEN_AUTH"),
    UserPasswordAuth("USER_PASSWORD_AUTH")
}

internal enum class Request(val value: String) {
    SignIn("AWSCognitoIdentityProviderService.InitiateAuth"),
    SignUp("AWSCognitoIdentityProviderService.SignUp"),
    ConfirmSignUp("AWSCognitoIdentityProviderService.ConfirmSignUp"),
    ResendConfirmationCode("AWSCognitoIdentityProviderService.ResendConfirmationCode"),
    SignOut("AWSCognitoIdentityProviderService.GlobalSignOut"),
    RevokeToken("AWSCognitoIdentityProviderService.RevokeToken"),
    GetUser("AWSCognitoIdentityProviderService.GetUser"),
    ChangePassword("AWSCognitoIdentityProviderService.ChangePassword"),
    DeleteUser("AWSCognitoIdentityProviderService.DeleteUser"),
    UpdateUserAttributes("AWSCognitoIdentityProviderService.UpdateUserAttributes"),
    ForgotPassword("AWSCognitoIdentityProviderService.ForgotPassword"),
    ConfirmForgotPassword("AWSCognitoIdentityProviderService.ConfirmForgotPassword"),
    GetUserAttributeVerificationCode("AWSCognitoIdentityProviderService.GetUserAttributeVerificationCode"),
    VerifyUserAttribute("AWSCognitoIdentityProviderService.VerifyUserAttribute"),
    SetUserMFAPreference("AWSCognitoIdentityProviderService.SetUserMFAPreference"),
    AssociateSoftwareToken("AWSCognitoIdentityProviderService.AssociateSoftwareToken"),
    VerifySoftwareToken("AWSCognitoIdentityProviderService.VerifySoftwareToken"),
    RespondToAuthChallenge("AWSCognitoIdentityProviderService.RespondToAuthChallenge")
}

internal object AWSException {
    const val CodeMismatch = "CodeMismatchException"
    const val ConcurrentModification = "ConcurrentModificationException"
    const val EnableSoftwareTokenMFA = " EnableSoftwareTokenMFAException"
    const val ExpiredCode = "ExpiredCodeException"
    const val InternalError = "InternalErrorException"
    const val InvalidLambdaResponse = "InvalidLambdaResponseException"
    const val InvalidParameter = "InvalidParameterException"
    const val InvalidPassword = "InvalidPasswordException"
    const val InvalidUserPoolConfiguration = "InvalidUserPoolConfigurationException"
    const val LimitExceeded = "LimitExceededException"
    const val NotAuthorized = "NotAuthorizedException"
    const val PasswordResetRequired = "PasswordResetRequiredException"
    const val ResourceNotFound = "ResourceNotFoundException"
    const val SoftwareTokenMFANotFound = "SoftwareTokenMFANotFoundException"
    const val TooManyFailedAttempts = "TooManyFailedAttemptsException"
    const val TooManyRequests = "TooManyRequestsException"
    const val UnexpectedLambda = "UnexpectedLambdaException"
    const val UserLambdaValidation = "UserLambdaValidationException"
    const val UserNotConfirmed = "UserNotConfirmedException"
    const val UserNotFound = "UserNotFoundException"
}