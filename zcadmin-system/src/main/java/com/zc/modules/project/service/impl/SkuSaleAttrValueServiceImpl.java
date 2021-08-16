package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SkuSaleAttrValueMapper;
import com.zc.modules.project.entity.SkuSaleAttrValue;
import com.zc.modules.project.service.SkuSaleAttrValueService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * sku销售属性&值 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueMapper, SkuSaleAttrValue> implements SkuSaleAttrValueService {

    private final SkuSaleAttrValueMapper skuSaleAttrValueMapper;

    /**
     * 查询sku销售属性&值信息
     *
     * @param id sku销售属性&值ID
     * @return sku销售属性&值信息
     */
    @Override
    public SkuSaleAttrValue selectByPrimaryKey(Long id) {
        return skuSaleAttrValueMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询sku销售属性&值列表
     *
     * @param record sku销售属性&值信息
     * @return sku销售属性&值集合
     */
    @Override
    public List<SkuSaleAttrValue> selectListBySelective(SkuSaleAttrValue record) {
        return skuSaleAttrValueMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询sku销售属性&值列表
     *
     * @param record sku销售属性&值信息
     * @param page mybatis-plus 分页对象
     * @return sku销售属性&值集合
     */
    @Override
    public IPage<SkuSaleAttrValue> selectPageBySelective(SkuSaleAttrValue record, Page page) {
        return skuSaleAttrValueMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询sku销售属性&值列表
     *
     * @param ids sku销售属性&值主键List集合
     * @return sku销售属性&值集合
     */
    @Override
    public List<SkuSaleAttrValue> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return skuSaleAttrValueMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record sku销售属性&值 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SkuSaleAttrValue record) {
        return skuSaleAttrValueMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record sku销售属性&值 信息
     * @return 插入数量
     */
    @Override
    public int insert(SkuSaleAttrValue record) {
        return skuSaleAttrValueMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record sku销售属性&值 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SkuSaleAttrValue record) {
        return skuSaleAttrValueMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList sku销售属性&值集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SkuSaleAttrValue> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuSaleAttrValue>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuSaleAttrValue> records : list) {
            int count = skuSaleAttrValueMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record sku销售属性&值 信息
     * @return 修改数量
     */
    @Override
    public int update(SkuSaleAttrValue record) {
        return skuSaleAttrValueMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record sku销售属性&值 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SkuSaleAttrValue record) {
        return skuSaleAttrValueMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList sku销售属性&值 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SkuSaleAttrValue> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuSaleAttrValue>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuSaleAttrValue> records : list) {
            int count = skuSaleAttrValueMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList sku销售属性&值 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SkuSaleAttrValue> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuSaleAttrValue>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuSaleAttrValue> records : listLists) {
            int count = skuSaleAttrValueMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id sku销售属性&值 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return skuSaleAttrValueMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids sku销售属性&值 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return skuSaleAttrValueMapper.deleteByPrimaryKeys(ids);
    }

}
