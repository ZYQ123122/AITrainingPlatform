package net.maku.module.dataset.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 任务类型（下拉用，按数据类型过滤后使用）
 */
@Data
@Schema(description = "任务类型")
public class DictTaskTypeVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    private Integer id;
    @Schema(description = "任务类型名称")
    private String taskTypeName;
    @Schema(description = "任务类型编码")
    private String taskTypeCode;
    @Schema(description = "关联数据类型ID")
    private Integer dataTypeId;
    @Schema(description = "排序")
    private Integer sort;
}
