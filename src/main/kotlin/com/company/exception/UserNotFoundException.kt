package com.company.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such a Order")  // 404
class UserNotFoundException(override val message: String?) : RuntimeException()