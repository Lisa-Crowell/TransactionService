package com.fintechdemo.webapp.transactionservice.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.fintechdemo.webapp.transactionservice.entities.CurrencyValue;
import com.fintechdemo.webapp.transactionservice.entities.UserEntity;
import lombok.Data;


@Data
public class AccountDTO implements Serializable {

    private UserEntity user;
    private String id;
    private boolean activeStatus;
    private CurrencyValue balance;
    private Integer interest;
    private String nickname;
    private LocalDate createDate;
    private String type;

}
