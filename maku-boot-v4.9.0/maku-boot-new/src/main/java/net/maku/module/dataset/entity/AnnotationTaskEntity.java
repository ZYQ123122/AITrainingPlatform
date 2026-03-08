package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 标注任务表
 */
@Data
@TableName("annotation_task")
public class AnnotationTaskEntity {
    @TableId
    private String id;
    /** 标注任务名称 */
    private String taskName;
    /** 关联数据集ID */
    private String datasetId;
    /** 状态（1=未开始，2=进行中，3=已结束） */
    private Integer status;
    /** 标注进度 */
    private Integer progress;
    /** 该任务的总文件数（先统计dataset_file WHERE dataset_id = 该任务dataset_id的记录数，赋值给total_file_count（总文件数）） */
    private Integer totalFileCount;
    /** 已标注文件数（新增标注结果时自动 + 1） */
    private Integer annotatedCount;
    /** 创建人ID */
    private String createUserId;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;
}
