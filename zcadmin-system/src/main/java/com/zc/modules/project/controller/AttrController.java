package com.zc.modules.project.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.zc.annotation.Log;
import com.zc.entity.ResultResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import com.zc.modules.project.entity.Attr;
import com.zc.modules.project.service.AttrService;
/**
 * 商品属性 信息操作处理
 *
 * @author Zhang C
 * @date 2021-08-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/attr")
@Api(tags = "商品属性信息管理")
public class AttrController {
    private final AttrService attrService;

    @ApiOperationSupport(order = 1)
    @GetMapping("/id")
    @ApiOperation("根据主键获得对象数据")
    @Log("商品属性信息管理:根据主键获得对象数据")
    @PreAuthorize("@el.check('attr:getRecordById')")
    public ResultResponse getRecordById(Long id) {
        Attr result = attrService.selectByPrimaryKey(id);
        if (result != null) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @GetMapping
    @ApiOperation("根据条件查询得到对象集合")
    @Log("商品属性信息管理:根据条件查询得到对象集合")
    @PreAuthorize("@el.check('attr:getListByParam')")
    public ResultResponse getListByParam(Attr record) {
        List<Attr> result = attrService.selectListBySelective(record);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }


    @GetMapping("/ids")
    @ApiOperation("根据id集合获得目标数据集合")
    @Log("商品属性信息管理:根据id集合获得目标数据集合")
    @PreAuthorize("@el.check('attr:getListByIds')")
    public ResultResponse getListByIds(@RequestParam(value = "ids" ,required=false)List<Long> ids) {
        List<Attr> result = attrService.selectByPrimaryKeys(ids);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @ApiOperation("分页获得目标数据集合")
    @GetMapping("page")
    @Log("商品属性信息管理:分页获得目标数据集合")
    @PreAuthorize("@el.check('attr:getPageByParam')")
    public ResultResponse getPageByParam(Attr record, Page page) {
        IPage<Attr> recordIPage = attrService.selectPageBySelective(record, page);
        return ResultResponse.success(recordIPage);
    }

    @Log("商品属性信息管理:根据条件查询符合数据的数量")
    @GetMapping("count")
    @ApiOperation("根据条件查询符合数据的数量")
    @PreAuthorize("@el.check('attr:getCount')")
    public ResultResponse getCount(Attr record) {
        int result = attrService.selectCountBySelective(record);
        return ResultResponse.success(result);
    }

    @ApiOperation("插入单条数据")
    @PostMapping
    @Log("商品属性信息管理:插入单条数据")
    @PreAuthorize("@el.check('attr:insert')")
    public ResultResponse insert(@RequestBody Attr record) {
        int result = attrService.insert(record);
        if (result > 0) {
            return ResultResponse.success(record);
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量插入数据")
    @PostMapping("batch")
    @Log("商品属性信息管理:批量插入数据")
    @PreAuthorize("@el.check('attr:insertBatch')")
    public ResultResponse insertBatch(@RequestBody List<Attr> records) {
        int result = attrService.insertBatch(records);
        if (result > 0) {
            return ResultResponse.success(records);
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据")
    @PutMapping
    @Log("商品属性信息管理:修改数据")
    @PreAuthorize("@el.check('attr:update')")
    public ResultResponse update(@RequestBody Attr record) {
        int result = attrService.update(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据,仅修改不为null的数据")
    @PutMapping("/selective")
    @Log("商品属性信息管理:修改部分数据")
    @PreAuthorize("@el.check('attr:updateBySelective')")
    public ResultResponse updateBySelective(@RequestBody Attr record) {
        int result = attrService.updateBySelective(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量修改数据")
    @PutMapping("batch")
    @Log("商品属性信息管理:批量修改数据")
    @PreAuthorize("@el.check('attr:updateBatch')")
    public ResultResponse updateBatch(@RequestBody List<Attr> records) {
        int result = attrService.updateBatch(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    //如果某批数据中,有一个数据属性存在值,其他数据的属性不存在值,那么最终修改结果为其他数据的该属性将设为null值
    @ApiOperation("批量修改数据,仅修改部分属性")
    @PutMapping("batch/selective")
    @Log("商品属性信息管理:批量修改数据的部分属性")
    @PreAuthorize("@el.check('attr:updateBatchBySelective')")
    public ResultResponse updateBatchBySelective(@RequestBody List<Attr> records) {
        int result = attrService.updateBatchBySelective(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("删除数据")
    @DeleteMapping()
    @Log("商品属性信息管理:删除数据")
    @PreAuthorize("@el.check('attr:delete')")
    public ResultResponse delete(Long id) {
        int result = attrService.deleteByPrimaryKey(id);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("根据主键集合批量删除数据")
    @DeleteMapping("ids")
    @Log("商品属性信息管理:根据主键集合批量删除数据")
    @PreAuthorize("@el.check('attr:deleteByIds')")
    public ResultResponse deleteByIds(@RequestBody List<Long> ids) {
        int result = attrService.deleteByPrimaryKeys(ids);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }


}
