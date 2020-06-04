package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author auto_generate
 * @since 2020-06-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_mission")
public class SysMissionPo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 工单的状态
     */
    private Integer status;

    /**
     * 工单发布者
     */
    private String issuer;

    /**
     * 接单成功后的接单人
     */
    private String receiver;

    /**
     * 工单的内容
     */
    private String content;

    private LocalDateTime receiveTime;

    private LocalDateTime endTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 派送号码
     */
    private String slave;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 联系人号码
     */
    private String contacts;

    /**
     * 接收对象队名
     */
    private String receivePartName;

    /**
     * 指派对象队名
     */
    private String slavePartName;

    /**
     * 指派时间
     */
    private LocalDateTime distributeTime;

    /**
     * 外部待转时间
     */
    private LocalDateTime transferTime;

    private String transferUser;

    private String transferPartName;


}
