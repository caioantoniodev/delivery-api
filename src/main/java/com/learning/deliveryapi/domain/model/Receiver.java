package com.learning.deliveryapi.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@Embeddable
public class Receiver {

    @Column(name = "receiver_name")
    private String name;

    @Column(name = "receiver_street")
    private String street;

    @Column(name = "receiver_number")
    private String number;

    @Column(name = "receiver_complement")
    private String complement;

    @Column(name = "receiver_neighbourhood")
    private String neighbourhood;
}
