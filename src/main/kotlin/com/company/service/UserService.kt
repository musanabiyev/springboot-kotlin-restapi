package com.company.service

import com.company.model.UserDTO

interface UserService {
    fun getById(id: Int): UserDTO
    fun getUsers(maxRecords: Int?): List<UserDTO>
    fun createUser(userDTO: UserDTO): UserDTO
    fun updateUser(id: Int, userDTO: UserDTO): UserDTO
    fun patchUser(id: Int, userDTO: UserDTO): UserDTO
    fun deleteUserById(id: Int)
}