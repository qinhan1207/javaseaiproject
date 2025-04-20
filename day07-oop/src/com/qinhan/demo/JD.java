package com.qinhan.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 家电
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD implements Switch{
    private String name;
    // 状态：开和关。
    private boolean status; // 默认为false，代表没有通电

    // 控制当前设备开和关
    @Override
    public void press() {
        status = !status;
    }
}
