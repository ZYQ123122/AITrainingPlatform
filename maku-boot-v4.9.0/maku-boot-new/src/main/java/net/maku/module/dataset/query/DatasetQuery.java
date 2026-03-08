package net.maku.module.dataset.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;

import java.time.LocalDateTime;

/**
 * 数据集查询条件（分页、筛选）
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "数据集查询")
public class DatasetQuery extends Query {
    @Schema(description = "数据集名称")
    private String datasetName;
    @Schema(description = "数据类型ID")
    private Integer dataTypeId;
    @Schema(description = "任务类型ID")
    private Integer taskTypeId;
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
}
