package com.lry.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liurenyi
 * @create 2019--12--26--10:18
 */
//自定义消息提示
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage {
    //响应码
    private int code;
    //响应新信息
    private String msg;
    //响应数据
    private Object data;
}
