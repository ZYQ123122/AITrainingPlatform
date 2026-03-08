package net.maku.module.dataset.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 数据类型（下拉用）
 */
@Data
@Schema(description = "数据类型")
public class DictDataTypeVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    private Integer id;
    @Schema(description = "数据类型名称")
    private String dataTypeName;
    @Schema(description = "数据类型编码")
    private String dataTypeCode;
    @Schema(description = "排序")
    private Integer sort;
}
