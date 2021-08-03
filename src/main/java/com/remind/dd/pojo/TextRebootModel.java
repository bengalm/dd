package com.remind.dd.pojo;

import lombok.Data;

@Data
public class TextRebootModel {
    /**
     * 此消息类型为固定text
     */
    public String msgtype = "text";

    public ContentModel text;

    public AtMobiles at;
}
