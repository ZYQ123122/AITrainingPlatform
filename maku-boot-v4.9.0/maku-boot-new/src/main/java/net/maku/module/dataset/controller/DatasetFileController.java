package net.maku.module.dataset.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.module.dataset.service.DatasetFileService;
import net.maku.module.dataset.vo.DatasetFileVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 数据集文件管理控制器（文件不支持查询，只是浏览）
 */
@RestController
@RequestMapping("dataset/file")
@Tag(name = "数据集文件管理")
@AllArgsConstructor
public class DatasetFileController {

    private final DatasetFileService datasetFileService;

    /**
     * 根据文件名浏览数据集文件列表（不支持查询，只是浏览）
     * 
     * @param fileName 文件名（可为空，为空则浏览所有文件）
     * @return 数据集文件 vo对象
     */
    @GetMapping("list")
    @Operation(summary = "浏览文件列表")
    public Result<List<DatasetFileVO>> listByFileName(@RequestParam(required = false) String fileName) {
        return Result.ok(datasetFileService.listByFileName(fileName));
    }

    /**
     * 新增数据集文件
     * 
     * @param file 数据集文件 vo对象（必填：文件名、文件状态、文件存储路径、文件格式、文件大小、导入类型）
     * @return 操作结果
     */
    @PostMapping
    @Operation(summary = "新增数据集文件")
    public Result<String> save(@RequestBody @Valid DatasetFileVO file) {
        datasetFileService.save(file);
        return Result.ok();
    }

    /**
     * 修改数据集文件信息
     * 
     * @param file 数据集文件 vo对象（必填：文件ID）
     * @return 操作结果
     */
    @PutMapping
    @Operation(summary = "修改数据集文件")
    public Result<String> update(@RequestBody @Valid DatasetFileVO file) {
        datasetFileService.update(file);
        return Result.ok();
    }

    /**
     * 批量删除数据集文件
     * 
     * @param idList 文件ID列表
     * @return 操作结果
     */
    @DeleteMapping
    @Operation(summary = "批量删除数据集文件")
    public Result<String> delete(@RequestBody List<String> idList) {
        datasetFileService.delete(idList);
        return Result.ok();
    }
}
