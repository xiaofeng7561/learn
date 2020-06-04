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
@TableName("sys_party")
public class SysPartyPo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 主机手机号
     */
    private String master;

    /**
     * 分机手机号
     */
    private String slave;

    /**
     * 队伍名称
     */
    private String partyName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private BigDecimal longitude;

    private BigDecimal latitude;

    /**
     * 朝向
     */
    private BigDecimal orientation;

    private String net;


}
