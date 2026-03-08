package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;
/**
 * 数据集关联表
 */
@Data
@TableName("dataset_relationship")
public class DatasetRelationshipEntity {
    @TableId
    private String id;
    /** 源数据集ID */
    private String sourceDatasetId;
    /** 目标数据集ID */
    private String targetDatasetId;
    /** 关系类型 */
    private String relationshipType;
    /** 关系描述*/
    private String relationshipDescription;
    /** 创建人ID*/
    private String createUserId;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新人ID */
    private String updateUserId;
    /** 更新时间 */
    private LocalDateTime updateTime;
}
