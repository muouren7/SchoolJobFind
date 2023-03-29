package com.example.schooljobfind.Common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private Integer userid; //消息发送者id标识符
    private String msg; //消息体
    private String sender;  //表示消息的发送者身份    包括我me,对方notme,系统system
    private Integer touserid;
}
