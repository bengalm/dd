package com.remind.dd.pojo;

import lombok.Data;

@Data
public class MarkDownModel {
    /**
     * 首屏会话透出的展示内容
     */
    private String title;

    /**
     * markdown格式的消息
     */
    private String text;
}
