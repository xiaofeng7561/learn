package com.example.demo.entity;

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
@TableName("sys_user")
public class SysUserPo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 唯一标识
     */
    private String uid;

    /**
     * 设备别名
     */
    private String alias;

    /**
     * 登录的平台
     */
    private String platform;

    /**
     * 登录的标识
     */
    private String tag;

    /**
     * 登录的ip
     */
    private String ip;

    /**
     * 登录的时间
     */
    private LocalDateTime loginTime;

    /**
     * 用户的类型  0 主机端  1 分机端
     */
    private Integer type;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 禁用
     */
    private Boolean enable;

    private String version;


}
