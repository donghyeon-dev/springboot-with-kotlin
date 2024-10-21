package com.autocat.springbootwithkotlin.domain

import jakarta.persistence.Column
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Member {

    @Id
    private var id: Long? = null

    @Column(name = "NAME")
    private var username: String? = null
}