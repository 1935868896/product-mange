package com.zc.modules.project.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.zc.annotation.Log;
import com.zc.entity.ResultResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import com.zc.modules.project.entity.AttrGroup;
import com.zc.modules.project.service.AttrGroupService;
/**
 * 属性分组 信息操作处理
 *
 * @author Zhang C
 * @date 2021-08-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/attrGroup")
@Api(tags = "属性分组信息管理")
public class AttrGroupController {
    private final AttrGroupService attrGroupService;

    @GetMapping("/id")
    @ApiOperation("根据主键获得对象数据")
    @Log("属性分组信息管理:根据主键获得对象数据")
    @PreAuthorize("@el.check('attrGroup:getRecordById')")
    public ResultResponse getRecordById(Long id) {
        AttrGroup result = attrGroupService.selectByPrimaryKey(id);
        if (result != null) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @GetMapping
    @ApiOperation("根据条件查询得到对象集合")
    @Log("属性分组信息管理:根据条件查询得到对象集合")
    @PreAuthorize("@el.check('attrGroup:getListByParam')")
    public ResultResponse getListByParam(AttrGroup record) {
        List<AttrGroup> result = attrGroupService.selectListBySelective(record);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }


    @GetMapping("/ids")
    @ApiOperation("根据id集合获得目标数据集合")
    @Log("属性分组信息管理:根据id集合获得目标数据集合")
    @PreAuthorize("@el.check('attrGroup:getListByIds')")
    public ResultResponse getListByIds(@RequestParam(value = "ids" ,required=false)List<Long> ids) {
        List<AttrGroup> result = attrGroupService.selectByPrimaryKeys(ids);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @ApiOperation("分页获得目标数据集合")
    @GetMapping("page")
    @Log("属性分组信息管理:分页获得目标数据集合")
    @PreAuthorize("@el.check('attrGroup:getPageByParam')")
    public ResultResponse getPageByParam(AttrGroup record, Page page) {
        IPage<AttrGroup> recordIPage = attrGroupService.selectPageBySelective(record, page);
        return ResultResponse.success(recordIPage);
    }

    @Log("属性分组信息管理:根据条件查询符合数据的数量")
    @GetMapping("count")
    @ApiOperation("根据条件查询符合数据的数量")
    @PreAuthorize("@el.check('attrGroup:getCount')")
    public ResultResponse getCount(AttrGroup record) {
        int result = attrGroupService.selectCountBySelective(record);
        return ResultResponse.success(result);
    }

    @ApiOperation("插入单条数据")
    @PostMapping
    @Log("属性分组信息管理:插入单条数据")
    @PreAuthorize("@el.check('attrGroup:insert')")
    public ResultResponse insert(@RequestBody AttrGroup record) {
        int result = attrGroupService.insert(record);
        if (result > 0) {
            return ResultResponse.success(record);
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量插入数据")
    @PostMapping("batch")
    @Log("属性分组信息管理:批量插入数据")
    @PreAuthorize("@el.check('attrGroup:insertBatch')")
    public ResultResponse insertBatch(@RequestBody List<AttrGroup> records) {
        int result = attrGroupService.insertBatch(records);
        if (result > 0) {
            return ResultResponse.success(records);
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据")
    @PutMapping
    @Log("属性分组信息管理:修改数据")
    @PreAuthorize("@el.check('attrGroup:update')")
    public ResultResponse update(@RequestBody AttrGroup record) {
        int result = attrGroupService.update(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据,仅修改不为null的数据")
    @PutMapping("/selective")
    @Log("属性分组信息管理:修改部分数据")
    @PreAuthorize("@el.check('attrGroup:updateBySelective')")
    public ResultResponse updateBySelective(@RequestBody AttrGroup record) {
        int result = attrGroupService.updateBySelective(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量修改数据")
    @PutMapping("batch")
    @Log("属性分组信息管理:批量修改数据")
    @PreAuthorize("@el.check('attrGroup:updateBatch')")
    public ResultResponse updateBatch(@RequestBody List<AttrGroup> records) {
        int result = attrGroupService.updateBatch(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    //如果某批数据中,有一个数据属性存在值,其他数据的属性不存在值,那么最终修改结果为其他数据的该属性将设为null值
    @ApiOperation("批量修改数据,仅修改部分属性")
    @PutMapping("batch/selective")
    @Log("属性分组信息管理:批量修改数据的部分属性")
    @PreAuthorize("@el.check('attrGroup:updateBatchBySelective')")
    public ResultResponse updateBatchBySelective(@RequestBody List<AttrGroup> records) {
        int result = attrGroupService.updateBatchBySelective(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("删除数据")
    @DeleteMapping()
    @Log("属性分组信息管理:删除数据")
    @PreAuthorize("@el.check('attrGroup:delete')")
    public ResultResponse delete(Long id) {
        int result = attrGroupService.deleteByPrimaryKey(id);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("根据主键集合批量删除数据")
    @DeleteMapping("ids")
    @Log("属性分组信息管理:根据主键集合批量删除数据")
    @PreAuthorize("@el.check('attrGroup:deleteByIds')")
    public ResultResponse deleteByIds(@RequestBody List<Long> ids) {
        int result = attrGroupService.deleteByPrimaryKeys(ids);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }


}
