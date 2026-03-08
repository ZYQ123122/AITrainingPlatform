package net.maku.module.dataset.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.module.dataset.query.AnnotationTaskQuery;
import net.maku.module.dataset.service.AnnotationTaskService;
import net.maku.module.dataset.vo.AnnotationTaskVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标注任务管理控制器
 */
@RestController
@RequestMapping("dataset/annotation-task")
@Tag(name = "标注任务管理")
@AllArgsConstructor
public class AnnotationTaskController {

    private final AnnotationTaskService annotationTaskService;

    /**
     * 分页查询标注任务列表
     * 
     * @param query 查询条件（分页参数：page、limit；筛选条件：标注任务名称、数据类型ID、任务类型ID、创建时间）
     * @return 分页结果，包含总记录数和当前页的标注任务列表
     */
    @GetMapping("page")
    @Operation(summary = "分页查询")
    public Result<PageResult<AnnotationTaskVO>> page(@ParameterObject @Valid AnnotationTaskQuery query) {
        return Result.ok(annotationTaskService.page(query));
    }

    /**
     * 根据ID查询标注任务详情
     * 
     * @param id 标注任务ID
     * @return 标注任务 vo对象
     */
    @GetMapping("{id}")
    @Operation(summary = "查询详情")
    public Result<AnnotationTaskVO> getById(@PathVariable String id) {
        return Result.ok(annotationTaskService.getAnnotationTaskById(id));
    }

    /**
     * 新增标注任务
     * 
     * @param vo 标注任务 vo对象（必填：标注任务名称、关联数据集ID、状态、标注进度、总文件数、已标注文件数；创建人ID、创建时间由后端填充）
     * @return 操作结果
     */
    @PostMapping
    @Operation(summary = "新增标注任务")
    public Result<String> save(@RequestBody @Valid AnnotationTaskVO vo) {
        annotationTaskService.save(vo);
        return Result.ok();
    }

    /**
     * 修改标注任务信息
     * 
     * @param vo 标注任务 vo对象（必填：标注任务ID；更新时间由后端填充）
     * @return 操作结果
     */
    @PutMapping
    @Operation(summary = "修改标注任务")
    public Result<String> update(@RequestBody @Valid AnnotationTaskVO vo) {
        annotationTaskService.update(vo);
        return Result.ok();
    }

    /**
     * 批量删除标注任务
     * 
     * @param idList 标注任务ID列表
     * @return 操作结果
     */
    @DeleteMapping
    @Operation(summary = "批量删除标注任务")
    public Result<String> delete(@RequestBody List<String> idList) {
        annotationTaskService.delete(idList);
        return Result.ok();
    }
}
