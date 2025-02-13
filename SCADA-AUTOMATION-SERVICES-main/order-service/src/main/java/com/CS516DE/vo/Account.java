package com.CS516DE.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Address shippingAddress;
    private Payment preferredPaymentMethod;
}
