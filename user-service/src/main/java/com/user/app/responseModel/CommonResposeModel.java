package com.user.app.responseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResposeModel {

    private int resposeCode;
    private String resposeMessage;
    private long id;
}
