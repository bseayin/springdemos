package com.zz.vo;

import lombok.Data;

import java.math.BigInteger;

@Data
public class SelectResultVo {
    private BigInteger selectcount;
    private BigInteger user_id;
    private String type;
    private BigInteger starId;
    //形参selectcount  ，user_id
    public SelectResultVo(BigInteger selectcount, BigInteger user_id, String type, BigInteger starId) {
        this.selectcount = selectcount;
        this.user_id = user_id;
        this.type = type;
        this.starId = starId;
    }
    public SelectResultVo(BigInteger selectcount){
        this.selectcount = selectcount;
    } public SelectResultVo(){

    }
}
