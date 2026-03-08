package net.maku.module.dataset.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;

import java.time.LocalDateTime;
/**
 * 标注任务查询条件（分页、筛选）
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "标注任务查询")
public class AnnotationTaskQuery extends Query{
    @Schema(description = "标注任务名称")
    private String taskName;
    @Schema(description = "数据类型ID")
    private Integer dataTypeId;
    @Schema(description = "任务类型ID")
    private Integer taskTypeId;
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
}
