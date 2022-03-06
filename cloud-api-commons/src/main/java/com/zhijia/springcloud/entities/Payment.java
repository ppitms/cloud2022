package com.zhijia.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**实体类
 * @author zhijia
 * @create 2022-02-28 20:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment implements Serializable{//序列化，分布式部署用得到
    private Long id;
    private String serial;
}
