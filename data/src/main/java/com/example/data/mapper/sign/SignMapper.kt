package com.example.data.mapper.sign

import com.example.data.model.request.sign.RequestSignIn
import com.example.data.model.response.ResponseSignIn
import com.example.domain.model.sign.SignInData
import com.example.domain.model.sign.SignInItem

object SignMapper {

    //로그인
    fun mapperToSignInData(responseSignIn: ResponseSignIn): SignInData {
        return SignInData(
            status = responseSignIn.status,
            success = responseSignIn.success,
            accessToken = responseSignIn.data.accesstoken,
            refreshToken = responseSignIn.data.refreshtoken,
            user = SignInData.User(
                email = responseSignIn.data.user.email,
                firstMajorId = responseSignIn.data.user.firstMajorId,
                firstMajorName = responseSignIn.data.user.firstMajorName,
                isReviewed = responseSignIn.data.user.isReviewed,
                secondMajorId = responseSignIn.data.user.secondMajorId,
                secondMajorName = responseSignIn.data.user.secondMajorName,
                universityId = responseSignIn.data.user.universityId,
                userId = responseSignIn.data.user.userId,
                isEmailVerified = responseSignIn.data.user.isEmailVerified,
                isUserReported = responseSignIn.data.user.isUserReported,
                isReviewInappropriate = responseSignIn.data.user.isReviewInappropriate,
                message = responseSignIn.data.user.message
            )
        )
    }

    //SignIn
    fun mapperToSignIn(signInItem: SignInItem): RequestSignIn {
        return RequestSignIn(
            email = signInItem.email,
            password = signInItem.password,
            deviceToken = signInItem.deviceToken
        )
    }

}