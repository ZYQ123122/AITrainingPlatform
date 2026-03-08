package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;
/**
 * 数据集_文件关联表
 */

@Data
@TableName("dataset_file")
public class DatasetFileEntity {
    @TableId
    private String id;
    /** 所属数据集ID */
    private String datasetId;
    /** 文件名 */
    private String fileName;
    /** 文件状态（1=未标注，2=已标注）*/
    private Integer fileStatus;
    /** 文件存储路径*/
    private String filePath;
    /** 文件格式*/
    private String fileType;
    /** 文件大小*/
    private Integer fileSize;
    /** 导入类型：1=本地上传，2=云端导入，3=API拉取，4=从已有数据集导入*/
    private Integer importType;
    /** 导入人ID*/
    private String importUserId;
    /** 创建时间*/
    private LocalDateTime createTime;
}
