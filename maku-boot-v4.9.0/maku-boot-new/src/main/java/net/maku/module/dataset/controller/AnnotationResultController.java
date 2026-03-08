package net.maku.module.dataset.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.module.dataset.service.AnnotationResultService;
import net.maku.module.dataset.vo.AnnotationResultVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标注结果管理控制器（标注结果不支持查询，只是浏览）
 */
@RestController
@RequestMapping("dataset/annotation-result")
@Tag(name = "标注结果管理")
@AllArgsConstructor
public class AnnotationResultController {

    private final AnnotationResultService annotationResultService;
    /**
     * 根据文件名浏览标注结果列表
     * 
     * @param fileName 文件名
     * @return 标注结果 vo对象
     */
    @GetMapping("list")
    @Operation(summary = "浏览标注结果列表")
    public Result<List<AnnotationResultVO>> listByFileName(@RequestParam(required = false) String fileName) {
        return Result.ok(annotationResultService.listByFileName(fileName));
    }

    /**
     * 新增标注结果
     * 
     * @param vo 标注结果 vo对象（必填：关联标注任务ID、关联数据集文件ID、数据集ID、标注内容、标注类型）
     * @return 操作结果
     */
    @PostMapping
    @Operation(summary = "新增标注结果")
    public Result<String> save(@RequestBody @Valid AnnotationResultVO vo) {
        annotationResultService.save(vo);
        return Result.ok();
    }

    /**
     * 修改标注结果
     * 
     * @param vo 标注结果 vo对象（必填：标注结果ID）
     * @return 操作结果
     */
    @PutMapping
    @Operation(summary = "修改标注结果")
    public Result<String> update(@RequestBody @Valid AnnotationResultVO vo) {
        annotationResultService.update(vo);
        return Result.ok();
    }

    /**
     * 批量删除标注结果
     * 
     * @param idList 标注结果ID列表
     * @return 操作结果
     */
    @DeleteMapping
    @Operation(summary = "批量删除标注结果")
    public Result<String> delete(@RequestBody List<String> idList) {
        annotationResultService.delete(idList);
        return Result.ok();
    }
}
